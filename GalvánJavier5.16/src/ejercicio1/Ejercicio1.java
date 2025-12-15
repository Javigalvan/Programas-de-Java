/*
 * Descripción: Uso de cuentas bancarias
 * Autor: Javier
 * Fecha: 1/12/25
 */

package ejercicio1;
import java.time.LocalDateTime;
import java.time.DateTimeException;
import java.time.LocalDate;
import libtarea3.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1
		CuentaBancaria cuentaPrivada;		
		CuentaBancaria cuentaConjunta;		
		CuentaBancaria cuentaFamiliar;
				
		
		//2
			// 2.1
			try {
				double saldoInicial = 100;
				LocalDate fechaCreacion = LocalDate.of(1, 9, 2027);
				CuentaBancaria cuenta1 = new CuentaBancaria(saldoInicial, fechaCreacion);
			
			} catch (IllegalArgumentException ExcepcionFecha) {
				System.out.printf("ERROR, F	echa inválida: %s%n", ExcepcionFecha.getMessage());				
			} catch (DateTimeException ExcepcionFecha) {
				 System.out.printf("ERROR, Fecha inválida: %s%n", ExcepcionFecha.getMessage());	
			}
			
			
			//2.2
			try {
				double saldoInicial = -200;
				CuentaBancaria cuenta2 = new CuentaBancaria(saldoInicial);
				
			} catch (IllegalArgumentException ExcepcionSaldo){
				System.out.printf("ERROR, Saldo inválido: %s%n", ExcepcionSaldo.getMessage());
				}
			
			//2.3
			double saldoInicial = 1000;
			double limiteDescubierto = -200;
			
			try {
				LocalDate fechaCreacion = LocalDate.of(2021, 7, 1);
				cuentaPrivada = new CuentaBancaria(saldoInicial, fechaCreacion, limiteDescubierto);
			} catch (IllegalArgumentException ex23) {
				System.out.printf("ERROR, %s%n", ex23.getMessage());
				cuentaPrivada = new CuentaBancaria();
			} catch (Exception ex231) {
				System.out.print("Error desconocido");
				cuentaPrivada = new CuentaBancaria();
			}
			
				
			//2.4
			
			
			try {
				LocalDate fechaCreacion2 = LocalDate.of(2021, 7, 1);
				cuentaConjunta = new CuentaBancaria(200, fechaCreacion2);
			} catch (IllegalArgumentException ex24) {
				System.out.printf("ERROR, %s%n", ex24.getMessage());
				cuentaConjunta = new CuentaBancaria();
			} catch (Exception ex231) {
				System.out.print("Error desconocido");
				cuentaConjunta = new CuentaBancaria();
			}
			
			
			//2.5
			cuentaFamiliar = new CuentaBancaria();
			
			
		//3	
			System.out.println("");
	        System.out.printf("Identificador: %s%n", cuentaPrivada.getId());
	        System.out.printf("Fecha de creacion: %s%n", cuentaPrivada.getFechaCreacion());
	        System.out.printf("Límite de descubierto: %s%n", cuentaPrivada.getLimiteDescubierto());
	        System.out.printf("Cuenta Embargada: %s%n", cuentaPrivada.isEmbargada());
	        System.out.printf("Cuenta Descubierta: %s%n", cuentaPrivada.isDescubierta());
	        System.out.printf("Numero de dias de la cuenta abierta: %s%n", cuentaPrivada.getDiasCuenta());
			
		//4
	        try {
	        	cuentaFamiliar.ingresar(100);
	        } catch (IllegalArgumentException ex41) {
				System.out.printf("ERROR, %s%n", ex41.getMessage());
	        } catch (Exception ex42) {
				System.out.print("Error desconocido");
			}
			
	        try {
	        	cuentaConjunta.extraer(100);
	        } catch (IllegalArgumentException ex42) {
				System.out.printf("ERROR, %s%n", ex42.getMessage());
	        } catch (Exception ex42) {
				System.out.print("Error desconocido");
			}
			
	        try {
	        	cuentaPrivada.transferir(1100, cuentaFamiliar);
	        } catch (IllegalArgumentException ex43) {
				System.out.printf("ERROR, %s%n", ex43.getMessage());
	        } catch (Exception ex42) {
				System.out.print("Error desconocido");
			}
			
			
		//5
			
			System.out.println("");
	        System.out.printf("Cuenta Privada: %s%n", cuentaPrivada.toString());
	        System.out.printf("Cuenta Conjunta: %s%n", cuentaConjunta.toString());
	        System.out.printf("Cuenta Familiar: %s%n", cuentaFamiliar.toString());
			

	}

}
