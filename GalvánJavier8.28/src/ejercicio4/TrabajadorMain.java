package ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class TrabajadorMain {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ArrayList<Trabajador> lista = new ArrayList<>();
		
		generarTrabajadores(lista);

        System.out.println("=== TRABAJADORES GENERADOS ===");
        for (Trabajador t : lista) {
            System.out.println(t);
        }

  
        System.out.print("\nIntroduce sexo (masculino/femenino): ");
        String sexo = entrada.nextLine();
        System.out.println("Cantidad: " + contarPorSexo(lista, sexo));

   
        System.out.print("\nIntroduce estado civil (soltero/casado/viudo/divorciado): ");
        String estado = entrada.nextLine();
        System.out.println("Cantidad: " + contarPorEstado(lista, estado));


        System.out.print("\nIntroduce edad inicial del rango: ");
        int edadInicio = entrada.nextInt();
        System.out.print("Introduce edad final del rango: ");
        int edadFin = entrada.nextInt();
        System.out.println("Cantidad: " + contarPorRangoEdad(lista, edadInicio, edadFin));

        entrada.nextLine(); 

     
        System.out.print("\nIntroduce sexo: ");
        sexo = entrada.nextLine();
        System.out.print("Introduce estado civil: ");
        estado = entrada.nextLine();
        System.out.println("Cantidad: " + contarSexoEstado(lista, sexo, estado));

        
    }

    public static void generarTrabajadores(ArrayList<Trabajador> lista) {
        String[] nombres = {"Ana", "Luis", "Carlos", "Marta", "Lucía", "Pedro", "Sofía", "Jorge"};
        String[] sexos = {"masculino", "femenino"};
        String[] estados = {"soltero", "casado", "viudo", "divorciado"};

        int cantidad = (int)(Math.random() * 11) + 20;

        for (int i = 0; i < cantidad; i++) {
            String nombre = nombres[(int)(Math.random() * nombres.length)];
            String sexo = sexos[(int)(Math.random() * sexos.length)];
            String estado = estados[(int)(Math.random() * estados.length)];
            int edad = (int)(Math.random() * 60) + 18;
            int salarioBase = (int)(Math.random() * 5000) + 1000; 

            lista.add(new Trabajador(nombre, edad, sexo, estado, salarioBase));
        }
    }

    public static int contarPorSexo(ArrayList<Trabajador> lista, String sexo) {
        int contador = 0;
        for (Trabajador t : lista) {
            if (t.getSexo().equalsIgnoreCase(sexo)) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPorEstado(ArrayList<Trabajador> lista, String estado) {
        int contador = 0;
        for (Trabajador t : lista) {
            if (t.getEstadoCivil().equalsIgnoreCase(estado)) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarPorRangoEdad(ArrayList<Trabajador> lista, int inicio, int fin) {
        int contador = 0;
        for (Trabajador t : lista) {
            if (t.getEdad() >= inicio && t.getEdad() <= fin) {
                contador++;
            }
        }
        return contador;
    }

    public static int contarSexoEstado(ArrayList<Trabajador> lista, String sexo, String estado) {
        int contador = 0;
        for (Trabajador t : lista) {
            if (t.getSexo().equalsIgnoreCase(sexo) && t.getEstadoCivil().equalsIgnoreCase(estado)) {
                contador++;
            }
        }
        return contador;
    }
}