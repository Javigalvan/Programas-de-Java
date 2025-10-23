/*
 * Descripción: Mostrar números del 1 al 100 con do-while
 * Autor: Javi
 * Fecha: 15/10/25
 */

package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numero = 1;
		
		if (numero <= 100) {
            do {
                System.out.print(numero + " ");
                numero++;
            } while (numero <= 100);
        
        }

	}

}
