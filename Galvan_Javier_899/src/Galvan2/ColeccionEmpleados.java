package Galvan2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;



public class ColeccionEmpleados {

	public static void main(String[] args) {
		
		//1
		LinkedList<Empleado> lista1 = new LinkedList<>();
		int contador = 0;
		
		
		try {
			for (int i = 1; i <= 10; i++) {
            lista1.add(Empleado.generarAleatorio());
            contador++;
			}
		} catch (DateTimeException ex1) {
			System.out.println("Error. " + ex1.getMessage());
		}
		
		mostrarLista(lista1);
        
		//2
		
		

	}
	public static void mostrarLista(LinkedList<Empleado> lista1) {
			for (Empleado empleado : lista1) {
            System.out.println(empleado);
			}

	}
}
