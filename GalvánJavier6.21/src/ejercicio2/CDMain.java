package ejercicio2;

import ejercicio1.Cancion;

public class CDMain {

	public static void main(String[] args) {
		
		CD unCD = new CD();

		unCD.agrega(new Cancion("Cacion1", "Josema"));
		unCD.agrega(new Cancion("Cancion2", "Pablo"));
		unCD.agrega(new Cancion("Cancion3", "Izan"));

        System.out.println("Numero de canciones en el unCD: " + unCD.numeroCanciones());


        unCD.elimina(1);


        CD otroCd = new CD();

        for (int i = 0; i < unCD.numeroCanciones(); i++) {
            otroCd.agrega(unCD.dameCancion(i));
        }

        otroCd.agrega(new Cancion("Cancion4", "Joaquin"));

        System.out.println("\nContenido del unCD:");
        System.out.println(unCD);


        System.out.println("\nContenido de otroCd:");
        System.out.println(otroCd);
    }

	
}

