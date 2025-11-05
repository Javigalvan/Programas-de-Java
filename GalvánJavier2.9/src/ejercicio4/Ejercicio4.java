/*
 * Descripción:  que muestre los números desde el 1 hasta un número N que se introducirá por teclado.
 * Autor: Javi
 * Fecha: 20/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numeros;
		int n;
		System.out.print("Escribe un numero: ");
		n = entrada.nextInt();
		
		
		for (numeros = 1; numeros <= n; numeros++) {
			System.out.print(numeros + " ");
			if (numeros == n) {
				System.out.print("");
			}
	}
	}
}
