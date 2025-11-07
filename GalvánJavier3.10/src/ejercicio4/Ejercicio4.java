/*
 * Descripción:  Un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.
 * Autor: Javi
 * Fecha: 23/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int[] numeros = new int[20];
						
		
        for (int i = 0; i < 20; i++) {
        	System.out.print("Escribe el numero " + (i + 1) + " : " );
            numeros[i] = entrada.nextInt();                      	              	
        }
        
        int positivos = 0;
		int negativos = 0;
		
		for (int i = 0; i < 20; i++) {
            if (numeros[i] > 0) {
                positivos += numeros[i];
            }
            if (numeros[i] < 0) {
                negativos += numeros[i];
            }
        }
		
		System.out.println("La suma de los positivos es: " + positivos);
        System.out.println("La suma de los negativos es: " + negativos);

	}

}
