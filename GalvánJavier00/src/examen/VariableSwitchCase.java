package examen;

import java.util.Scanner;

public class VariableSwitchCase {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dime la nota: ");
		int nota = entrada.nextInt();
		
		String notaTexto;
		
		switch (nota) {
			case 1,2:{
				notaTexto = "Insuficiente";
				break;
			}
			case 3: case 4: {
				notaTexto = "Insuficiente";
				break;				
			}
			case 5: {
				notaTexto = "Suficiente";
				break;				
			} 
			case 6: {
				notaTexto = "Bien";
				break;	
			}
			case 7,8: {
				notaTexto = "Notable";
				break;				
			}
			case 9,10: {
				notaTexto = "Sobresaliente";
				break;				
			}
			default:{
				notaTexto = "Valor no valido";
			}
													
		}
		
			System.out.println("La nota es: " + notaTexto);

	}

}
