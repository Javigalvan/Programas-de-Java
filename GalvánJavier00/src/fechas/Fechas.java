package fechas;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.DateTimeException;
import java.time.Period;
import java.time.LocalDate;

public class Fechas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int dia, mes, anyo;
		
		System.out.print("Escribe el dia: ");
		dia = entrada.nextInt();
		
		System.out.print("Escribe el mes: ");
		mes = entrada.nextInt();
		
		System.out.print("Escribe el año: ");
		anyo = entrada.nextInt();
		
		LocalDate fechaNacimiento = LocalDate.of(anyo, mes, dia);
		LocalDate ahora = LocalDate.now();		
		
		Period Tiempo = Period.between(fechaNacimiento, ahora);
		System.out.print(Tiempo.toString());
		
	
	}

}
