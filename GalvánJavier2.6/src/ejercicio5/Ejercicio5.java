/*
 * Descripción: Condicionales
 * Autor: Javi
 * Fecha: 06/10/25
 */

package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre;
		System.out.print("Escribe tu nombre: ");
		nombre= entrada.nextLine();
		
		String apellidos;
		System.out.print("Escribe tus apellidos: ");
		apellidos = entrada.nextLine();
		
		String cicloFormativo;
		System.out.print("Escribe tu ciclo formativo: ");
		cicloFormativo= entrada.nextLine();
		
		
		int nota;
		System.out.print("Escribe tu nota academica: ");
		nota = entrada.nextInt();
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + cicloFormativo);
		
		  
		String notaAcademica;
		if (nota < 5) {
			notaAcademica = "Insuficiente";			
			} else {
		    if ( nota >=5 && nota < 6  ) {
		        notaAcademica = "Suficiente";
		    }
		    else { 
		        if ( nota >=6 && nota < 7  ) {
		            notaAcademica = "Bien";
		        }
		        else {
		            if ( nota >= 7 && nota < 9 ) {
		                notaAcademica = "Notable";
		            }
		            else { notaAcademica = "Sobresaliente";	
		            
		    }		                   	  		               		                    		                            	
		}	
		
	}
}
		      System.out.println("Nota Academica: " + nota + " (" + notaAcademica + ")");	   
		       				
		
   }
}
		        
		    


