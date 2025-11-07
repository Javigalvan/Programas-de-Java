/*
 * Descripción: Un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 * Autor: Javi
 * Fecha: 23/10/25
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] numeros = new double[100];
		
		for (int i=0; i < numeros.length; i++) {
			numeros[i] = Math.random();
		}
		
		
		double valor;
		System.out.print("Escribe un valor: " );
        valor = entrada.nextDouble(); 
        
        double contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            double num = numeros[i];
        	if (num >= valor) {
        		contador++;	
        	}
        	
        }
		
		
        System.out.println("Hay " + contador + " valores mayores o iguales que " + valor + ".");
		
		

	}

}
