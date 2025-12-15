/*
 * Descripción: Uso de variables y E/S estándar
 * Autor: Javi
 * Fecha: 25/09/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe el nombre de tu equipo: ");
		String nombreEquipo ;
		nombreEquipo = entrada.nextLine();
		System.out.println("Nombre del equipo: "+ nombreEquipo);
		
		System.out.println("Escribe el año de fundación: ");
		int anoFundacion ;
		anoFundacion = entrada.nextInt();
		System.out.println("Fundado en: "+ anoFundacion);
		
		entrada.nextLine();
		System.out.println("Escribe el nombre del estadio: ");
		String nombreEstadio ;
		nombreEstadio = entrada.nextLine();
		System.out.println("Estadio: "+ nombreEstadio);
		
		System.out.println("Escribe el nombre del capitán: ");
		String nombreCapitan ;
		nombreCapitan = entrada.nextLine();
		System.out.println("Capitán: "+ nombreCapitan);
		
		

	}

}
