/*
 * Descripción: Un programa que permita al usuario almacenar una secuencia aritmética en un array y luego mostrarla. Una secuencia aritmética es una serie de números que comienza por un
valor inicial V, y continúa con incrementos de I. Por ejemplo, con V=1 e I=2, la secuencia sería 1, 3, 5, 7, 9… Con V=7 e I=10, la secuencia sería 7, 17, 27, 37… El programa solicitará al
usuario V, I además de N (nº de valores a crear).
 * Autor: Javi
 * Fecha: 05/11/25
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int v;
		System.out.print("Escribe un valor: " );
        v = entrada.nextInt();
        
        int i;
        System.out.print("Escribe el incremento: " );
        i = entrada.nextInt();
        
        int n;
        System.out.print("Escribe el tamaño: " );
        n = entrada.nextInt();
        
        int[] almacen = new int[n];
        
        for (int x = 0 ; x < almacen.length; x++) {
        	almacen[x] = v + x * i;      	
        }
        
        for (int x = 0 ; x < almacen.length; x++) {
        	System.out.print(almacen[x] + " ");

        }
		
		
		
		

	}

}
