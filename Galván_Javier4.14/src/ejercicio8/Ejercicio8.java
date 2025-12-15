/*
 * Descripción: Escribe un programa que pida un valor N entero y luego muestre: el sumatorio des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. 
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
		System.out.print("Escribe un numero: " );
		n = entrada.nextInt();
		
		int suma = suma1aN(n);
		int producto = producto1aN(n);
		double intermedio = intermedio1aN(n);
		
		System.out.println("suma: " + suma);
		System.out.println("producto: " + producto);
		System.out.println("intermedio: " + intermedio);

	}
	
	public static int suma1aN(int n) {
		
		int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
	}
	
	public static int producto1aN(int n) {
		
		int producto = 1;
        for (int i = 1; i <= n; i++) {
            producto *= i;
        }
        return producto;
	}
	public static double intermedio1aN(int n) {
		
		return  (n / 2.0);
		
	}
	
}
