/*
 * Descripción: Generar un número aleatorio y pedir al usuario adivinarlo indicando si el numero introducido es mayor o menor.
 * Autor: Javi
 * Fecha: 16/10/25
 */

package ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Random aleatorio = new Random();
		
		int n = aleatorio.nextInt(51);
		
		
		int numero;
		System.out.print("Escribe un numero del 0 al 50: ");
		numero = entrada.nextInt();
		
		while (numero != n) {
			if (numero > n) {
				System.out.println("El numero introducido es mayor");
				System.out.println("Escribe un numero: ");
				numero = entrada.nextInt();
			} else if (numero < n) {
				System.out.println("El numero introducido es menor");
				System.out.println("Escribe un numero: ");
				numero = entrada.nextInt();
			} else {
				
					
					
				
				{
				}
						
		}	
		}	
	}
}
