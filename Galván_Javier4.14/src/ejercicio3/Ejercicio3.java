/*
 * Descripción: Escribe un programa que pida dos números enteros por teclado y muestre por pantalla cual es el mínimo
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		System.out.print("Escribe un numero: " );
		num1 = entrada.nextInt();
		
		int num2;
		System.out.print("Escribe un numero: " );
		num2 = entrada.nextInt();
		
		int min = minimo(num1, num2);
		
		System.out.print("El numero minimo es: " + min);

	}
	
	// Calcula el numero minimo entre 2 valores
	public static int minimo(int num1, int num2) {
		
		int min;
		if (num1 < num2) {
			min = num1;
		} else {
			min = num2;
		}
		return min;
	}

}
