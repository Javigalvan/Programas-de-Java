/*
 * Descripción: Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado. Para ello implementa una función que reciba como parámetro un número entero y 
muestre por pantalla la tabla de multiplicar de dicho número 
 * Autor: Javi
 * Fecha: 14/11/25
 */

package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.print("Escribe un numero: " );
		numero = entrada.nextInt();
		
		tablaDeMultiplicar(numero);

	}
	
	public static void tablaDeMultiplicar (int numero) {
		
		int multiplicacion;
		
		for(int i=0; i<=10; i++) {
			multiplicacion = numero * i;
			System.out.print(multiplicacion + " "  );
		}
		
		
	}
}
