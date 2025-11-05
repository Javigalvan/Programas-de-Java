/*
 * Descripción:  Un programa que muestre los números pares comprendidos entre el 1 y el 200, utilizando un contador y suma de 1 en 1
 * Autor: Javi
 * Fecha: 20/10/25
 */

package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numeros;
		
		for (numeros = 1; numeros <=200; numeros++) {			
			if (numeros % 2 == 0) {
			System.out.print(numeros + " ");
			}
		}	

	}

}
