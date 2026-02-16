package ejercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		try {
           
            Coche coche1 = new Coche();
            coche1.setMatricula("1234 ABC");
            coche1.setNombrePropietario("Juan Pérez");
            coche1.setCilindrada(1800);
            coche1.setPotencia(120);

            System.out.println("Coche 1:");
            System.out.println(coche1.toString());

           
            Coche coche2 = new Coche(2500, 200);
            coche2.setMatricula("5678 DEF");
            coche2.setNombrePropietario("María López");

            System.out.println("\nCoche 2:");
            System.out.println(coche2);

           
            System.out.println("\nIntentando introducir valores no válidos...");
            coche2.setCilindrada(-1000);  
            coche2.setPotencia(-50);      

        } catch (Exception e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

 
        System.out.println("\n=== CREACIÓN DEPORTIVO ===");

        Deportivo deportivo = obtenerDeportivo();
        System.out.println("\nDeportivo creado:");
        System.out.println(deportivo);
    }

    public static Deportivo obtenerDeportivo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce matrícula (formato 9999 AAA): ");
        String matricula = sc.nextLine();

        System.out.print("Introduce nombre del propietario: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce cilindrada: ");
        int cilindrada = sc.nextInt();

        System.out.print("Introduce potencia: ");
        int potencia = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Introduce tracción (total/delantera): ");
        String traccion = sc.nextLine();

        Deportivo deportivo = null;

        try {
            deportivo = new Deportivo(cilindrada, potencia, traccion);
            deportivo.setMatricula(matricula);
            deportivo.setNombrePropietario(nombre);
        } catch (Exception e) {
            System.out.println("Error al crear el deportivo: " + e.getMessage());
        }

        return deportivo;

	}

}
