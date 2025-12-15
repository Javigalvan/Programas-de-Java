package ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;
import libtarea3.*;
import java.time.LocalDateTime;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.Period;
import java.time.YearMonth;
import java.time.LocalDate;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
	//1	
		LocalDate anyoActual = LocalDate.now();
		int anyoHoy = anyoActual.getYear();	
		int anyo = 0;
        boolean validoAnyo = false;       
        
		do {            
            try {
            	System.out.print("Introduce un año entre 1900 y 2025: ");
                anyo = entrada.nextInt();

                if (anyo >= 1900 && anyo <= anyoHoy) {
                	validoAnyo = true;  
                } else {
                    System.out.println("Error: el año debe estar entre 1900 y 2025 ");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: debes introducir un número entero.");
                entrada.nextLine(); 
            } catch (DateTimeException e) {
                System.out.println("Error");
                entrada.nextLine(); 
            }
        } while (!validoAnyo);
		
		
	//2	
		int mes = 0;
		boolean validoMes = false;
		
		do {                      
			try {
				System.out.print("Introduce un mes: "); 
				mes = entrada.nextInt();

				if (mes >= 1 && mes <= 12) {    
            	validoMes = true;
				} else {
					System.out.println("Error: el mes debe estar entre 1 y 12 ");
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: debes introducir un número entero.");
				entrada.nextLine(); 
			}	
		} while (!validoMes);
    
		
	//3
	
		YearMonth AnyoMes = YearMonth.of(anyo, mes);
		int diaMes = AnyoMes.lengthOfMonth();		
		int dia = 0;
		boolean validoDia = false;
		
		do {                      
			try {
				System.out.print("Introduce un dia: "); 
				dia = entrada.nextInt();

				if (dia >= 1 && dia <= diaMes) {    
					validoDia = true;
				} else {
					System.out.printf("Error: el dia debe estar entre 1 y %d%n", diaMes);
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: debes introducir un número entero.");
				entrada.nextLine(); 
			}	
		} while (!validoDia);
		
		
	//4
			
		LocalDate diaMesAnyo = LocalDate.of(anyo, mes, dia);
		
		try {
			diaMesAnyo = LocalDate.of(anyo, mes, dia);
		} catch (DateTimeException e) {
			System.out.println("Fecha inválida: " + e.getMessage());
		}
				
		DayOfWeek diaSemana = diaMesAnyo.getDayOfWeek();
		
		for (int i = anyo; i < anyoHoy; i++) {
		    try {
		        LocalDate fecha = LocalDate.of(i, mes, dia);
		        DayOfWeek diaFecha = fecha.getDayOfWeek();

		        if (diaFecha == diaSemana) {
		            System.out.println("En la fecha " + fecha + " es " + fecha.getDayOfWeek());
		        }

		    } catch (DateTimeException e) {
		        System.out.println("Fecha inválida para el año " + i + ": " + e.getMessage());
		    }
		}
		
		
		
		}
	}
