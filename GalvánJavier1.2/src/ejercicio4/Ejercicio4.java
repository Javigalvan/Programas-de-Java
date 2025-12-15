/*
 * Descripción: Uso de variables y E/S estándar
 * Autor: Javi
 * Fecha: 25/09/25
 */

package ejercicio4;

public class Ejercicio4 {
	
	enum Talla { PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE};

	public static void main(String[] args) {
		
		 Talla talla1 = Talla.PEQUEÑA ;
		 Talla talla2 = Talla.MEDIANA ;	
		 Talla talla3 = Talla.GRANDE ;
		 Talla talla4 = Talla.EXTRAGRANDE ;
		 
		 System.out.println("Tengo una talla " + talla1);
		 System.out.println("Tengo una talla " + talla2);
		 System.out.println("Tengo una talla " + talla3);
		 System.out.println("Tengo una talla " + talla4);
		 
		}
	}

