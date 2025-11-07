/*
 * Descripción: Un programa para realizar cálculos relacionados con la altura (en metros) de personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y por debajo de la media
 * Autor: Javi
 * Fecha: 30/10/25
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Introduce el número de personas: ");
        int n = entrada.nextInt();

        
        double[] alturas = new double[n];

        
        for (int i = 0; i < n; i++) {
            System.out.print("Introduce la altura en metros: ");
            alturas[i] = entrada.nextDouble();
        }

        
        double suma = 0;
        for (int i = 0; i < alturas.length; i++) {
            suma += alturas[i];
        }
        double media = suma / n;

        
        double max = alturas[0];
        double min = alturas[0];
        for (int i = 1; i < n; i++) {
            if (alturas[i] > max) {
                max = alturas[i];
            }
            if (alturas[i] < min) {
                min = alturas[i];
            }
        }

        
        int encimaMedia = 0, debajoMedia = 0;
        for (int i = 0; i < n; i++) {
            if (alturas[i] > media) {
                encimaMedia++;
            } else if (alturas[i] < media) {
                debajoMedia++;
            }
        }

      
        System.out.println("Altura media: " + media);
        System.out.println("Altura máxima: " + max);
        System.out.println("Altura mínima: " + min);
        System.out.println("Personas por encima de la media: " + encimaMedia);
        System.out.println("Personas por debajo de la media: " + debajoMedia);
	}

}
