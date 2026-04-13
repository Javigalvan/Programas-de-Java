package operArrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainOperArrayList {

	public static void main(String[] args) {
		
		File archivo = new File("notas/notas1.txt");
		
		ArrayList<Alumnos> lista = new ArrayList<>();
		
		//1, 2
		importarContenido(archivo, lista);
		
		//3
		ordenarLista(lista);
		
        System.out.println("\nLista ordenada:");
        mostrarLista(lista);
        
		//4
        lista.add(new Alumnos("1º ESO D", "López Muro, Rosario",3, 3, 4, 4, 3));
        
        //5
        int mitad = lista.size() / 2;
        
        lista.add(mitad, new Alumnos("1º ESO B","Duarte Durán, Alba",2, 3, 4, 1, 3));
        
        //6
        System.out.println("\nPosición del último registro insertado: " + mitad);
        
        
        //7
        ArrayList<Alumnos> listaAux = new ArrayList<>();
        
        File archivo2 = new File("notas/notas2.txt");

        importarContenido(archivo2, listaAux);
        
        lista.addAll(listaAux);
        
        //8
        buscarAlumno(lista, "Cordero Benítez, Alejandro");
        
        //9
        buscarAlumno(lista, "Fernández Villalón, Carlos");     
        
	}
	
	public static void importarContenido(File archivo, ArrayList<Alumnos> lista) {
		try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            int contador = 0;

            while ((linea = br.readLine()) != null) {
            	
                String[] partes = linea.split("[;]");
                
                if (partes.length == 7) {
                    String grupo = partes[0];
                    String nombre = partes[1];
                    int matematicas = Integer.parseInt(partes[2]);
                    int lengua = Integer.parseInt(partes[3]);
                    int fisica = Integer.parseInt(partes[4]);
                    int quimica = Integer.parseInt(partes[5]);
                    int ingles = Integer.parseInt(partes[6]);

                    Alumnos alumno = new Alumnos(grupo, nombre, matematicas, lengua, fisica, quimica, ingles);
                    lista.add(alumno);                  
                    contador++;
                }
                
            }           
            System.out.println("\nNumero de registros: " + contador);
            
        } catch (IOException e) {
            System.out.println("Error. " + e.getMessage());
        }
				
	}
	public static void mostrarLista(ArrayList<Alumnos> lista) {
        for (Alumnos a : lista) {
            System.out.println(a);
        }
    }
	public static void ordenarLista(ArrayList<Alumnos> lista) {
        lista.sort(new Comparator<Alumnos>() {
            @Override
            public int compare(Alumnos a1, Alumnos a2) {
                int cmpGrupo = a1.getGrupo().compareTo(a2.getGrupo());
                if (cmpGrupo != 0) {
                    return cmpGrupo;
                }
                return a1.getNombre().compareTo(a2.getNombre());
            }
        });
    }
	public static void buscarAlumno(ArrayList<Alumnos> lista, String nombreBuscado) {
		boolean encontrado = false;

	    for (Alumnos a : lista) {
	        if (a.getNombre().equalsIgnoreCase(nombreBuscado)) {
	            System.out.println("\nAlumno encontrado:");
	            System.out.println(a);
	            encontrado = true;
	        }
	    }
	    if (!encontrado) {
	            System.out.println("Alumno no encontrado.");
	        }
}

}
