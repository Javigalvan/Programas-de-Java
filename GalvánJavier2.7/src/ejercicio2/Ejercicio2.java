/*
 * Descripción: Condicionales II
 * Autor: Javi
 * Fecha: 08/10/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		System.out.print("Escribe tu nombre: ");
		nombre= entrada.nextLine();
		
		String apellidos;
		System.out.print("Escribe tus apellidos: ");
		apellidos = entrada.nextLine();
		
		int edad;
		System.out.print("Escribe tu edad: ");
		edad= entrada.nextInt();
		
		int salario;
		System.out.print("Escribe tu salario: ");
		salario = entrada.nextInt();
		
		if (salario > 30000 || edad > 45) {
			System.out.print("Lo sentimos pero no cumple nuestro perfil");			
		} else {
			
			int añosExp;
			System.out.print("Escribe tus años de experiencia: ");
			añosExp = entrada.nextInt();
			
			int proyectos;
			System.out.print("Escribe tus proyectos trabajados: ");
			proyectos = entrada.nextInt();
			
			if (añosExp > 2 && proyectos > 3) {
			System.out.println("Enhorabuena. Ha sido contratado");
			} else {
				System.out.println("Lo sentimos pero no cumple nuestro perfil");				
			}
			if (añosExp > 5 || proyectos > 5) {
				System.out.println("Se le asignará como salario anual de 30.000 euros");			
			} else {
				System.out.println("Se le asignará como salario anual de 25.000 euros");
			}
			
			
		}
		

	}

}
