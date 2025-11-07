/*
 * Descripción:  Un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores
 * Autor: Javi
 * Fecha: 23/10/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] numeros = new double[10];
						           
        double suma = 0;
		
        for (int i = 0; i < 10; i++) {
        	System.out.print("Escribe el numero " + (i + 1) + " : " );
            numeros[i] = entrada.nextDouble();
            suma += numeros[i];
        }
                   	
        System.out.println("La suma es: " + suma);
        
        
		
		
		
		
		
		
		

	}

}
