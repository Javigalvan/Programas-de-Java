/*
 * Objetivo: mostrar el desarrollo de las clases creadas
 * Fecha: 
 * Autor: 
 */
package Galvan;

import java.time.LocalDate;

public class PrincipalViviendaTuristica {

	public static void main(String[] args) {
		
		
		// 1. Crea un apartamento con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 1 ============");
		Apartamento ap1 = new Apartamento("",LocalDate.of(2022, 02, 02),"Calle Playamar", 100.00, true, (byte) 1, (short)20, (short)1,LocalDate.of(2022, 02, 02));
		
		
		
		//2. Calcula el precio para una estancia de 3 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 2 ============");		
		ap1.CalcularPrecioEstancia((byte)3);
		ap1.mostrarInformacion();
		
		//3. Crea un apartamento con precio por noche (valor solicitado al usuario) y distancia al centro (solicitado al usuario). Resto de valores por defecto.
		// Evidencia. El valor de cada uno de los atributos
		System.out.println (" 3 ============");
		
		//Apartamento ap2 = new Apartamento("",LocalDate.of(2022, 02, 02),"Calle Playamar", Entrada.entero(), true, Entrada.entero(), (short)20, (short)1,LocalDate.of(2022, 02, 02));
		
		//4. Calcula el precio para una estancia de 5 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 4 ============");	
		ap1.CalcularPrecioEstancia((byte)5);
		
		//5. Crea una casa rural con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 5 ============");	
		CasaRural casarural1 = new CasaRural("",LocalDate.of(2022, 02, 02),"Calle Playamar", 100.00, true, (byte) 1, (short)100, false);
		
		//6. Crea una casa rural con precio por noche (valor solicitado al usuario) y el resto por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 6 ============");	
		CasaRural casarural2 = new CasaRural("",LocalDate.of(2022, 02, 02),"Calle Playamar", 100.00, true, (byte) 1, (short)100, false);
		
		// 7. Calcula el precio de una estancia de 10 días.
		// Evidencia: el precio de la estancia.
		System.out.println (" 7 ============");	
		casarural1.CalcularPrecioEstancia((byte)10);
		
		// 8. Modifica la fecha de construcción a 1/1/2023.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 8 ============");	

		

		// 9. Indica si la casa es pet friendly.
		// Evidencia. Indica si es "pet friendly".
		System.out.println (" 9 ============");	
		casarural1.esPetFriendly();
		
		// 10. Crea un hotel con valores por defecto.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 10 ============");

		
		// 11. Crea un hotel con todos los valores solicitados al usuario. (el objeto debe ser creado por un método)
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 11 ============");	

		
		//12. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 12 ============");	

		
		// 13. Modifica el valor de Spa a sí.
		// Evidencia. El valor de cada uno de los atributos.
		System.out.println (" 13 ============");	

		
		// 14. Calcula el precio de una estancia de 1 día.
		// Evidencia: el precio de la estancia.
		System.out.println (" 14 ============");	

		
	
		// 15. Calcula el número de viviendas creadas.
		// Evidencia. El número de viviendas creadas.
		System.out.println (" 15 ============");	
		
		
	}

}
