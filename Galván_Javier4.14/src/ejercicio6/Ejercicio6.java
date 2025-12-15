/*
 * Descripción: Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada uno tras aplicarle un 21% de IVA
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce el precio " + i + ": ");
            double precio = entrada.nextDouble();

            double precioFinal = precioConIVA(precio);
            System.out.println("Precio con IVA: " + precioFinal);
        }
	}
	
	public static double precioConIVA (double precio) {
		
		return precio * 1.21;
		
	
		
	}

}
