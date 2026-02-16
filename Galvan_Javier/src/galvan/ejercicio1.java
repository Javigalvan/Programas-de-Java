/*
 * Descripción: Analisis de cuentas anual 
 * Autor: Javier Galván
 * Fecha: 28/01/2026
 */

package galvan;

public class ejercicio1 {

	public static void main(String[] args) {
		
		 String[] ciudades = {"Malaga", "Sevilla", "Granada"};
	     int[][] dias = new int[3][12];
	     
	     for (int i = 0; i < dias[0].length; i++) {
	            dias[0][i] = ((int) (Math.random()*20000)%500);
	            System.out.print(dias[0][i] + " ");	          
	     }
	     
	            
	     
	     
		
	}

}
