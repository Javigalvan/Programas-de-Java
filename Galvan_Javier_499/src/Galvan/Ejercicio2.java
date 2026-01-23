package Galvan;

import java.time.LocalDate;

import libtarea3.*;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//1	
		
			Double limiteAleatorio = (Math.random() * -4000);
		
	
		//2
			CuentaBancaria Galvan_1;		
			CuentaBancaria Galvan_2;		
			CuentaBancaria Galvan_3;
			
		//3
			LocalDate fecha = LocalDate.of(2025, 12, 17);
			
			try {								
				Galvan_1 = new CuentaBancaria(1000, fecha, limiteAleatorio);			
			} catch (IllegalArgumentException ex31){
				System.out.printf("ERROR: %s%n", ex31.getMessage());
				Galvan_1 = new CuentaBancaria(1000, fecha, limiteAleatorio);
			} catch (Exception e){
				System.out.printf("ERROR: %s%n", e.getMessage());
				Galvan_1 = new CuentaBancaria(1000, fecha, limiteAleatorio);
				}
			try {				
				Galvan_2 = new CuentaBancaria(2000, fecha, limiteAleatorio);			
			} catch (IllegalArgumentException ex32){
				System.out.printf("ERROR: %s%n", ex32.getMessage());
				Galvan_2 = new CuentaBancaria(1000.00, fecha, limiteAleatorio);
			} catch (Exception e){
				System.out.printf("ERROR, Saldo inválido: %s%n", e.getMessage());
				Galvan_2 = new CuentaBancaria(2000, fecha, limiteAleatorio);
				}
			try {				
				Galvan_3 = new CuentaBancaria(3000, fecha, limiteAleatorio);			
			} catch (IllegalArgumentException ex33){
				System.out.printf("ERROR: %s%n", ex33.getMessage());
				Galvan_3 = new CuentaBancaria(1000.00, fecha, limiteAleatorio);
			} catch (Exception e){
				System.out.printf("ERROR, Saldo inválido: %s%n", e.getMessage());
				Galvan_3 = new CuentaBancaria(3000, fecha, limiteAleatorio);			

				}
			
			
			System.out.println("Cuenta Galvan_1: ");
	        System.out.printf("Identificador: %s%n", Galvan_1.getId());
	        System.out.printf("Fecha de creacion: %s%n", Galvan_1.getFechaCreacion());
	        System.out.printf("Límite de descubierto: %s%n", Galvan_1.getLimiteDescubierto());
	        System.out.printf("Cuenta Embargada: %s%n", Galvan_1.isEmbargada());
	        System.out.printf("Cuenta Descubierta: %s%n", Galvan_1.isDescubierta());
	        System.out.printf("Numero de dias de la cuenta abierta: %s%n", Galvan_1.getDiasCuenta());
			
	        System.out.println();
	        System.out.println("Cuenta Galvan_2: ");
	        System.out.printf("Identificador: %s%n", Galvan_2.getId());
	        System.out.printf("Fecha de creacion: %s%n", Galvan_2.getFechaCreacion());
	        System.out.printf("Límite de descubierto: %s%n", Galvan_2.getLimiteDescubierto());
	        System.out.printf("Cuenta Embargada: %s%n", Galvan_2.isEmbargada());
	        System.out.printf("Cuenta Descubierta: %s%n", Galvan_2.isDescubierta());
	        System.out.printf("Numero de dias de la cuenta abierta: %s%n", Galvan_1.getDiasCuenta());
	        
	        System.out.println();
	        System.out.println("Cuenta Galvan_3: ");
	        System.out.printf("Identificador: %s%n", Galvan_3.getId());
	        System.out.printf("Fecha de creacion: %s%n", Galvan_3.getFechaCreacion());
	        System.out.printf("Límite de descubierto: %s%n", Galvan_3.getLimiteDescubierto());
	        System.out.printf("Cuenta Embargada: %s%n", Galvan_3.isEmbargada());
	        System.out.printf("Cuenta Descubierta: %s%n", Galvan_3.isDescubierta());
	        System.out.printf("Numero de dias de la cuenta abierta: %s%n", Galvan_3.getDiasCuenta());
			
	        
	  //4
	        double limiteGalvan1=Galvan_1.getLimiteDescubierto();
	        double limiteGalvan2=Galvan_2.getLimiteDescubierto();        
	        double limiteGalvan3=Galvan_3.getLimiteDescubierto();
	        double minCuenta;
	        String cuenta;
	        
	        if (limiteGalvan1 < limiteGalvan2) {
	        	minCuenta = limiteGalvan1;
	        	cuenta = "Galvan_1";
	        } else {
	        	minCuenta = limiteGalvan2;
	        	cuenta = "Galvan_2";
	        }
	        if (limiteGalvan3 < minCuenta) {
	        	minCuenta = limiteGalvan3;
	        	cuenta = "Galvan_3";
	        } else {
	        	minCuenta = minCuenta;
	        }
	        
	        System.out.println();
	        System.out.printf("La cuenta con menor limite descubierto es : %s%n", cuenta);
	        	
	 //5
	        System.out.println();
	        try {
	        	for (int i=1; i<=5; i++) {
	        		Galvan_1.transferir(300, Galvan_2);
	        		System.out.printf("Saldo tras la transferencia: %s%n", Galvan_2.getSaldo());
	        	}
	
	        } catch (IllegalArgumentException ex5) {
				System.out.printf("ERROR, %s%n", ex5.getMessage());
	        }
	//6

				
	       
			
	        
	}

}
