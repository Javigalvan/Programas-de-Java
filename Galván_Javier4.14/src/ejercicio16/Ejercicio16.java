/*
 * Descripción: Escribe un programa que cree un array del tamaño indicado por teclado y luego lo rellene con valores aleatorios (utiliza Math.random()).
 Implementa la función que rellena un array con valores aleatorios.
 * Autor: Javi
 * Fecha: 20/11/25
 */

package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tamanio;
		System.out.print("Escribe un tamaño: " );
		tamanio = entrada.nextInt();
		
		int[] numeros = new int[tamanio];
		
		rellenarArray(numeros);
		
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
	}
	
	public static void rellenarArray (int numeros[]) {
		for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*100);        
        }
		
	}

}
