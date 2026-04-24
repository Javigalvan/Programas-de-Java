/*
 * Descripción: 
 * Autor: Javier Galván
 * Fecha: 15/04/26
 */

package examen;

public class Resumen {

	public static void main(String[] args) {
		
		/*
		👉 "sin repetidos" → Set –  Set<String> conjunto = new HashSet<>();
		👉 "ordenado automáticamente" → TreeSet
		👉 "orden de inserción" → ArrayList o LinkedHashSet
		👉 "acceso por índice", “Permite duplicados”, “Mantiene orden” → ArrayList
		👉 Permite duplicados Mantiene orden Mejor para insertar/eliminar en medio  → LinkedList
		👉 "No mantiene orden" → HashSet
		👉 "No hay claves repetidas,” Cada clave tiene un valor" →HashMap
		
		--------------------------
		
		Imagina una lista de invitados:
		HashSet → Invitados sin repetir, pero desordenados
		TreeSet → Invitados ordenados alfabéticamente
		LinkedHashSet → Invitados en el orden que llegaron
		ArrayList → Lista normal (puede haber repetidos)
		LinkedList → Lista donde puedes meter gente en medio fácilmente
		
		--------------------------
		
		HashMap:
		import java.util.*;

		public class Main {
		    public static void main(String[] args) {

		        HashMap<String, Integer> agenda = new HashMap<>();

		        agenda.put("Juan", 600000001);
		        agenda.put("Ana", 600000002);
		        agenda.put("Luis", 600000003);

		        // Mostrar un valor
		        System.out.println(agenda.get("Ana")); // devuelve 600000002
		    }
		}
		
		put(clave, valor) → guardar
		get(clave) → obtener
		keySet() → recorrer claves

		-------------------------------
		
		CompareTo:
		public class Persona implements Comparable<Persona>
		✔️ Devuelve:
		0 → iguales
		< 0 → obj1 es menor
		> 0 → obj1 es mayor
		
		// Ordena automáticamente (usa compareTo)
		Collections.sort(lista);

		Ordenar por edad

		@Override
		public int compareTo(Persona otra) {
		return this.edad - otra.edad; // Orden ascendente por edad
		}

		Orden alfabético (A → Z)
		@Override
		public int compareTo(Alumno o) {
		return this.nombre.compareTo(o.nombre);
		}

		Comparar por múltiples criterios

		@Override
		public int compareTo(Persona otra) {
		int edadComp = Integer.compare(this.edad, otra.edad);
		if (edadComp != 0) {
		return edadComp; // Diferente edad
		} else {
		return this.nombre.compareTo(otra.nombre); // Edad igual, compara por nombre
		}
		}
		
		ITERATOR recorrer una lista y parar en uno para eliminarlo o algo
		
		List<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
		String elemento = it.next();
		System.out.println(elemento);
		// it.remove(); // Opcional: elimina el elemento actual
}


		*/
		


	}

}
