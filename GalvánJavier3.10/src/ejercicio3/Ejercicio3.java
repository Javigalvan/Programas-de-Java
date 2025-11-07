/*
 * Descripción:  Un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.
 * Autor: Javi
 * Fecha: 23/10/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] numeros = new double[10];
						
		
        for (int i = 0; i < 10; i++) {
        	System.out.print("Escribe el numero " + (i + 1) + " : " );
            numeros[i] = entrada.nextDouble();                      	              	
        }
		
		double maximo = numeros[0];
		double minimo = numeros[0];
		
		for (int i = 1; i < 10; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
			
		System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
		
		
		
		
	}

}
