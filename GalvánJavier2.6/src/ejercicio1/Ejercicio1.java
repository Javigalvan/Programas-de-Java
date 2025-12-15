/*
 * Descripción: Condicionales
 * Autor: Javi
 * Fecha: 03/10/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		System.out.print("Escribe un número: ");
		num1= entrada.nextInt();
		
		System.out.print("Escribe un número : ");
		int num2 = entrada.nextInt();
		
		
		if (num1 > num2) {
			System.out.print("Num1 es mayor que num2");
			
		} else if (num1 < num2){ 
			System.out.print("Num1 es menor que num2");
			
		} else {
			System.out.print("Num1 es igual que num2");
			
			
			
			
		}

	}
	}

