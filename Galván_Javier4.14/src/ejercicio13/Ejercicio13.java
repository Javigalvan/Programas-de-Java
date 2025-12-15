/*
 * Descripción: Realiza un programa que calcule el porcentaje de descuento que nos han hecho al comprar algo. Se debe solicitar la cantidad sin descuento y la cantidad con el descuento aplicado.
 Se debe crear una función a la que le pasemos ambos valores y nos devuelva el descuento (en %).
 * Autor: Javi
 * Fecha: 17/11/25
 */

package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double precio;
		System.out.print("Escribe un precio: " );
		precio = entrada.nextDouble();
		
		double precioDescuento;
		System.out.print("Escribe un precio con Descuento: " );
		precioDescuento = entrada.nextDouble();
		
		descuento(precio, precioDescuento);
		
		System.out.print("El descuento es: " + descuento(precio, precioDescuento) + "%" );

	}
	
	public static double descuento (double precio, double precioDescuento) {
		
		double descuento = precio - precioDescuento;
		return (descuento / precio) * 100;
		
		
		
		
	}
	

}
