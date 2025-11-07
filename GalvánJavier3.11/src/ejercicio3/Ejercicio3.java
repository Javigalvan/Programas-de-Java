/*
 * Descripción: Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e introduzca en ella NxM valores (también introducidos por teclado). 
Luego deberá recorrer la matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son menores que cero y cuántos son igual a cero.
 * Autor: Javi
 * Fecha: 06/11/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
        System.out.print("Escribe el tamaño de n: " );
        n = entrada.nextInt();
        
        int m;
        System.out.print("Escribe el tamaño de m: " );
        m = entrada.nextInt();
        
        int[][] matriz = new int[n][m];
        
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        	System.out.print("Escribe los valores de n y m: " );
            matriz[i][j] = entrada.nextInt();           
        }
       }
        int mayorCero = 0;
        int menorCero = 0;
        int igualCero = 0;
              
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] > 0) {
                	mayorCero++;
                } else if (matriz[i][j] < 0) {
                	menorCero++;
                } else
                	igualCero++;
            }
        }
        System.out.println("Mayores que cero: " + mayorCero);
        System.out.println("Menores que cero: " + menorCero);
        System.out.println("Iguales a cero: " + igualCero);

	}

}
