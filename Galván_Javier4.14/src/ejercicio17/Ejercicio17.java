/*
 * Descripción: Realiza un programa que nos pida número enteros hasta que se introduzca el 0, diciéndonos, para cada número introducido si es primo o no. Hay que recordar que un número es primo si es
divisible por si mismo y por 1. El 1 no es primo por convenio. Se debe crear una función que pasándole un número entero devuelva si es primo o no
 * Autor: Javi
 * Fecha: 21/11/25
 */

package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numeros;
		
		do {
            System.out.print("Introduce un número: ");
            numeros = entrada.nextInt();

            if (numeros != 0) {
                if (esPrimo(numeros)) {
                    System.out.println(numeros + " es primo");
                } else {
                    System.out.println(numeros + " no es primo");
                }
            }
            } while (numeros != 0);
		
	}
	
	public static boolean esPrimo (int numeros) {
		
		boolean primo = true;
		
		if (numeros <= 1) {
            primo = false;
        }
        for (int i = 2; i <= Math.sqrt(numeros); i++) {
            if (numeros % i == 0) {
                primo = false;
            }
        }
        return primo;
			    
		}

	}


