/*
 * Descripción:  Un programa  que lee una secuencia de notas (con valores que van de 0 a 10) que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 * Autor: Javi
 * Fecha: 23/10/25
 */	

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		int diez = 0;
	
		
		do {
            System.out.print("Introduce una nota (0-10): ");
            nota = entrada.nextInt();

            if (nota == 10) {
                diez = 1; 
            }

        } while (nota != -1); 

        if (diez == 1) {
            System.out.println("Ha habido alguna nota con valor 10.");
        } else {
            System.out.println("No hubo ninguna nota con valor 10.");
        }
		
		
		
		

	}

}
