/*
 * Descripción: Realiza un programa que permita comprobar si una terna de valores enteros (3 valores) se ajusta
a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
 * Autor: Javi
 * Fecha: 24/11/25
 */

package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x;
		System.out.print("Escribe un numero x: " );
		x = entrada.nextInt();
		
		int y;
		System.out.print("Escribe un numero y: " );
		y = entrada.nextInt();
		
		int z;
		System.out.print("Escribe un numero z: " );
		z = entrada.nextInt();
		
	
		System.out.print("Son iguales: " + pitagoras(x,y,z));
		

	}
	
	public static boolean pitagoras (int x, int y, int z) {
		
		int x2 = Math.powExact(x, 2);
		int y2 = Math.powExact(y, 2);
		int z2 = Math.powExact(z, 2);
		
		
		int ecuacion = x2 + y2;
		
		if (ecuacion == z2) {
			return true;
		} else {
			return false;
		}
			
	}

}
