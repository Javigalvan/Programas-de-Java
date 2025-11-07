/*
 * Descripción: Un programa que cree un array de 10 enteros y luego muestre el siguiente menú con distintas opciones:
a. Mostrar valores.
b. Introducir valor.
c. Salir.
La opción ‘a’ mostrará todos los valores por pantalla. La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente
hasta que el usuario elija la opción ‘c’ que terminará el programa.
 * Autor: Javi
 * Fecha: 03/11/25
 */

package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int[] num1 = new int[10];
		
		 String operacion; 
	     int v, p;

	        do {
	          
	            System.out.println("Indique la operación que quiere realizar:");
	            System.out.println("a) Mostrar valores");
	            System.out.println("b) Introducir valor");
	            System.out.println("c) Salir");	            
	            
	            operacion = entrada.nextLine();	            

	            if (operacion.equals("a")) {	                
	                System.out.println("Valores del array:");
	                for (int i = 0; i < num1.length; i++) {
	                    System.out.println("Posición " + i + ": " + num1[i]);
	                }
	            } else if (operacion.equals("b")) {	                
	                System.out.print("Dime un valor: ");
	                v = entrada.nextInt();
	                System.out.print("Dime una posición (0-9): ");
	                p = entrada.nextInt();

	                if (p >= 0 && p < 10) {
	                    num1[p] = v;
	                    System.out.println("Valor " + v + " introducido en la posición " + p + ".");                    
	                }
	            } else if (operacion.equals("c")) {
	                
	                System.out.println("Saliendo del programa...");	            
	            }

	        } while (!operacion.equals("c")); 

	}

}
