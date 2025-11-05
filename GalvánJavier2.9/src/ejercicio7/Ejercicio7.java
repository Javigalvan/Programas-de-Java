/*
 * Descripción:  Un programa que lea 100 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos.
 * Autor: Javi
 * Fecha: 20/10/25
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contadorPositivos = 0;
		int contadorNegativos = 0;	// Inicializamos las variables
        int numero;

        for (int n = 1; n <= 5; n++) {
            System.out.print("Escribe el número " + n + " : "); // Pedimos 100 numeros no nulos al usuario
            numero = entrada.nextInt();

            while (numero == 0) {
                System.out.print("El número no puede ser 0. Escribe otro: ");
                numero = entrada.nextInt();
            }

            if (numero < 0) {
                contadorNegativos++;        // Ponemos un contador para contar los positivos y los negativos       
            } else if (numero > 0) {
            	   contadorPositivos++;
             }     
            

        
        }                
            System.out.println("Se han leido " + contadorNegativos + " numeros negativos");	 // Mostramos cuantos numeros positivos y negativos se han leido
            System.out.println("Se han leido " + contadorPositivos + " numero positivos");
        }

	}


