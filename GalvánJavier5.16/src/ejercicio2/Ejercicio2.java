package ejercicio2;
import libtarea3.*;
public class Ejercicio2 {

	public static void main(String[] args) {
			
	//1	
		//1.1
		
		System.out.printf("Nº de dados creados: %s%n", Dado.getNumeroDadosCreados());
		
		//1.2
		
		System.out.printf("Nº de lanzamientos: %s%n", Dado.getNumeroLanzamientosGlobal());
		
		//1.3
		
		System.out.printf("Nº de veces cara: %s%n", Dado.getNumeroVecesCaraGlobal(4));
		
	//2
		//2.1
		int caras;
		
		for (int i = 1; i <= 10; i++) {
		    caras = (int)(Math.random() * 9);
		
		    
		try {
            Dado dado1 = new Dado(caras);
            System.out.println("Lanzamiento: " + dado1.lanzar());

            String historial = "";
            int suma = 0;

            for (int j = 0; j < caras; j++) {
                String resultado = dado1.lanzar();  
                historial = historial + resultado + " ";
                suma += Integer.parseInt(resultado);
            }
            System.out.printf("Dado de %d caras creado correctamente.%n", caras);
            System.out.printf("Serie histórica: %s%n", historial);
            System.out.printf("Suma total de lanzamientos: %d%n%n", suma);
            
        } catch (IllegalArgumentException ex21) {
            System.out.println("No se pudo crear el dado: " + ex21.getMessage());
        }
	
	}
		
	//3
		System.out.println();
		
		System.out.printf("Número total de dados creados: %d\n", Dado.getNumeroDadosCreados());

		System.out.printf("Número total de lanzamientos realizados: %d\n", Dado.getNumeroLanzamientosGlobal());

		System.out.printf("Cantidad total de veces que salió la cara 1: %d\n", Dado.getNumeroVecesCaraGlobal(1));

		System.out.printf("Cantidad total de veces que salió la cara 2: %d\n", Dado.getNumeroVecesCaraGlobal(2));

		System.out.printf("Cantidad total de veces que salió la cara 3: %d\n", Dado.getNumeroVecesCaraGlobal(3));

		System.out.printf("Cantidad total de veces que salió la cara 4: %d\n", Dado.getNumeroVecesCaraGlobal(4));
		
		
		
		
	}

}
