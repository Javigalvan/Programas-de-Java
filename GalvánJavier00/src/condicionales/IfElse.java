package condicionales;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		int nota;
		System.out.print("Introduzca un número entero: ");
		nota = entrada.nextInt(); 
		
		if (nota >= 0 && nota <= 10) {
		} else {
			System.out.println("Error");
		}
		
		if (nota >= 5 ) {
		    System.out.println("Aprobado");
		} else {
				System.out.println("Suspenso");
		
		}
			
		}
		}

	


