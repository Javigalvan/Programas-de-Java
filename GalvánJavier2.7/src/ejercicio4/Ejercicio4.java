/*
 * Descripción: Condicionales II
 * Autor: Javi
 * Fecha: 08/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double nota1;
		System.out.print("Escribe tu nota de lengua: ");
		nota1 = entrada.nextDouble();
		
		double nota2;
		System.out.print("Escribe tu nota de mates: ");
		nota2 = entrada.nextDouble();
		
		double nota3;
		System.out.print("Escribe tu nota de ingles: ");
		nota3 = entrada.nextDouble();
		
		double nota4;
		System.out.print("Escribe tu nota de historia: ");
		nota4 = entrada.nextDouble();
		
		double notaMedia = ((nota1 + nota2 + nota3 + nota4) / 4);
		System.out.println("Tu nota media es: " + notaMedia);
		System.out.println("Tu nota media redondeada hacia arriba es: " + Math.ceil(notaMedia));
		System.out.println("Tu nota media redondeada hacia abajo es: " + Math.floor(notaMedia));
		
		
		if (notaMedia > 8) {
			System.out.println("Puede acceder a estudios superiores");
		} else {
			System.out.println("Tu nota media obtenida no es suficiente para acceder a los estudios que deseaba");
		}
		

	}

}
