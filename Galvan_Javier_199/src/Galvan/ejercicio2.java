/*
 * Descripción:  un programa en Java que solicite al usuario un año que debe encontrarseentre 1801 y 2100, ambos valores incluidos. El programa finalizará cuando el
 				 usuario introduzca el valor -1 ó el usuario haya introducido tres años no válidos deforma consecutiva.
 * Autor: Javier Galván
 * Fecha: 29/10/25
 */

package Galvan;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int ano = 0;
		int intentos = 0;
		
		
			System.out.print("Introduce un año entre 1801 y 2100: ");
			ano = teclado.nextInt();
			intentos++;
			while (ano != -1) {			
				System.out.print("Introduce un año entre 1801 y 2100: ");
				ano = teclado.nextInt();
				intentos++;
				if (ano <1801 || ano > 2100) {
				System.out.print("Introduce un año entre 1801 y 2100: ");
				ano = teclado.nextInt();
				intentos++;			
				}
				if (intentos == 3) {
					System.out.print("Has llegado al límite de intentos");
			}
			
	}
		
			
			
		
		
		

	}

}