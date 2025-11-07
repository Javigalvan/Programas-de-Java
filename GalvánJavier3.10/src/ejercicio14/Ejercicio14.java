/*
 * Descripción: Un programa que cree un array de enteros e introduzca la siguiente secuencia de valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. 
   hasta introducir 10 diez veces, y luego la muestre por pantalla
 * Autor: Javi
 * Fecha: 05/11/25
 */

package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
				
		int tamaño = 0;
        for (int i = 1; i <= 10; i++) {
            tamaño += i;
        }		
		
		int[] secuencia = new int[tamaño];
		
		int numeros = 0;
		for (int i=0; i <= 10; i++) {			
			for (int x=0; x < i; x++) {
				secuencia[numeros] = i;
				numeros++;
			}
		}
		
		for (int i = 0; i < secuencia.length; i++) {
            System.out.print(secuencia[i] + " ");
        }
		}

	}


