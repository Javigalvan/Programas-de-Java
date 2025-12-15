/*
 * Descripción: Escribe un programa que cree un array de tamaño 50 con los números naturales comprendidos entre 50 y 99. Luego muestra la suma total y la media. Implementa una función que calcule la
suma de un array y otra que calcule la media de un array
 * Autor: Javi
 * Fecha: 17/11/25
 */

package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		double[] numeros = new double[50];
		
		double sumarArray=0;
		double media=0;
		
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 50.0 + i;
        }
		
        double sumacion = suma(numeros, sumarArray);
        System.out.println("La suma es: " + sumacion);	
        System.out.println (media(numeros, sumarArray, media));
		

	}
	public static double suma (double numeros[], double sumarArray) {
		
		 double sumaArray = 0;
	        for (int i = 0; i < numeros.length; i++) {
	        	sumarArray += numeros[i];
	        }
	        return sumarArray;
	}
	
	public static double media (double numeros[], double sumarArray, double media) {
		return suma(numeros, sumarArray) / numeros.length;
		
	}
	
}
