package Galvan;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int N;
        System.out.print("Escribe un numero: " );
        N = entrada.nextInt(); // Pedimos al usuario la variable N
        
        int M;
        System.out.print("Escribe un numero: " );
        M = entrada.nextInt(); // Pedimos al usuario la variable M
        
        int numero;
        if (N < M) {
            numero = N;
            do {
            	if (numero % 3 == 0 && numero % 5 == 0) { // Si es multiplo de 3 y 5 lo mostramos
            		System.out.print(numero + " ");
            	}	              
                numero++;
            } while (numero < M);
        } else {
        	System.out.print("Error. El numero 'n' es mayor que 'M'"); // Mostramos el error
        }

	}

}
