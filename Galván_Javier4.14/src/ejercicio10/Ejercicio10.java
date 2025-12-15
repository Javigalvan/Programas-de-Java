/*
 * Descripción: Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga si la fecha es correcta o no. Se debe crear una función donde le pasemos los datos y devuelva si es correcta o no. 
 * Autor: Javi
 * Fecha: 14/11/25
 */

package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dia;
		System.out.print("Escribe un dia: " );
		dia = entrada.nextInt();
		
		int mes;
		System.out.print("Escribe un mes: " );
		mes = entrada.nextInt();
		
		int anio;
		System.out.print("Escribe un año: " );
		anio = entrada.nextInt();
		
		boolean fechaCorrecta = fechaEsCorrecta(dia, mes, anio);
		
		System.out.print("La fecha es " + fechaCorrecta);
		

	}
	
	public static boolean fechaEsCorrecta(int dia, int mes, int anio) {
		
		boolean fechaCorrecta;
		int diasMes;
		
		if (anio < 1 || anio > 2025) {
            return false;
        }
		
		if (mes < 1 || mes > 12) {
            return false;
        }
		
		 if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
		            diasMes = 31;
		            fechaCorrecta = true;
		        }
		        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
		            diasMes = 30;
		            fechaCorrecta = true;
		        }
		        else {	          
		                diasMes = 28;
		                fechaCorrecta = true;
		            }
		 if (dia >= 1 && dia <= diasMes) {
			 fechaCorrecta = true;	         
	        } else {
	        	fechaCorrecta = false;
	        }
		 return fechaCorrecta;
		  }
		
}