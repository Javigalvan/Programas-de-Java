/*
 * Descripción: Necesitamos crear un programa para registrar sueldos de hombres y mujeres de una empresa y detectar si existe brecha salarial entre ambos. 
 El programa pedirá por teclado la información de N personas distintas (valor también introducido por teclado). Para cada persona, pedirá su género (0 para varón y 1 para mujer) 
 y su sueldo. Esta información debe guardarse en una única matriz. Luego se mostrará por pantalla el sueldo medio de cada género
 * Autor: Javi
 * Fecha: 06/11/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿Cuántas personas vas a registrar? ");
        int n = entrada.nextInt();

        double[][] datos = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.println("Persona " + (i + 1));
            int genero;          
            System.out.print("Género (0 = Hombre, 1 = Mujer): ");
            genero = entrada.nextInt();          
            System.out.print("Sueldo: ");
            double sueldo = entrada.nextDouble();

            datos[i][0] = genero;
            datos[i][1] = sueldo;
        }

        
        double sumaHombres = 0, sumaMujeres = 0;
        int contHombres = 0, contMujeres = 0;

        for (int i = 0; i < n; i++) {
            if (datos[i][0] == 0) {
                sumaHombres += datos[i][1];
                contHombres++;
            } else { 
                sumaMujeres += datos[i][1];
                contMujeres++;
            }
        }

        double mediaHombres = 0;
        double mediaMujeres = 0;
   
        mediaHombres = sumaHombres / contHombres;
        
        mediaMujeres = sumaMujeres / contMujeres;      

        System.out.println("Sueldo medio de hombres: "+ mediaHombres);
        System.out.println("Sueldo medio de mujeres: "+ mediaMujeres);

        if (mediaHombres > mediaMujeres) {
            System.out.println("Hay brecha salarial, los hombres ganan más que las mujeres");               
        } else if (mediaMujeres > mediaHombres) {
            System.out.println("Hay brecha salarial, las mujeres ganan más que los hombres");
        } else {
            System.out.println("No hay brecha salarial");
        }

	}

}
