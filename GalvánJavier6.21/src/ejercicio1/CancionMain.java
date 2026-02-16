package ejercicio1;


public class CancionMain {

	public static void main(String[] args) {
		
		try {

            Cancion c1 = new Cancion();

            Cancion c2 = new Cancion();

            c2.ponTitulo("Despacito");    

            try {
                c2.ponTitulo(""); 
            } catch (IllegalArgumentException e) {
                System.out.println("Error al cambiar título: " + e.getMessage());
            }

            Cancion c3 = c2.clonar();

            Cancion c3clon = c3;

            c3clon.ponAutor("Josema");

            System.out.println("Canción 1: " + c1);
            System.out.println("Canción 2: " + c2);
            System.out.println("Canción 3: " + c3);

        } catch (IllegalArgumentException e) {
            System.out.println("Error general del programa: " + e.getMessage());
        }
	

	}

}
