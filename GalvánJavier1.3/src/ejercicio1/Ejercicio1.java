/*
 * Descripción: Cálculos simples
 * Autor: Javi
 * Fecha: 01/10/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe tu nombre: ");
		String nombre ;
		nombre = entrada.nextLine();
		System.out.println("Nombre: "+ nombre);
		
		System.out.println("Escribe tus apellidos: ");
		String apellidos ;
		apellidos = entrada.nextLine();
		System.out.println("Apellidos: "+ apellidos);
		
		System.out.println("Escribe tu fecha de nacimiento: ");
		String FechaNacimiento ;
		FechaNacimiento = entrada.nextLine();
		System.out.println("Fecha de naciemiento: "+ FechaNacimiento);
		
		System.out.println("Escribe tu salario bruto: ");
		int SalarioBruto ;
		SalarioBruto = entrada.nextInt();
		System.out.println("Salario bruto: "+ SalarioBruto);
		
		System.out.println("Escribe tus años trabajando en la empresa: ");
		int AñosTrabajando ;
		AñosTrabajando = entrada.nextInt();
		System.out.println("Años trabajando en la empresa: "+ AñosTrabajando);
	
		
		int SalarioNeto = (SalarioBruto - ((SalarioBruto * 15) / 100));
		int Aumento = (2 * SalarioNeto / 100);
		int SalarioTotal = (SalarioNeto + Aumento);
		
		
		
		//System.out.println("Tu salario neto es: " + SalarioNeto);
		
		
		System.out.println("Estimado " + nombre + ", su salario bruto es " + SalarioBruto + ", teniendo en cuenta un IRPF del 15% su salario neto es " + SalarioNeto);
						
		System.out.println("Debido a sus " + AñosTrabajando + " años trabajando en la empresa su salario se incrementará en un 2% por cada año."
							+ " El aumento es de " + Aumento + " y el salario total es " + SalarioTotal);
	}

}
