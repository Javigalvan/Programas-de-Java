/*
 * Descripción: Crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno 1”, “Alumno 2”, etc.) y 5 asignaturas. 
 El usuario introducirá las notas por teclado y luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 * Autor: Javi
 * Fecha: 06/11/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		double[][] notas = new double[4][5];

        
        for (int i = 0; i < 4; i++) {
            System.out.println("Introduce las notas del Alumno " + (i + 1));
            for (int j = 0; j < 5; j++) {
                System.out.print(" Nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = entrada.nextDouble();
            }
            System.out.println();
        }
		
        
        for (int i = 0; i < 4; i++) {
            double suma = 0;
            double min = notas[i][0];
            double max = notas[i][0];

        for (int j = 0; j < 5; j++) {
                double num = notas[i][j];
                suma += num;
                if (num < min) min = num;
                if (num > max) max = num;
            }
            
            double media = suma / 5;
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nota mínima: " + min);
            System.out.println("Nota máxima: " + max);
            System.out.println("Nota media : " + media);
            System.out.println();
        }
        
	}

}
