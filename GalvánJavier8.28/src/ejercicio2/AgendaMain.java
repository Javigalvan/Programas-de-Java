package ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


import ejercicio1.Atleta;

public class AgendaMain {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
	
		LinkedList<Agenda> contactos = new LinkedList<>();
		

		contactos.add(new Agenda("Juan", "600000001", "juan@gmail.com", "12/05/2000"));
        contactos.add(new Agenda("Ana", "600000002", "ana@gmail.com", "03/08/1999"));
        contactos.add(new Agenda("Luis", "600000003", "luis@gmail.com", "21/11/2001"));
        contactos.add(new Agenda("Maria", "600000004", "maria@gmail.com", "15/02/2000"));
        contactos.add(new Agenda("Pedro", "600000005", "pedro@gmail.com", "30/07/1998"));

        
        for (int i = 6; i <= 25; i++) {
            contactos.add(new Agenda("Nombre" + i,"6000000" + i,"correo" + i + "@gmail.com", i + "/01/200" + i));
        }
        
        int opcion;
        
        do {
        	
        
        System.out.println("\n --Menú Agenda--");
        System.out.println("1. Ingresar contacto");
        System.out.println("2. Consultar nombre");
        System.out.println("3. ");
        System.out.println("4. ");
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
        }
        
        } while(opcion!=0);

        
}
	static void ingresarContacto(Scanner entrada, LinkedList contactos) {
        System.out.print("Nombre: ");
        String nombre = entrada.nextLine();

        String telefono;
        do {
            System.out.print("Teléfono (único): ");
            telefono = entrada.nextLine();
        } while (!telefonoUnico(telefono, contactos));

        System.out.print("Email: ");
        String email = entrada.nextLine();

        System.out.print("fecha nacimiento: ");
        String fechaNacimiento = entrada.nextLine();


        contactos.add(new Agenda(nombre, telefono, email, fechaNacimiento));
    }
	static boolean telefonoUnico(String tel, LinkedList<Agenda> contactos) {
        for (Agenda c : contactos) {
            if (c.telefono.equals(tel)) {
                System.out.println("Teléfono ya existe.");
                return false;
            }
        }
        return true;
    }
	static void consultarNombre(Scanner entrada, LinkedList<Agenda> contactos) {
		
		System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();
		
		for (Agenda c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
            	System.out.println(c);
            }
		}
	}
	static void mostrarOrdenados(LinkedList<Agenda> contactos) {
        ArrayList<Agenda> copia = new ArrayList<>(contactos);
        
        
        
	}

}

