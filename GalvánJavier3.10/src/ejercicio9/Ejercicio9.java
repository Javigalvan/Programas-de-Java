/*
 * Descripción:  un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
cuántos valores del array son igual o superiores a R.
 * Autor: Javi
 * Fecha: 30/10/25
 */

package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] numeros = new int[100];
		
		for (int i=0; i < numeros.length; i++) {
			numeros[i] = (int) (1 + Math.random()*10);
		}
		
		int n;
		System.out.print("Escribe un valor: " );
		n = entrada.nextInt();
		
		
		boolean encontrado;
		for (int i=0; i< numeros.length; i++) {
			if (numeros[i] == n) {				
                System.out.print(+ i + " ");
               encontrado = true;
            }
		}

		
		

	}

}
