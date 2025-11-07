/*
 * Descripción:  Un programa  que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores
 * Autor: Javi
 * Fecha: 24/10/25
 */	

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] numeros = new double[10];
						           
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Escribe el numero " + (i + 1) + " : " );
            numeros[i] = entrada.nextDouble();
        }
        
          
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }
		

	}

}
