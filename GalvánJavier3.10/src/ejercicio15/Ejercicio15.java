/*
 * Descripción: Un programa 
 * Autor: Javi
 * Fecha: 05/11/25
 */

package ejercicio15;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n;
        System.out.print("Escribe un tamaño: " );
        n = entrada.nextInt();
        
		int m;
        System.out.print("Escribe valor: " );
        m = entrada.nextInt();
        
        int[] almacen = new int[n];
        
        for (int i=0; i<n; i++) {
        	almacen[i] = m;        	
        }
        for (int i=0; i<n; i++) {
        	System.out.print(almacen[i] + " ");     	
        }

	}

}
