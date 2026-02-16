package ejercicio2;

import java.util.Arrays;

import ejercicio1.Cancion;

public class CD {
	
	 	public static final int TAMANIO_DEFAULT = 10;

	    private Cancion[] canciones;
	    private int contador;


	    public CD() {
	        this.canciones = new Cancion[TAMANIO_DEFAULT];
	        this.contador = 0;
	    }

	    public int numeroCanciones() {
	        return contador;
	    }

	    public Cancion dameCancion(int posicion) {
	        comprobarIndice(posicion);
	        return canciones[posicion];
	    }

	    public void grabaCancion(int posicion, Cancion nuevaCancion) {
	        if (nuevaCancion == null) {
	            throw new IllegalArgumentException("La canción no puede ser null");
	        }
	        comprobarIndice(posicion);
	        canciones[posicion] = nuevaCancion;
	    }

	    public void agrega(Cancion cancion) {
	        if (cancion == null) {
	            throw new IllegalArgumentException("La canción no puede ser null");
	        }
	        if (contador >= canciones.length) {
	            throw new IllegalStateException("El CD está lleno");
	        }
	        canciones[contador] = cancion;
	        contador++;
	    }


	    public void elimina(int posicion) {
	        comprobarIndice(posicion);

	        for (int i = posicion; i < contador - 1; i++) {
	            canciones[i] = canciones[i + 1];
	        }
	        contador--;
	    }

	    private void comprobarIndice(int posicion) {
	        if (posicion < 0 || posicion >= contador) {
	            throw new IllegalArgumentException ("Índice fuera de rango. Debe estar entre 0 y " + (contador - 1));
	        }
	    }

		@Override
		public String toString() {
			return "CD: " + Arrays.toString(canciones);
		}
	    
}
