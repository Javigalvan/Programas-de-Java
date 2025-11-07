/*
 * Descripción: Un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos los valores del 1 al 100. 
 Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * Autor: Javi
 * Fecha: 03/11/25
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int[] num1 = new int[100];
		
		int[] num2 = new int[100];
		
		for (int i = 0; i < 100; i++) {
			num1[i] = i + 1;
            
        }
		
		for (int i = 0; i < 100; i++) {
            num2[i] = num1[99 - i];
        }
		
		
		for (int i = 0; i < 100; i++) {
            System.out.print(num1[i] + " ");
        }
		System.out.println("");
		System.out.println("");
		
		for (int i = 0; i < 100; i++) {
            System.out.print(num2[i] + " ");
        }
		
	}

}
