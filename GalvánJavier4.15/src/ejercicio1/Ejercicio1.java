/*
 * Descripción: Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
 * Autor: Javi
 * Fecha: 24/11/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String nombre1;
		System.out.print("Escribe un nombre: " );
		nombre1 = entrada.nextLine();
		
		String nombre2;
		System.out.print("Escribe un nombre: " );
		nombre2 = entrada.nextLine();
		
		System.out.print("Son iguales: " + comparaNombres(nombre1, nombre2));
		
	}
	
	public static boolean comparaNombres (String nombre1, String nombre2) {
		if (nombre1.equalsIgnoreCase(nombre2)) {
			return true;
		} else {
			return false;
		}
		
	}

}
