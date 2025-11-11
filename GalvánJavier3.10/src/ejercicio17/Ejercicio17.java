package ejercicio17;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int[] valores1 = new int[10];
        int[] valores2 = new int[10];
        int n;

        int[] valores1 = new int[10];
        int[] valores2 = new int[10];
        int n;


        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            n = entrada.nextInt();
            Arrays.fill(valores1, i, i + 1, n);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 11) + ": ");
            n = entrada.nextInt();
            Arrays.fill(valores2, i, i + 1, n);
        }

        System.out.println("\nPrimer array: " + Arrays.toString(valores1));
        System.out.println("Segundo array: " + Arrays.toString(valores2));

        if (Arrays.equals(valores1, valores2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
        
        
	}

}

