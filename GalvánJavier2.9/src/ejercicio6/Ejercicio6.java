/*
 * Descripción:  Un programa que lea 100 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no.
 * Autor: Javi
 * Fecha: 20/10/25
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int contadorNegativos = 0;
        int numero;

        for (int n = 1; n <= 100; n++) {
            System.out.print("Escribe el número " + n + " : ");
            numero = entrada.nextInt();

            while (numero == 0) {
                System.out.print("El número no puede ser 0. Escribe otro: ");
                numero = entrada.nextInt();
            }

            if (numero < 0) {
                contadorNegativos++;
            }
        }

        if (contadorNegativos > 0) {
            System.out.println("Se ha leído un número negativo");
        } else {
            System.out.println("No se ha leído ningún número negativo");
        }
        
        
	}
}
