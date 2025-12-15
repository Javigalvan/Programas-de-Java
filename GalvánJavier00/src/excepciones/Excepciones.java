package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		 System.out.println("Dime un entero");
		 int entero;
		 boolean error=false;
		 
		 do {
		 try {
			 teclado.close();
			 entero = teclado.nextInt();
			 error = true;	 
		 } catch (InputMismatchException exTipoDiferente) {					 		
			 System.out.println("Te has equivocado, introduce otro");
			 teclado.nextLine();
			 entero=0;
		 	} catch(RuntimeException ex1) {
		 		error = false;
		 		System.out.println("No se puede accerder a la consola");
		 		teclado.nextLine();
		 		entero=0;
		 	}
		 
		 } while (error==false);
		
			 
		 
		 System.out.println("El numero es " + entero);
		 
		 
		 } 
	}