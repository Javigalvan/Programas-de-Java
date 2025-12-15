package Galvan;

import java.util.Scanner;

public class ejercicio2bien {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int anio = 0;
        int contadorInvalidos = 0;
        final int ANIO_ACTUAL = 2025;

 

        // Bucle que se ejecuta mientras el usuario no pida salir
        // y no haya cometido tres errores consecutivos
        while (anio != -1 && contadorInvalidos < 3) {
            System.out.print("Introduce un año (-1 para salir): ");
            anio = entrada.nextInt();

            // Si el usuario decide salir, no se hace nada más
            if (anio == -1) {
                System.out.println("Has decidido finalizar el programa.");
            } 
            // Si el año no es válido
            else if (anio < 1801 || anio > 2100) {
                contadorInvalidos++;
                System.out.println("Año no válido. Debe estar entre 1801 y 2100.");
                // No hacemos break, el bucle se detendrá solo si contadorInvalidos == 3
            } 
            // Si el año es válido
            else {
                contadorInvalidos = 0; // Reiniciamos contador de errores

                // Determinar el siglo
                String siglo;
                if (anio <= 1900) siglo = "XIX";
                else if (anio <= 2000) siglo = "XX";
                else siglo = "XXI";

                // Comparación con el año actual
                if (anio == ANIO_ACTUAL)
                    System.out.println("El año " + anio + " coincide con el año actual.");
                else if (anio < ANIO_ACTUAL)
                    System.out.println("El año " + anio + " es anterior al actual. Han pasado " 
                                        + (ANIO_ACTUAL - anio) + " años.");
                else
                    System.out.println("El año " + anio + " es posterior al actual. Faltan " 
                                        + (anio - ANIO_ACTUAL) + " años.");

                // Mostrar el siglo
                System.out.println("El año " + anio + " pertenece al siglo " + siglo + ".\n");
            }
        }

        // Si sale por 3 años inválidos consecutivos
        if (contadorInvalidos == 3) {
            System.out.println("\nSe han introducido tres años no válidos consecutivos.");
            System.out.println("El programa finalizará por error de entrada.");
        }

		
		
	}
}