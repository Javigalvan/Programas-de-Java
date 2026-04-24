package ejerciciosA;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioA1 {

	public static void main(String[] args) {
		
		        Scanner sc = new Scanner(System.in);

		        while (true) {
		            System.out.print("Introduce una ruta (enter para salir): ");
		            String rutaTexto = sc.nextLine();

		            if (rutaTexto.isEmpty()) {
		                break;
		            }

		            File ruta = new File(rutaTexto);

		            try {
		                muestraInfoRuta(ruta);
		            } catch (FileNotFoundException e) {
		                System.out.println("Error: la ruta no existe.");
		            } catch (Exception e) {
		                System.out.println("Error inesperado: " + e.getMessage());
		            }
		        }

		        sc.close();
		    }

		    public static void muestraInfoRuta(File ruta) throws FileNotFoundException {
		        if (!ruta.exists()) {
		            throw new FileNotFoundException();
		        }

		        if (ruta.isFile()) {
		            System.out.println("[A] " + ruta.getName());
		        } else if (ruta.isDirectory()) {
		            File[] lista = ruta.listFiles();

		            if (lista == null) return;

		            // Primero directorios
		            for (File f : lista) {
		                if (f.isDirectory()) {
		                    System.out.println("[*] " + f.getName());
		                }
		            }

		            // Luego archivos
		            for (File f : lista) {
		                if (f.isFile()) {
		                    System.out.println("[A] " + f.getName());
		                }
		            }
		        }
		    
		

	}

}
