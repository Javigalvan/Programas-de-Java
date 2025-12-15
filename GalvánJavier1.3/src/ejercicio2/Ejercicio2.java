/*
 * Descripción: Cálculos simples
 * Autor: Javi
 * Fecha: 01/10/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
        final double CAMBIO_EURO_PESETA = 166.386;

        Scanner entrada = new Scanner(System.in);

        // Euros a Pesetas
        System.out.print("Introduce la cantidad en euros: ");
        double euros = entrada.nextDouble();
        double pesetas = euros * CAMBIO_EURO_PESETA;
        System.out.println( euros + " euros son " + pesetas + " pesetas");

        // Pesetas a Euros
        System.out.print("Introduce la cantidad en pesetas: ");
        pesetas = entrada.nextDouble();
        euros = pesetas / CAMBIO_EURO_PESETA;
        System.out.println( pesetas + " pesetas son " + euros + " euros");	
		

	}

}
