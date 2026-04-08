package ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import ejercicio2.Agenda;

public class AgendaLinkedHashSetMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        LinkedHashSet<Agenda> contactos = new LinkedHashSet<>();

        contactos.add(new Agenda("Juan", "600000001", "juan@gmail.com", "12/05/2000"));
        contactos.add(new Agenda("Ana", "600000002", "ana@gmail.com", "03/08/1999"));
        contactos.add(new Agenda("Luis", "600000003", "luis@gmail.com", "21/11/2001"));
        contactos.add(new Agenda("Maria", "600000004", "maria@gmail.com", "15/02/2000"));
        contactos.add(new Agenda("Pedro", "600000005", "pedro@gmail.com", "30/07/1998"));

        for (int i = 6; i <= 25; i++) {
            contactos.add(new Agenda("Nombre" + i, "6000000" + i,
                    "correo" + i + "@gmail.com", i + "/01/200" + i));
        }

        int opcion;

        do {
            System.out.println("\n --Menú Agenda--");
            System.out.println("1. Ingresar contacto");
            System.out.println("2. Consultar nombre");
            System.out.println("3. Mostrar ordenados");
            System.out.println("4. Buscar por año");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    ingresarContacto(entrada, contactos);
                    break;
                case 2:
                    consultarNombre(entrada, contactos);
                    break;
                case 3:
                    mostrarOrdenados(contactos);
                    break;
                case 4:
                    buscarPorAnyo(entrada, contactos);
                    break;
            }

        } while (opcion != 0);
    }

    static void ingresarContacto(Scanner entrada, LinkedHashSet<Agenda> contactos) {

        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Teléfono (único): ");
        String telefono = entrada.nextLine();

        System.out.print("Email: ");
        String email = entrada.nextLine();

        System.out.print("Fecha nacimiento: ");
        String fechaNacimiento = entrada.nextLine();

        Agenda nuevo = new Agenda(nombre, telefono, email, fechaNacimiento);

        if (!contactos.add(nuevo)) {
            System.out.println("❌ El teléfono ya existe (duplicado).");
        } else {
            System.out.println("✅ Contacto añadido.");
        }
    }

    static void consultarNombre(Scanner entrada, LinkedHashSet<Agenda> contactos) {

        System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();

        for (Agenda c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(c);
            }
        }
    }

    static void mostrarOrdenados(LinkedHashSet<Agenda> contactos) {

        ArrayList<Agenda> lista = new ArrayList<>(contactos);
        Collections.sort(lista);

        for (Agenda c : lista) {
            System.out.println(c);
        }
    }

    static void buscarPorAnyo(Scanner entrada, LinkedHashSet<Agenda> contactos) {

        System.out.print("Ingrese año (yyyy): ");
        String anio = entrada.nextLine();

        boolean encontrado = false;

        for (Agenda c : contactos) {
            String fecha = c.getFechaNacimiento();
            String anioContacto = fecha.substring(fecha.length() - 4);

            if (anioContacto.equals(anio)) {
                System.out.println(c);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay contactos en ese año.");
        }
    }


	}


