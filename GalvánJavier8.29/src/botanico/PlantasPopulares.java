package botanico;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PlantasPopulares {

	public static void main(String[] args) {
		List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        // Rellenar listas con 10 especies aleatorias
        for (int i = 0; i < 10; i++) {
            lista1.add(Utilidades.especiePlantaAleatoria());
            lista2.add(Utilidades.especiePlantaAleatoria());
        }

        // Mostrar listas iniciales
        System.out.println("Lista 1 inicial:");
        mostrarLista(lista1);

        System.out.println("\nLista 2 inicial:");
        mostrarLista(lista2);

        // Estructuras para resultados
        List<String> plantasPopulares = new ArrayList<>();
        Set<String> plantasUnicas = new HashSet<>();
        List<Integer> posicionesPopulares = new ArrayList<>();

        // Iteradores
        Iterator<String> it1 = lista1.iterator();
        Iterator<String> it2 = lista2.iterator();

        int posicion = 0;

        while (it1.hasNext() && it2.hasNext()) {
            String planta1 = it1.next();
            String planta2 = it2.next();

            // Si coinciden en misma posición
            if (planta1.equals(planta2)) {

                // 1. Guardar en lista de populares
                plantasPopulares.add(planta1);

                // 2. Guardar en conjunto (sin duplicados)
                plantasUnicas.add(planta1);

                // 3. Guardar posición
                posicionesPopulares.add(posicion);

                // 4. Marcar en ambas listas
                String marcada = "*" + planta1 + "*";
                lista1.set(posicion, marcada);
                lista2.set(posicion, marcada);
            }

            posicion++;
        }

        // Mostrar resultados
        System.out.println("\nLista 1 final (marcada):");
        mostrarLista(lista1);

        System.out.println("\nLista 2 final (marcada):");
        mostrarLista(lista2);

        System.out.println("\nPlantas populares:");
        mostrarLista(plantasPopulares);

        System.out.println("\nPosiciones populares:");
        mostrarListaEnteros(posicionesPopulares);

        System.out.println("\nConjunto de plantas populares (sin duplicados):");
        mostrarSet(plantasUnicas);
    }

    // Método para mostrar listas de Strings usando iterador
    public static void mostrarLista(List<String> lista) {
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Método para mostrar listas de enteros usando iterador
    public static void mostrarListaEnteros(List<Integer> lista) {
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    // Método para mostrar sets usando iterador
    public static void mostrarSet(Set<String> set) {
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    

	}

}
