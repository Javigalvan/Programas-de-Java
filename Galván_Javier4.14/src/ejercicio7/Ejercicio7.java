/*
 * Descripción: Escribe un programa que pida el ancho y alto de un rectángulo y muestre por pantalla su área y su perímetro
 * Autor: Javi
 * Fecha: 13/11/25
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double ancho;
		System.out.print("Escribe el ancho: " );
		ancho = entrada.nextDouble();
		
		double alto;
		System.out.print("Escribe el alto: " );
		alto = entrada.nextDouble();
		
		double perimetro = perimetroRectangulo(ancho, alto);
		double area = areaRectangulo(ancho, alto);
		
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
		
		
		
	}
	
	public static double perimetroRectangulo(double ancho, double alto) {
		
		double perimetroRec = ((ancho * 2) + (alto * 2));
		return perimetroRec;
		
	}
	
	public static double areaRectangulo(double ancho, double alto) {
		
		double areaRec = (ancho * alto);
		return areaRec;
	}
	
	
	

}
