package ejercicios2_25;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		System.out.println("numero: ");
		numero = entrada.nextInt();
		
		int suma =0;
		int sumafinal=0;
	
		
		while (numero > 0) {
            suma = suma + (numero % 10); 
            numero = numero / 10;   	
            sumafinal = suma + numero;
            
            
        }
		
		System.out.println(sumafinal);
		
		

	}

}
