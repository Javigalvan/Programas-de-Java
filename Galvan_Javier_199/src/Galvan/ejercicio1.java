/*
 * Descripción:  Un programa en Java que simule el cálculo de una nómina básica de un empleado, verificando si cumple algunos requisitos y realizando cálculos de los ingresos y retenciones.
 * Autor: Javier Galván
 * Fecha: 29/10/25
 */

package Galvan;

public class ejercicio1 {

	public static void main(String[] args) {
		
		// Declaramos e inicializamos la constante del IRPF
		final double IRPF = 12.0f;
		
		// Declaramos e inicializamos todas las demás variables
		long numEmpleado = 2055;
		int edad = 35;
		double salarioHora = 15.50f;	
		boolean esJornadaCompleta = true;
		double horasTrabajadas = 40;
		
		// Declaramos las variables de los cálculos y las inicializamos con sus cálculos correspondientes
		double salarioBruto = salarioHora * horasTrabajadas;
		
		double irpfRetenido = (IRPF * salarioBruto) / 100;
		
		double salarioNeto = salarioBruto - irpfRetenido;
		
		boolean elegibleParaBono = esJornadaCompleta && horasTrabajadas == 40;
		
		System.out.println("Número de empleado: " + numEmpleado);
		System.out.println("Edad: " + edad);
		System.out.println("Salario Hora: " + salarioHora);
		System.out.println("SalarioBruto: " + salarioBruto);
		System.out.println("IRPF Retenido: " + irpfRetenido);
		System.out.println("Salario Neto: " + salarioNeto);
		System.out.println("Elegibilidad para Bono: " + elegibleParaBono);
		
	}

}
