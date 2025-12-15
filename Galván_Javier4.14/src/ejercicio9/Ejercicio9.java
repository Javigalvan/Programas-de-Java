/*
 * Descripción: Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más pequeño 
 * Autor: Javi
 * Fecha: 14/11/25
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int num1;
		System.out.print("Escribe un numero: " );
		num1 = entrada.nextInt();
		
		int num2;
		System.out.print("Escribe un numero: " );
		num2 = entrada.nextInt();
		
		int num3;
		System.out.print("Escribe un numero: " );
		num3 = entrada.nextInt();
		
		
		int numPequeno = numeroPequeno (num1, num2);
		int numPequenoFinal = numeroPequeno (numPequeno, num3);
				
		System.out.println("Numero mas pequeño es: " + numPequenoFinal);
		

	}
	
	public static int numeroPequeno (int num1, int num2) {
		
		int numPequeno = 0;
		
		if (num1 < num2) {
			numPequeno = num1;
		} else {
			numPequeno = num2;
		}
		return numPequeno;
		
		
	}
	

}
