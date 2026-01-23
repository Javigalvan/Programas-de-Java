package ejercicio2;

import java.util.Arrays;

import libtarea3.Bombo;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		try {
			Bombo bombo1error = new Bombo(Bombo.MINIMA_CAPACIDAD-1);
		} catch (IllegalArgumentException e){
			System.out.printf("ERROR, %s%n", e.getMessage());	
		}
		

		try {
			Bombo bombo2error = new Bombo(Bombo.MAXIMA_CAPACIDAD+1);

		} catch (IllegalArgumentException e){
			System.out.printf("ERROR, %s%n", e.getMessage());	
		}

		try {
			Bombo bombo1 = new Bombo();
		} catch (IllegalArgumentException e){
			System.out.printf("ERROR, %s%n", e.getMessage());	
		}

		Bombo bombo1;
		

		try {
			 bombo1 = new Bombo(15);
		} catch (IllegalArgumentException e){
			System.out.printf("ERROR, %s%n", e.getMessage());	
			bombo1 = new Bombo(15);
		}


 		System.out.printf("Estado actual %s%n", bombo1.getCapacidad());
		System.out.printf("Cantidad Bolas Extraidas %s%n", bombo1.getCantidadBolasExtraidas());
		System.out.printf("Cantidad Bolas Restantes %s%n", bombo1.getCantidadBolasRestantes());
	
		System.out.printf("Listado de bolas extraídas: %s%n", Arrays.toString(bombo1.getArrayBolasExtraidas()));
		System.out.printf("Número total de bolas extraídas: %d%n", bombo1.getCantidadBolasExtraidas());

		System.out.printf("Listado de bolas restantes: %s%n", Arrays.toString(bombo1.getArrayBolasRestantes()));
		System.out.printf("listado de las bolas restantes %s%n%n", bombo1.getCantidadBolasRestantes());

		

		for (int i=0; i<15; i++) {
			System.out.printf("extraer bola %s%n", bombo1.extraerBola());	
		}

		

		System.out.printf("%n");
		System.out.printf("Estado actual %s%n", bombo1.getCapacidad());
		System.out.printf("Cantidad Bolas Extraidas %s%n", bombo1.getCantidadBolasExtraidas());
		System.out.printf("Cantidad Bolas Restantes %s%n", bombo1.getCantidadBolasRestantes());
		System.out.printf("Listado de bolas extraídas: %s%n", Arrays.toString(bombo1.getArrayBolasExtraidas()));
		System.out.printf("Número total de bolas extraídas: %d%n", bombo1.getCantidadBolasExtraidas());

		System.out.printf("Listado de bolas restantes: %s%n", Arrays.toString(bombo1.getArrayBolasRestantes()));
		System.out.printf("listado de las bolas restantes %s%n%n", bombo1.getCantidadBolasRestantes());

		
		System.out.printf("Reinicio %s%n", bombo1.reset());

		int numero = (int) (Math.random() * 4) + 11;

		for (int i=0; i<numero; i++) {
			System.out.printf("extraer bola %s%n", bombo1.extraerBola());	
		}

		

		System.out.printf("%n");
		System.out.printf("Estado actual %s%n", bombo1.getCapacidad());
		System.out.printf("Cantidad Bolas Extraidas %s%n", bombo1.getCantidadBolasExtraidas());
		System.out.printf("Cantidad Bolas Restantes %s%n", bombo1.getCantidadBolasRestantes());

		System.out.printf("Listado de bolas extraídas: %s%n", Arrays.toString(bombo1.getArrayBolasExtraidas()));
		System.out.printf("Número total de bolas extraídas: %d%n", bombo1.getCantidadBolasExtraidas());
			
		System.out.printf("Listado de bolas restantes: %s%n", Arrays.toString(bombo1.getArrayBolasRestantes()));
		System.out.printf("listado de las bolas restantes %s%n%n", bombo1.getCantidadBolasRestantes());

	}

}
