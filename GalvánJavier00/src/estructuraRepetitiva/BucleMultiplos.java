package estructuraRepetitiva;

import java.util.Scanner;

public class BucleMultiplos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int inicio, fin;
		System.out.print ("Dime un numero de inicio: ");
		inicio = teclado.nextInt();

		System.out.print("Dime un numero de fin: ");
		fin = teclado.nextInt();
		

		System.out.println ("Secuencia de números desde " + inicio + " hasta " + fin);
		
		int numero;
		
		 if (inicio <= fin) {
	            numero = inicio;
	            do {
	            	if (numero % inicio == 0) {
	            		System.out.print(numero + " ");
	            	}	              
	                numero++;
	            } while (numero <= fin);
	        } else {
	            numero = inicio;
	            do {
	            	if (numero % inicio == 0) {
	            		System.out.print(numero + " ");
	            	}
	                System.out.print(numero + " ");
	                numero--;
	            } while (numero >= fin);
	        }
		

	}

}
