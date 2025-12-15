/*
 * Descripción: Cálculos simples
 * Autor: Javi
 * Fecha: 01/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe un número decimal: ");
        double numero = entrada.nextDouble();

        double ceilValor = Math.ceil(numero);
        double floorValor = Math.floor(numero);
        double roundValor = Math.round(numero);
   
        System.out.println("Math.ceil = " + ceilValor); //Redondea hacia arriba 
        System.out.println("Math.floor = " + floorValor); //Redondea hacia abajo 
        System.out.println("Math.round = " + roundValor); //Redondea al numero más cercano
	}

}
