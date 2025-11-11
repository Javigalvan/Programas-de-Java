package estructuraRepetitiva;

import java.util.Scanner;

public class EstructuraRepetitivaFor2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int inicio;
		System.out.println ("Dime un numero de inicio: ");
		inicio = teclado.nextInt();
		
		int fin;
		System.out.println ("Dime un numero de fin: ");
		fin = teclado.nextInt();
		
		int contador;
		
            for ( contador = inicio; contador <= fin; contador++) {
            	if (contador % 5 == 0) {
            		System.out.print(contador + " ");
		
			}
			}
	}

	}

