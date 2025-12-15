package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int edad;
		System.out.print("Escribe tu edad: " );
		edad = entrada.nextInt();		
		int nota;
		System.out.print("Escribe una nota: " );
		nota = entrada.nextInt();
		int renta;
		System.out.print("Escribe tu renta: " );
		renta = entrada.nextInt();
		boolean nivelIdioma;
		System.out.print("Escribe tu nivel de idioma: " );
		nivelIdioma = entrada.nextBoolean();
		
		System.out.println(accesoBecaUsa(edad, nota, renta, nivelIdioma));
		

	}
	
	public static boolean accesoBecaUsa (int edad, int nota, int renta, boolean nivelIdioma) {
		
		boolean apto = true;
		
		if (nivelIdioma = false) {
			apto = false;
		}
		if (edad > 30) {
			apto = false;
		}
		if (nivelIdioma = true && edad < 30) {
			if (nota > 9) {
				apto = true;
			} else if (nota < 5) {
				apto = false;
			} else if (renta < 20000) {
				apto = true;
			} else {
				apto = false;
			}			
		}
			return apto;
		
	}

}
