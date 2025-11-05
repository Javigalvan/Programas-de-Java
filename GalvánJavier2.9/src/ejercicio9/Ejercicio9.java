/*
 * Descripción:  Un programa que calcula y escribe la suma y el producto de los 10 primeros números naturales.
 * Autor: Javi
 * Fecha: 23/10/25
 */	

package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int numero;
		int producto = 1;
		int suma = 0;
		
		for (int n = 1; n <= 10; n++) {
			numero = n;
			suma = suma + numero;		
			producto = producto * numero;	
		}
				
		System.out.println("La suma es " + suma);
		System.out.println("El producto es " + producto);
		
		
	}

}
