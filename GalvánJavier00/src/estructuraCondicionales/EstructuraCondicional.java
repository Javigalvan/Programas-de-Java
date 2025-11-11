package estructuraCondicionales;

import java.util.Scanner;

public class EstructuraCondicional {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

	        final int TOTAL_PREGUNTAS = 20;

	        System.out.print("Escribe el número de preguntas acertadas: ");
	        int aciertos = entrada.nextInt();

	        System.out.print("Escribe el número de preguntas falladas: ");
	        int fallos = entrada.nextInt();
	    	        
	        if ((aciertos + fallos) > TOTAL_PREGUNTAS) {
	            System.out.println("Datos erróneos");
	        } else {  
	        
	            double nota = aciertos - (fallos * 0.5);
	          
	            double notaFinal = (nota / 2);
	            
	            if (notaFinal < 0) {
	                notaFinal = 0;
	            }
	           	          	        
	            String notaCualitativa;

	            if (notaFinal >= 9) {
	                notaCualitativa = "Sobresaliente";
	            } else if (notaFinal >= 7) {
	                notaCualitativa = "Notable";
	            } else if (notaFinal >= 6) {
	                notaCualitativa = "Bien";
	            } else if (notaFinal >= 5) {
	                notaCualitativa = "Suficiente";
	            } else {
	                notaCualitativa = "Insuficiente";
	            }

	          
	            System.out.println("Nota numérica: " + notaFinal);
	            System.out.println("Nota cualitativa: " + notaCualitativa);
	        }
	}
}


