package condicionales;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.print("Introduzca un número entero: ");
		numero = entrada.nextInt(); 
		if (numero > 0) {
		    System.out.println("Positivo");
		    if (numero > 50)
		    	System.out.println("Mayor que 50");
		} else {
			if (numero == 0) {
				System.out.println("Cero");
		} else { 
			System.out.println("Negativo");
		}
		}


	}
}

