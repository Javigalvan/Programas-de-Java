/*
 * Descripción: Condicionales
 * Autor: Javi
 * Fecha: 03/10/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int edad;
		System.out.print("Escribe tu edad: ");
		edad= entrada.nextInt();
		
		entrada.nextLine();
		
		if (edad < 18) {
			System.out.print("No tiene la edad requerida para realizar estos estudios.");
		} else {
			String nombre;
			System.out.println("Escribe tu nombre: ");
			nombre = entrada.nextLine();
			
			String apellidos;
			System.out.println("Escribe tus apellidos: ");
			apellidos = entrada.nextLine();
			
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Usted ha sido admitido");
	}

	}
}
