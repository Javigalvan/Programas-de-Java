/*
 * Descripción: Escribe una función que muestre por pantalla un triángulo como el del ejemplo. Deberá recibir dos parámetros: el carácter que se desea imprimir y el número de líneas del triángulo
 * Autor: Javi
 * Fecha: 17/11/25
 */

package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		
		
		imprimirTriangulo('a', 5);
		
	}

	
	public static void imprimirTriangulo(char a, int lineas) {
		
		for (int i = 1; i <= lineas; i++) {
	        for (int j = 1; j <= i; j++) {
	            System.out.print(a);
	        }
	        System.out.println();
	    }
	}
}
