/*
 * Descripción: Pedir numeros y mostrar su cuadrado hasta que se introduzca un negativo.
 * Autor: Javi
 * Fecha: 16/10/25
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.print("Escribe un numero: ");
		numero = entrada.nextInt();
		
		while (numero > 0) {
			System.out.println("Su cuadrado es: " + numero * numero);
			System.out.println("Escribe un numero: ");
			numero = entrada.nextInt();
		}
		
		

	}

}
