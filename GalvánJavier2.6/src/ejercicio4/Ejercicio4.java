/*
 * Descripción: Condicionales
 * Autor: Javi
 * Fecha: 03/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		System.out.print("Escribe tu nombre: ");
		nombre= entrada.nextLine();
		
		String apellidos;
		System.out.print("Escribe tus apellidos: ");
		apellidos = entrada.nextLine();
		
		int ImporteGastado1;
		System.out.print("Escribe el importe gastado: ");
		ImporteGastado1= entrada.nextInt();
		
		int ImporteGastado2;
		System.out.print("Escribe el importe gastado: ");
		ImporteGastado2= entrada.nextInt();
		
		int ImporteGastado3;
		System.out.print("Escribe el importe gastado: ");
		ImporteGastado3= entrada.nextInt();
		
		int ImporteGastado4;
		System.out.print("Escribe el importe gastado: ");
		ImporteGastado4= entrada.nextInt();
		
		int suma = ImporteGastado1 + ImporteGastado2 + ImporteGastado3 + ImporteGastado4;
		int media = suma / 4;
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Importe Gastado1: " + ImporteGastado1);
		System.out.println("Importe Gastado2: " + ImporteGastado2);
		System.out.println("Importe Gastado3: " + ImporteGastado3);
		System.out.println("Importe Gastado4: " + ImporteGastado4);
		System.out.println("Importe medio: " + media);
		
		
		if (suma > 300) {
			System.out.print("Has conseguido un vale de 50 euros");
		} else {
			System.out.print("Lo sentimos pero sus compras no han alcanzado los 300 euros este mes, no dispone de descuento.");
		}
		
		
		
			

	}

}
