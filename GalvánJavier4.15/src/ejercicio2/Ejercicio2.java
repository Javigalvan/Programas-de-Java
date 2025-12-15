package ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double precio;
		System.out.print("Escribe un precio: " );
		precio = entrada.nextDouble();
		
		int cantidad;
		System.out.print("Escribe una cantidad: " );
		cantidad = entrada.nextInt();
		
		int descuento;
		System.out.print("Escribe un descuento: " );
		descuento = entrada.nextInt();
		
		System.out.printf("Usted ha adquirido %d de productos, a un precio de %.2f euros la unidad.\n", cantidad, precio);
		System.out.printf("El precio a pagar es %.2f, pero al aplicarle el descuento del %d el precio final a pagar es: " + productosDescuento(precio,cantidad,descuento), precio, descuento);
		
		

	}
	
	public static double productosDescuento (double precio, int cantidad, int descuento) {
		
		double precioProducto = precio * cantidad;
		
		double porcentajeDescuento = descuento / 100.0;
		
		double precioFinal = precioProducto * (porcentajeDescuento);
		
		return precioFinal;
	}

}
