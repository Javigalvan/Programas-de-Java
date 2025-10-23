/*
 * Descripción: Condicionales II
 * Autor: Javi
 * Fecha: 09/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("Escribe un numero: ");
		num1 = entrada.nextInt();
		
		System.out.print("Escribe un numero: ");
		num2 = entrada.nextInt();
		
		int operacion;
		System.out.println("Indique la operación que quiere realizar (Inserte un número): \n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division");
		operacion = entrada.nextInt();
		
		int suma, resta, multiplicacion, division;
		
		if (operacion == 1) {
			suma = num1 + num2;
			System.out.println("Resultado: " + suma);
		} else if (operacion == 2) {
			resta = num1 - num2;
			System.out.println("Resultado: " + resta);
		} else if (operacion == 3) {
			multiplicacion = num1 * num2;
			System.out.println("Resultado: " + multiplicacion);
		} else if (operacion == 4) {
			division = num1 / num2;
			System.out.println("Resultado: " + division);
		}
		

	}

}
