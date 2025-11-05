/*
 * Descripción:  Un programa que lea un número positivo N y calcule y visualice su factorial N!
 * Autor: Javi
 * Fecha: 20/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n;
		System.out.print("Escribe un numero: ");
		n = entrada.nextInt();
		
		if (n < 0) {
            System.out.println("");
        } else {
            int factorial = 1; 
            for (int numero = 1; numero <= n; numero++) {
                factorial *= numero;
            }
            System.out.println("El factorial de " + n + " es: " + factorial);

	}

	}

}
