/*
 * Descripción:  Un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.
 * Autor: Javi
 * Fecha: 23/10/25
 */

package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int p, q;
		
        System.out.print("Escribe el numero n: " );
        p = entrada.nextInt();                      	              	
       
        System.out.print("Escribe el numero m: " );
        q = entrada.nextInt(); 
        
        if (p > q) {
            System.out.println("p tiene que ser menor o igual que q.");
        } else {
            
            int tamaño = q - p + 1;
            
            int[] contenedor = new int[tamaño];

            for (int i = 0; i < tamaño; i++) {
                contenedor[i] = p + i;
            }

           
            for (int i = 0; i < tamaño; i++) {
                System.out.print(contenedor[i] + " ");
                
            }
            
		
        }
	}

	}
