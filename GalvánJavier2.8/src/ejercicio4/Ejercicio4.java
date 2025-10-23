/*
 * Descripción: Sumar y contar los numeros positivos con while hasta que el usuario introduzca 0
 * Autor: Javi
 * Fecha: 15/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		double media;
		int numero, contador = 0, suma = 0;	
		System.out.println ("Dime un numero positivo: ");
		numero = entrada.nextInt();
		

		while ( numero != 0) {
			if (numero < 0) {
			System.out.println ("Dime un numero que sea positivo");			
		} else {			
			suma = suma + numero;
			contador++;										
		}
		System.out.println ("Dime otro numero positivo: ");
		numero = entrada.nextInt();					

		}
		
		if (numero == 0) {
			System.out.println ("Se introdujeron : " + contador + " numeros");
		}
		
		media = suma / contador;
		System.out.println ("La media es: " + media );
		
	}
}
