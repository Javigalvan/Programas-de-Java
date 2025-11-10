/*
 * Descripción: Crea un programa que pida una cadena de texto por teclado y luego muestre cada palabra de la cadena en una línea distinta.
 * Autor: Javi
 * Fecha: 10/11/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Escribe una cadena de texto: " );
        String texto = entrada.nextLine();
        
        String[] cadenaTexto = texto.split("\s+");
        
        for (int i = 0; i < cadenaTexto.length; i++) {
            System.out.println(cadenaTexto[i]);
        }
        

	}

}
