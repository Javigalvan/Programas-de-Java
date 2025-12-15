/*
 * Descripción: Escribe un programa que pida dos números reales por teclado y muestre por pantalla el resultado de multiplicarlos.
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double num1;
		System.out.print("Escribe un numero: " );
		num1 = entrada.nextDouble();
		
		double num2;
		System.out.print("Escribe un numero: " );
		num2 = entrada.nextDouble();
		
		double multiplicacion = multiplica(num1, num2);
		
		System.out.print("EL resultado es: " + multiplicacion );
		
	}
	// Calcula la multiplicacion de 2 numeros y muestra el resultado
	public static double multiplica(double num1, double num2) {
		
		double multiplicacion;
		multiplicacion = num1 * num2;
		return multiplicacion;
		
	}

}
