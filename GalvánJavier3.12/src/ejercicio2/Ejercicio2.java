/*
 * Descripción: Crea un programa que pida dos cadenas de texto por teclado y luego indique si son iguales, además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * Autor: Javi
 * Fecha: 10/11/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe una cadena de texto: " );
        String texto1 = entrada.nextLine();
        
        System.out.print("Escribe una cadena de texto: " );
        String texto2 = entrada.nextLine();
        
        if (texto1.equals(texto2)) {
        	System.out.println("Los textos son iguales" );
        } else {
        	System.out.println("Los textos no son iguales" );
        }
        
        if (texto1.equalsIgnoreCase(texto2)) {
        	System.out.println("Los textos son iguales sin diferenciar entre mayúsculas y minúsculas." );
        } else {
        	System.out.println("Los textos no son iguales sin diferenciar entre mayúsculas y minúsculas." );
        }
        
        
		

	}

}
