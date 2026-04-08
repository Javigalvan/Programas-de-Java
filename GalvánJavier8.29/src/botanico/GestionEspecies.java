package botanico;

import java.util.HashSet;
import java.util.Set;

public class GestionEspecies {
	public static void main(String[] args) {

		Set<String> conjunto1 = generarConjuntoAleatorio(5);
        Set<String> conjunto2 = generarConjuntoAleatorio(5);


        Set<String> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);

        Set<String> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);


        Set<String> diferencia = new HashSet<>(conjunto2);
        diferencia.removeAll(conjunto1);

        System.out.println("Conjunto 1: " + conjunto1);
        System.out.println("Conjunto 2: " + conjunto2);
        System.out.println("Unión: " + union);
        System.out.println("Intersección: " + interseccion);
        System.out.println("Diferencia: " + diferencia);
    }

    
    private static Set<String> generarConjuntoAleatorio(int cantidad) {
    	
        Set<String> conjunto = new HashSet<>();
        
        while (conjunto.size() < cantidad) {
            String especie = Utilidades.especiePlantaAleatoria();
            conjunto.add(especie);
        }
        return conjunto;
    }
}

