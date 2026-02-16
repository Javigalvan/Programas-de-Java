/*
 * Descripción: Uso de Cuentas Bancarias
 * Autor: Javier Galván
 * Fecha: 28/01/2026
 */

package galvan;

import java.time.DateTimeException;
import java.time.LocalDate;

import libtarea3.CuentaBancaria;

public class ejercicio2 {
 
	public static void main(String[] args) {

		//2
		CuentaBancaria[] vector = new CuentaBancaria[10];
		
		//3
		try {
		for (int i = 0; i < 10; i++) {
			vector[i] = new CuentaBancaria(0, LocalDate.of( AnyoAleatorio(),1,1));
		}
		} catch (IllegalArgumentException ExcepcionFecha) {
		System.out.printf("ERROR, Fecha inválida: %s%n", ExcepcionFecha.getMessage());				
		} catch (DateTimeException ExcepcionFecha) {
		 System.out.printf("ERROR, Fecha inválida: %s%n", ExcepcionFecha.getMessage());	
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("");
	        System.out.printf("Identificador: %s%n", vector[i].getId());
	        System.out.printf("Fecha de creacion: %s%n", vector[i].getFechaCreacion());
	        System.out.printf("Límite de descubierto: %s%n", vector[i].getLimiteDescubierto());
	        System.out.printf("Cuenta Embargada: %s%n", vector[i].isEmbargada());
	        System.out.printf("Cuenta Descubierta: %s%n", vector[i].isDescubierta());
	        System.out.printf("Numero de dias de la cuenta abierta: %s%n", vector[i].getDiasCuenta());
		}
		
		//4
		for (int i = 0; i < 10; i++) {
			int max;
			if (vector[i].getSaldo() >vector[i].getSaldo())  {
				
			}
			
			}
		

	}
	
// 1
public static int AnyoAleatorio (){
	
	int anyo = (int)((Math.random()*130)+1900);
	return anyo;
}
}
