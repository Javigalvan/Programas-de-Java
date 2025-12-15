/*
 * Descripción: Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros. Recuerda que una milla son 1,60934 kilómetros
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int millas;
		System.out.print("Escribe un numero: " );
		millas = entrada.nextInt();
		double kilometros = millas_a_kilometros(millas);
		
		System.out.print("El numero es: " + kilometros);
		

	}
	// Calcula el cambio de millas a kilometros
	public static double millas_a_kilometros (int millas) {
		
		double kilometros = 1.60934;
		
		return millas * kilometros;
		
		
	}

}
