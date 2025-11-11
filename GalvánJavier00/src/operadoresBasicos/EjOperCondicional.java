/*
 * Descripción: como funciona el operador condicional
 * Autor: Javi
 * Fecha: 26/09/25
 */
package operadoresBasicos;

import java.util.Scanner;

public class EjOperCondicional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = teclado.nextLine();
		int longitud = nombre.length();
		System.out.println("Numero de caracteres: " + longitud);
		
		String nombreEnMinuscula;
		nombreEnMinuscula = nombre.toLowerCase();
		System.out.println(nombreEnMinuscula);
		
		boolean esPepe;
		esPepe = nombre.equals("pepe");
		System.out.println(esPepe);
		
		int edad;
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres mayor de edad" : "Eres menor de edad";
		
		System.out.println(mayorEdad);
	}

}
