package ejercicio3;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.DateTimeException;
import java.time.Period;


public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int hora, min;
		
		try {
			LocalTime horario = LocalTime.of(8, 0);
		} catch (DateTimeException ex1) {
			System.out.printf("ERROR, Fecha inválida: %s%n", ex1.getMessage());	
		}
		
				
		
		try {
			
		do {
			System.out.print("Escribe una hora: ");
			hora = entrada.nextInt();
		} while (hora < 0 || hora > 23);
		
		} catch (InputMismatchException ex2) {
			System.out.println("Debes introducir un número entero");
	        entrada.nextLine();
		}
		
		do {
			System.out.print("Escribe un minuto: ");
			min = entrada.nextInt();
		} while (min < 0 || min > 59);
		
		
		

	}

}
