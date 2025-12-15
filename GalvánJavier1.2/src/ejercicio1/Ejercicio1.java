/*
 * Descripción: Uso de variables y E/S estándar
 * Autor: Javi
 * Fecha: 25/09/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre: ");
		String nombre ;
		nombre = entrada.nextLine();
		System.out.println("Nombre: "+ nombre);
		
		System.out.println("Escribe tus apellidos: ");
		String apellidos ;
		apellidos = entrada.nextLine();
		System.out.println("Apellidos: "+ apellidos);
		
		System.out.println("Escribe tu edad: ");
		int edad ;
		edad = entrada.nextInt();
		System.out.println("Edad: "+ edad);
		
		entrada.nextLine();
		System.out.println("Escribe tu dirección: ");
		String direccion ;
		direccion = entrada.nextLine();
		System.out.println("Dirección: "+ direccion);
		
		System.out.println("Escribe tu altura: ");
		double altura ;
		altura = entrada.nextDouble();
		System.out.println("Altura: "+ altura);
		
		System.out.println("Escribe tu peso: ");
		int peso ;
		peso = entrada.nextInt();
		System.out.println("Peso: "+ peso);
		
	}

}
