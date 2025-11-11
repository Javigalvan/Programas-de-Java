/*
 * Descripción: Temperatura de los meses y dias
 * Autor: Javi
 * Fecha: 20/10/25
 */

package arrays;

public class Array2D {

	public static void main(String[] args) {
		
		final int MESES = 12;
		final int TOTAL_DIAS = 30;
		
		 
		int [][] temperatura;	// Declaracion de un array bidimensional
		temperatura = new int [MESES][TOTAL_DIAS];
		
		for (int mes = 0; mes < temperatura.length; mes++) {	// Inicializacion
			for (int dia = 0; dia < temperatura[mes].length; dia++) {
				temperatura[mes][dia] = (int)(Math.random()*40);
			}
		}
		
		for (int mes = 0; mes < temperatura.length; mes++) {	// Mostrando las temperaturas
			for (int dia = 0; dia < temperatura[mes].length; dia++) {
				System.out.print(temperatura[mes][dia] + "\t");
			}
			System.out.println();
		}
		int maxTemp = -1;
		int diaMax = -1;

		for (int mes = 0; mes < temperatura.length; mes++) {
			maxTemp = temperatura[mes][0]; 	// Cada mes inicializo la temperatura mas alta a la temperatura del primer dia
			for (int dia = 1; dia < temperatura[mes].length; dia++) {	// Empiezo a comparar temperaturas a partir del segundo dia
				if (temperatura[mes][dia] > maxTemp) {
					maxTemp = temperatura[mes][dia];
					diaMax = dia;
						
			}
				}	
			System.out.println("El dia " + diaMax + " hubo " + maxTemp);
		}
		
		
		
		for (int mes = 0; mes < temperatura.length ;mes++) {
			int	diaTemp10 = 0;
			do {
				diaTemp10++;			
			} while (temperatura[mes][diaTemp10] > 10);
				System.out.println("Para el mes " + mes + " el primer dia con menos de 10 grados es: " + diaTemp10);
		} 
		
	
		
		
		
		
		
		}
		
		}
