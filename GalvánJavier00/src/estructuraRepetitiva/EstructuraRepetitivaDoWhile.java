package estructuraRepetitiva;

import java.util.Scanner;

public class EstructuraRepetitivaDoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero, suma = 0, contador = 0;
		
		do {
			System.out.print ("Dime un numero: ");
			numero = entrada.nextInt();
			suma = suma + numero;
			if (numero != 0) {
				contador = contador + 1;
			}
		} while (numero != 0);
		
		
		
		System.out.print ("La suma es: " + suma + " y la cantidad de numeros es: " + contador);

			
	}

}
