package ejercicio16;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		int tamaño = 0;
        for (int i = 1; i <= 10; i++) {
            tamaño += i;
        }		
		
		int[] secuencia = new int[tamaño];
		
		int numeros = 0;
		for (int i=0; i <= 10; i++) {			
			for (int x=0; x < i; x++) {
				secuencia[numeros] = i;
				numeros++;
			}
		}
		
		for (int i = 0; i < secuencia.length; i++) {
            System.out.print(secuencia[i] + " ");
        }
		
		
		
	}

}
