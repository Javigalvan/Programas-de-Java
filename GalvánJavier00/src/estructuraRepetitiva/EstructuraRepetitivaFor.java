package estructuraRepetitiva;

import java.util.Scanner;

public class EstructuraRepetitivaFor {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int numero;
		System.out.println ("Dime un numero: ");
		numero = teclado.nextInt();
		
		for (int contador = 10; contador >= 1; contador--) {
			System.out.println (numero + " multiplicado por " + contador + " = " + numero*contador);
		}
		
		    
		    
		    
		    
		}

	}


