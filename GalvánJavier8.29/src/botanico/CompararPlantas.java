package botanico;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CompararPlantas {

	public static void main(String[] args) {
		List<String> especiesBase = Arrays.asList(
                "Rosa", "Lavanda", "Girasol", "Orquídea", "Cactus",
                "Helecho", "Bonsái", "Margarita", "Tulipán", "Aloe Vera"
        );

        Random random = new Random();

        // 1. Crear y rellenar dos listas con 20 plantas aleatorias
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lista1.add(especiesBase.get(random.nextInt(especiesBase.size())));
            lista2.add(especiesBase.get(random.nextInt(especiesBase.size())));
        }

        // Mostrar listas
        System.out.println("Lista 1:");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.println(i + ": " + lista1.get(i));
        }

        System.out.println("\nLista 2:");
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(i + ": " + lista2.get(i));
        }

        // 2. Crear el Map<String, List<Integer>>
        Map<String, List<Integer>> coincidencias = new HashMap<>();

        // 3. Comparar ambas listas
        for (int i = 0; i < lista1.size(); i++) {
            if (lista1.get(i).equals(lista2.get(i))) {

                String planta = lista1.get(i);

                // Si no existe, crear nueva entrada con lista vacía
                coincidencias.putIfAbsent(planta, new ArrayList<>());

                // Añadir la posición a la lista correspondiente
                coincidencias.get(planta).add(i);
            }
        }

        // 4. Mostrar el Map
        System.out.println("\nCoincidencias encontradas:");
        for (Map.Entry<String, List<Integer>> entry : coincidencias.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

	}

}
