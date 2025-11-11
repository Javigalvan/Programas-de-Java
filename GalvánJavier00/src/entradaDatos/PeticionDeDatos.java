package entradaDatos;

import java.util.Scanner;

public class PeticionDeDatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		System.out.print("Dime tu edad: ");
		edadAlumno = teclado.nextInt();
		System.out.println("La edad es: " + edadAlumno);
		
		teclado.nextLine(); //Despues de pedir valor numerico y antes de pedir la cadena de caracteres
		String nombre;
		System.out.print("dime tu nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Tu nombre es: " + nombre);
		
		System.out.println("Dime tu peso: ");
		double pesoAlumno;
		pesoAlumno = teclado.nextDouble();
		System.out.println("Tu peso es: " + pesoAlumno);
	}

}
