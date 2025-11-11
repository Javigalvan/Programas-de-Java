package estructuraRepetitiva;

import java.util.Scanner;

public class EstructuraRepetitiva2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in); 
		
		int inicio, fin;
		System.out.print ("Dime un numero de inicio: ");
		inicio = teclado.nextInt();

		System.out.print("Dime un numero de fin: ");
		fin = teclado.nextInt();
		
		int numero;

		System.out.println ("Secuencia de números desde " + inicio + " hasta " + fin);

		numero = inicio;
		
					    
		if  (inicio < fin) {
			while (numero <= fin) 
		    System.out.print (numero + " ");
		    numero ++;
		} else if (numero > fin) {		
			System.out.print(numero + " ");
			numero = numero + 1;
		}
			
			
			   
		}
		
		
	}


