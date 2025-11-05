/*
 * Descripción:  Un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos
 * Autor: Javi
 * Fecha: 23/10/25
 */			

package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		int numero;
		int contadorPositivos = 0;
		int contadorNegativos = 0;
		
				
		do {
			System.out.print("Escribe un número: "); 
            numero = entrada.nextInt();  
            
            if (numero < 0) {		
				contadorNegativos++;
			} else if (numero > 0) {
         	   contadorPositivos++;             	   
			} 
            
		} while (numero != 0);
		
		if (contadorNegativos > 0) {
            System.out.println("Se ha introducido al menos un número negativo.");
        } else {
            System.out.println("No se ha introducido ningún número negativo.");
        }	
          
		

		System.out.println("Se han leido " + contadorNegativos + " numeros negativos");	 
        System.out.println("Se han leido " + contadorPositivos + " numero positivos");
				
		

	}

}
