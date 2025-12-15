/*
 * Descripción: Condicionales
 * Autor: Javi
 * Fecha: 03/10/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		System.out.print("Escribe tu nombre: ");
		nombre= entrada.nextLine();
		
		
		int edad;
		System.out.print("Escribe tu edad: ");
		edad= entrada.nextInt();
		
		
		int nota;
		System.out.print("Escribe tu nota: ");
		nota= entrada.nextInt();
		
		
		if (edad > 18 && nota >=7 ) {
			System.out.print(nombre + ", usted ha sido admitido en el curso, cumple las condiciones requeridas");
		} else {
			System.out.print(nombre + " , lo sentimos, no ha sido admitido en el curso ya que no cumple los requisitos mínimos");
			
		}

	}

}
