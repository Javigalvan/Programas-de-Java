/*
 * Descripción: Realiza un programa que dado un valor en kilómetros nos lo traduce a millas. El programa debe tener una función que reciba como parámetro una cantidad en kilómetros y
nos la devuelva en millas.
 * Autor: Javi
 * Fecha: 17/11/25
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double kilometros;
		System.out.print("Escribe un numero: " );
		kilometros = entrada.nextDouble();
		
		kilometros_millas(kilometros);
		
		System.out.print(kilometros + "km en millas son: " + kilometros_millas(kilometros));

	}
	
	public static double kilometros_millas (double kilometros) {
		
		double millas = 1.60934;
		
		double conversion = kilometros / millas;
		
		return conversion;
		
		
	}

}
