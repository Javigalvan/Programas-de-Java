/*
 * Descripción: Desarrolla un programa en Java que permita gestionar los precios de un grupo de productos
 * Autor: Javier
 * Fecha: 26/11/25
 */

package Galvan;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		
		String nombreProducto;
		System.out.print("Escribe el nombre de un producto: " );// Pedimos el nombre del producto
		nombreProducto = entrada.nextLine();
		
		
		int numeroUnidades;	
		System.out.print("Escribe el numero de unidades a comprar: " );// Pedimos el numero de unidades del producto
		numeroUnidades = entrada.nextInt();
		
			if (numeroUnidades < 1 || numeroUnidades > 100) {
				do{
					System.out.print("Escribe un numero de unidades a comprar entre 1 y 100: " ); // Si el numero de unidades no está entre 1 y 100 se pide de nuevo
					numeroUnidades = entrada.nextInt();					
				} while (numeroUnidades < 1 && numeroUnidades > 100);
			}
				
		
		double precio;
		System.out.print("Escribe el precio: " );// // Pedimos el precio producto
		precio = entrada.nextDouble();
		
		

		
		double precioFinal=0;
		double porcentaje=0;
		
		if (numeroUnidades>1 && numeroUnidades<=10) {
			precioFinal = (precio * numeroUnidades) * 0.95; // Si el numero esta entre 1 y 10 calculamos el precio final con el porcentaje correspondiente
			porcentaje = 5;
		}
		if (numeroUnidades>10 && numeroUnidades<=50) {
			precioFinal = (precio * numeroUnidades) * 0.90; // Si el numero esta entre 11 y 50 calculamos el precio final con el porcentaje correspondiente
			porcentaje = 10;
		}
		if (numeroUnidades>51 && numeroUnidades<=100) {
			precioFinal = (precio * numeroUnidades) * 0.85; // Si el numero esta entre 51 y 100 calculamos el precio final con el porcentaje correspondiente
			porcentaje = 15;
		}
		
		
		System.out.println("Nombre del producto: " + nombreProducto );
		System.out.println("Numero de unidades: " + numeroUnidades ); // Mostramos los resultados
		System.out.println("Porcentaje de descuento: " + porcentaje );
		System.out.println("El total sera el precio: " + precio + "$, por las unidades a comprar: "+ numeroUnidades +" unidades. A esa cantidad se le aplicará el "+ porcentaje +"% por lo que el resultado final sería: " + precioFinal + "$");
		
		
		
			
		
		
		

	}

}
