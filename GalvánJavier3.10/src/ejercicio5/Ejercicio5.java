/*
 * Descripción:  Un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores.
 * Autor: Javi
 * Fecha: 23/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] numeros = new double[5];
						
		double suma = 0;
		
		double media = 0;
		
        for (int i = 0; i < 5; i++) {
        	System.out.print("Escribe el numero " + (i + 1) + " : " );
            numeros[i] = entrada.nextDouble();  
            suma += numeros[i];
            media = suma / 5;
        }       
		
        System.out.println("La media es: " + media);

	}

}
