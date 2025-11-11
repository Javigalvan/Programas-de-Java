package arrays;

public class Array1 {

	public static void main(String[] args) {
		
		
		final int TAMAYIO = 20;
		 
		int [] numeros; // Declaramos array de enteros
		numeros = new int [TAMAYIO]; // Iniciamos el array
		
		for (int posicion = 0; posicion < 20; posicion++) {
			numeros[posicion] = (int) (Math.random()*50); // Inicializamos a 0 todas las posciciones
		}
		
		for (int posicion = 0; posicion < 20; posicion++) {
			System.out.println("El valor de la posicion " + posicion + " es " + numeros[posicion]);
		}

	}

}
