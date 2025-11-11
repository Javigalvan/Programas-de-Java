/*
 * Descripción: ejemplos de tipos de variables
 * Autor: Javi
 * Fecha: 22/09/25
 */
package tiposVariables;

public class EjemplosTipos {

	public static void main(String[] args) {
		int numAlumnos; // Declaramos la variable numAlumnos
		numAlumnos = 0;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		numAlumnos = 12;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		double alturaAlumno = 1.75;
		System.out.println("Valor de la variable: " + alturaAlumno);
		
		char letraDni;
		letraDni = 'A';
		
		String nombreAlumno = "Alberto";
		System.out.println("Valor de la variable: " + nombreAlumno);
		
		final int NUM_MAX_ALUMNOS= 25; //Declaramos una constante
		System.out.println("Valor de la constante: " + NUM_MAX_ALUMNOS);

		final String GRUPO = "DAW1";
				System.out.println("Valor de la constante: " + GRUPO);
				

	}

}
