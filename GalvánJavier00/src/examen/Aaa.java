package examen;
import java.util.Random;
public class Aaa {

	public static void main(String[] args) {
		
		        int[] numeros = new int[40];
		        Random random = new Random();

		        // Generar 40 números aleatorios entre 0 y 50
		        for (int i = 0; i < numeros.length; i++) {
		            numeros[i] = random.nextInt(51); // 0 a 50 inclusive
		        }

		        // Mostrar los 40 números, 20 por línea, alineados en columnas
		        System.out.println("Números generados:");
		        for (int i = 0; i < numeros.length; i++) {
		            System.out.printf("%4d", numeros[i]); // alineados en columnas
		            if ((i + 1) % 20 == 0) {
		                System.out.println(); // salto de línea cada 20 números
		            }
		        }

		        // Calcular la media aritmética de los valores en posiciones pares
		        double sumaPares = 0;
		        int contadorPares = 0;

		        for (int i = 0; i < numeros.length; i += 2) { // solo posiciones pares
		            sumaPares += numeros[i];
		            contadorPares++;
		        }

		        double media = sumaPares / contadorPares;
		        System.out.printf("%nMedia aritmética de las posiciones pares: %.2f%n", media);

		        // Mostrar valores de posiciones impares por debajo de la media
		        System.out.println("Valores en posiciones impares por debajo de la media:");
		        for (int i = 1; i < numeros.length; i += 2) { // posiciones impares
		            if (numeros[i] < media) {
		                System.out.printf("Posición %2d -> Valor: %2d%n", i, numeros[i]);
		            }
		        }
		    


	}

}
