/*
 * Descripción: Crea un programa que cree una matriz de 10x10 e introduzca los valores de las tablas de multiplicar del 1 al 10 (cada tabla en una fila).
Luego mostrará la matriz por pantalla.
 * Autor: Javi
 * Fecha: 05/11/25
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		int[][] matriz = new int[10][10];
		
		
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (i+1) * (j+1);
                
            }    
		}     
		for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
		}
               

	}

}
