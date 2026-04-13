package botanico;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class CalendarioPlantas {

	public static void main(String[] args) {
		
		Map<LocalDate, String> calendario = new TreeMap<>();

        // Lista de especies de plantas (al menos 7 diferentes)
        List<String> plantas = new ArrayList<>(Arrays.asList(
                "Rosa",
                "Lavanda",
                "Girasol",
                "Orquídea",
                "Cactus",
                "Helecho",
                "Bonsái",
                "Margarita",
                "Tulipán",
                "Aloe Vera"
        ));

        // Mezclar la lista para obtener selección aleatoria sin repetición
        Collections.shuffle(plantas);

        // 2. Rellenar el Map con una semana de fechas
        LocalDate fechaActual = LocalDate.now();

        for (int i = 0; i < 7; i++) {
            LocalDate fecha = fechaActual.plusDays(i);
            String planta = plantas.get(i); // No se repite porque está mezclada
            calendario.put(fecha, planta);
        }

        // 3. Mostrar el contenido del Map
        for (Map.Entry<LocalDate, String> entrada : calendario.entrySet()) {
            System.out.println(entrada.getKey() + " -> " + entrada.getValue());
        }

	}

}
