package OperArrayListEntero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


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
        
        //10
        int posicion = mitad +1;
        if (posicion < lista.size()) {

            Alumnos eliminado = lista.remove(posicion);

            System.out.println("\nRegistro eliminado:");
            System.out.println(eliminado);

        } else {
            System.out.println("No existe esa posición.");
        }
        
        //11
        for (int i = 0; i < 10 && !lista.isEmpty(); i++) {
            lista.remove(0);
        }
      //12
        borrarMatematicas2(lista);

        //13
        System.out.println("\nMedia de cada alumno:");
        for (Alumnos a : lista) {
            double media = (a.getMatematicas() + a.getLengua() + a.getFisica() + a.getFisica() + a.getIngles()) / 5.0;
            System.out.println(a.getNombre() + " -> " + media);
        }

        //14, 15 y 16
        Map<String, ArrayList<Alumnos>> grupos = new HashMap<>();

        // Crear grupos
        for (Alumnos a : lista) {
            if (!grupos.containsKey(a.getGrupo())) {
                grupos.put(a.getGrupo(), new ArrayList<>());
            }
            grupos.get(a.getGrupo()).add(a);
        }

        // Recorrer grupos
        for (String grupo : grupos.keySet()) {

            ArrayList<Alumnos> sub = grupos.get(grupo);

            //14 Ordenar por nombre descendente
            sub.sort((a1, a2) -> a2.getNombre().compareTo(a1.getNombre()));

            System.out.println("\nGrupo: " + grupo);
            mostrarLista(sub);

            //15 Media por materia
            double m=0,l=0,f=0,q=0,i=0;

            for (Alumnos a : sub) {
                m += a.getMatematicas();
                l += a.getLengua();
                f += a.getFisica();
                q += a.getFisica();
                i += a.getIngles();
            }

            int n = sub.size();

            if (n > 0) {
                System.out.println("Medias -> Mat:" + m/n + " Len:" + l/n +
                        " Fis:" + f/n + " Qui:" + q/n + " Ing:" + i/n);
            }

            //16 Top 10 matemáticas
            sub.sort((a1, a2) -> {
                int cmp = Integer.compare(a2.getMatematicas(), a1.getMatematicas());
                if (cmp == 0) {
                    return a1.getNombre().compareTo(a2.getNombre());
                }
                return cmp;
            });

            System.out.println("Top 10 Matemáticas:");
            for (int j = 0; j < Math.min(10, sub.size()); j++) {
                System.out.println(sub.get(j));
            }
        }
        
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
	public static void borrarMatematicas2(ArrayList<Alumnos> lista) {

	    Iterator<Alumnos> it = lista.iterator();
	    int contador = 0;

	    while (it.hasNext()) {
	        Alumnos a = it.next();

	        if (a.getMatematicas() == 2) {
	            it.remove();
	            contador++;
	        }
	    }

	    System.out.println("Registros borrados: " + contador);
	}
}

