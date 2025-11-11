package examen;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompararCadenas {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String posibleDni;
		
		// Generamos el patrón
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		
		System.out.print("Dime el dni: " );
		posibleDni = entrada.nextLine();
		
		Matcher texto = patron.matcher(posibleDni);
		
		if (texto.matches()) {
			System.out.print("El DNI tiene forma correcta ");
		} else {
			System.out.print("El DNI no tiene forma correcta ");
		}
		
		
		
		
		
		
		
	}

}
