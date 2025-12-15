/*
 * Descripción: Cálculos simples
 * Autor: Javi
 * Fecha: 01/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.print("Introduce el primer número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = entrada.nextDouble();
     
        System.out.println("El número menor es: " + Math.min(num1, num2));

        System.out.println(num1 + " elevado a " + num2 + " es: " + Math.pow(num1, num2));

        System.out.println("La raíz cuadrada de " + num1 + " es: " + Math.sqrt(num1));

        System.out.println("Valor aleatorio entre 0 y " + num2 + ": " + (Math.random() * num2));
		
		
		
	}
}

	     
	        


	
