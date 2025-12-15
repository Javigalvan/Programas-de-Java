/*
 * Descripción: Escribe un programa que pida un número entero por teclado y muestre por pantalla si es positivo, negativo o cero
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.print("Escribe un numero: " );
		numero = entrada.nextInt();
		
		int num = dimeSigno(numero);
		
		System.out.print("El numero es: " + num);
		

	}
	// Calcula si un numero es positivo, negativo o cero
	public static int dimeSigno (int numero) {
		
		int num;
		int positivo = 1;
		int negativo = -1;
		int cero = 0;
		 
		if (numero > 0) {
			return positivo;
		} else if (numero < 0) {
			return negativo;
		}else {
			return cero;
		}
		
	}
}
