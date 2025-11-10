/*
 * Descripción: Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos. Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
las tres primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y “Alcocer” mostrará “LIOTARALC”.
 * Autor: Javi
 * Fecha: 10/11/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: " );
        String nombre = entrada.nextLine();
        
        System.out.print("Escribe tu 1 apellido: " );
        String apellido1 = entrada.nextLine();
        
        System.out.print("Escribe tu 2 apellido: " );
        String apellido2 = entrada.nextLine();
        
        String letras1 = nombre.substring(0, 3);
        String letras2 = apellido1.substring(0, 3);
        String letras3 = apellido2.substring(0, 3);
        
        
        System.out.print(letras1.toUpperCase() + letras2.toUpperCase() + letras3.toUpperCase());
		
		
		

	}

}
