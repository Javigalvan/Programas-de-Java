/*
 * Descripción: Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad o no
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int edad;
		System.out.print("Escribe un numero: " );
		edad = entrada.nextInt();
		
		boolean mayorEdad = esMayorEdad(edad);
		
		System.out.print("Es mayor de edad: " + mayorEdad );

	}
	// Calcula si una persona es mayor de edad y devuelve un valor booleano
	public static boolean esMayorEdad(int edad) {
		
		boolean mayorEdad;
		
		if (edad > 18) {
			mayorEdad = true;
		} else {
			mayorEdad = false;
		}
		return mayorEdad;
	}

}
