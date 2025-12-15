/*
 * Descripción: Cálculos simples
 * Autor: Javi
 * Fecha: 01/10/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Escribe un numero: ");
		int num1 ;
		num1 = entrada.nextInt();
		
		
		System.out.println("Escribe un numero: ");
		int num2 ;
		num2 = entrada.nextInt();
		
		
		int cambio = num1;
		num1 = num2;
		num2 = cambio;
		System.out.println("num1 es: " + num1);
		System.out.println("num2 es: " + num2);
		

	}

}
