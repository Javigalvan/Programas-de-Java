/*
 * Descripción:  Un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla.
 * Autor: Javi
 * Fecha: 23/10/25
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int n, m;
		
        System.out.print("Escribe el numero n: " );
        n = entrada.nextInt();                      	              	
       
        System.out.print("Escribe el numero m: " );
        m = entrada.nextInt(); 
        
        int[] numeros = new int[n];
        
        for (int i = 0; i < n; i++) {
            numeros[i] = m;
        }  
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i]);
        }
        
        
       

	}

}
