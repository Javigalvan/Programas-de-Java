/*
 * Descripción: Pedir 10 numeros al usuario, hacer la media de los numeros positivos y negativos y contar los 0
 * Autor: Javi
 * Fecha: 15/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int positivos = 0, negativos = 0, ceros = 0;
        int sumaPositivos = 0, sumaNegativos = 0;

        for (int num1 = 1; num1 <= 10; num1++) {
            System.out.print("Ingrese el número " + num1 + ": ");
            int numero = entrada.nextInt();

            if (numero > 0) {
                sumaPositivos += numero;
                positivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                negativos++;
            } else {
                ceros++;
            }
        }

        if (positivos > 0) {
            System.out.println("Media de positivos: " + (sumaPositivos / positivos));
        } else {
            System.out.println("No hay números positivos.");
        }

        if (negativos > 0) {
            System.out.println("Media de negativos: " + (sumaNegativos / negativos));
        } else {
            System.out.println("No hay números negativos.");
        }

        System.out.println("Cantidad de ceros: " + ceros);
	
		}		

	}


