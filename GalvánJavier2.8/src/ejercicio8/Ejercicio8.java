/*
 * Descripción: Pedir al usuario sus datos, almacenarlos y mostrarlos al final.
 * Autor: Javi
 * Fecha: 16/10/25
 */


package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		String nombre;
		System.out.print("Escribe tu nombre: ");
		nombre = entrada.nextLine();
		
		String apellidos;
		System.out.print("Escribe tus apellidos: ");
		apellidos = entrada.nextLine();
		
		int edad;
		System.out.print("Escribe tu edad: ");
		edad = entrada.nextInt();
		
		while (edad <= 17 || edad >= 45) {
			System.out.println("Esa edad no es correcta");
			System.out.println("Escribe tu edad: ");
			edad = entrada.nextInt();
		}
		
		int numRutas;
		System.out.print("Escribe el número rutas realizadas: ");
		numRutas = entrada.nextInt();
		
		int distRutas;
		System.out.print("Escribe la distancia última ruta: ");
		distRutas = entrada.nextInt();
		
		int distancia; int numParticipantes; 
		String ciudad;
		
		int sumaDistancia = 0;
		int distanciaMax = -1;
		String ciudadMax = "";
		
		for (int caminata = 1; caminata <=5; caminata++) {
			System.out.println("Escribe la distancia de la caminata " + caminata + ":");
			distancia = entrada.nextInt();
			System.out.println("Escribe el numero de participantes de la caminata " + caminata + ":");
			numParticipantes = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Escribe la ciudad de la caminata " + caminata + ":");
			ciudad = entrada.nextLine();
			
			sumaDistancia = sumaDistancia + distancia;
			
			if (distancia > distanciaMax) {
                distanciaMax = distancia;
                ciudadMax = ciudad;	
			}
		}
		
		double distanciaMedia = sumaDistancia / 5;
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Número de rutas realizadas: " + numRutas);
		System.out.println("");
		System.out.println("Distancia media (5 últimas rutas): " + distanciaMedia);
		System.out.println("Distancia más larga de las últimas 5 rutas: " + distanciaMax);
		System.out.println("Ciudad de la ruta más larga: " + ciudadMax);
		System.out.print("---------------------------------------------------------");
		
		
		
		
		
		

	

}
}