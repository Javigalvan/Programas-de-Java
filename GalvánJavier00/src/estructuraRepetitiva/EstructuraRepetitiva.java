package estructuraRepetitiva;

import java.util.Scanner;

public class EstructuraRepetitiva {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in); 
		
		
		int num, suma, contador;
		System.out.print("Escribe un numero: ");
		num = teclado.nextInt();
		contador = 1;
		suma = num;
		
		while (num != 0 && contador != 3) {
			System.out.print("Escribe un numero: ");
			num = teclado.nextInt();
			contador = contador + 1;
			suma = suma + num;	//acumulador
		}
		System.out.print("La suma es: " + suma);
		
		
		
	}

}
