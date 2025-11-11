package examen;

import java.util.Scanner;

public class CadenaCaracteres {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		System.out.print("Escribe una cadena de caracteres: ");
		cadena = entrada.nextLine();
		
		//Mostrar la longitud de la cadena
		int longitud = cadena.length();
		System.out.println(longitud);
		
		//Mostrar el primer caracter de la cadena
		char primeraLetra = cadena.charAt(0);
		System.out.println(primeraLetra);	
		
		//Mostrar el ultimo caracter de la cadena
		char ultimaLetra = cadena.charAt(longitud-1);
		System.out.println(ultimaLetra);	
		
		//Mostrar la segunda palabra de la cadena
		String[] palabras = cadena.split(" ");
		String segundaPalabra = palabras[1]; 
		System.out.println(segundaPalabra);	
		
		//Mostrar la cadena con la primera letra y la ultima en mayuscula
		String primLetra = cadena.substring(0,1);
		primLetra = primLetra.toUpperCase();
		
		String ultLetra = cadena.substring(longitud - 1, longitud);
		ultLetra = ultLetra.toUpperCase();
		
		String medio = cadena.substring(1, longitud - 1);
		System.out.println(primLetra+medio+ultLetra);	
		
		
	
	}

}
