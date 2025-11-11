package operadoresBasicos;

import java.util.Scanner;

public class EjOperadoresBasicos {

	public static void main(String[] args) {
		
		Scanner peticion = new Scanner(System.in);
		
		int dato1;
		double dato2;
		
		dato1 = 5;
		dato2 = 4;
		
		double suma; 
		suma = dato1 + dato2;
		System.out.println("La suma es: " + suma);
		
		double resta;
		resta = dato1 - dato2;
		System.out.println("La resta es: " + resta);
		
		double multiplicacion;
		multiplicacion = dato1 * dato2;
		System.out.println("La multiplicacion es: " + multiplicacion);
		
		double division;
		division = dato1 / dato2;
		System.out.println("La division es: " + division);
		
		double resultadoDivision;
		resultadoDivision = dato1 % dato2;
		System.out.println("el resto de la division es: " + resultadoDivision);
		
		int dato1mas, dato1menos;
		dato1mas = dato1; // dato1mas = dato1 + 1
		dato1menos = dato1--; // dato1mas = dato1 - 1
		System.out.println("Incremental posterior " + ++dato1);
		
		
		int pedir;
		System.out.println("Dime un numero: ");
		pedir = peticion.nextInt();
		int sumapedida;
		sumapedida = pedir + dato1;
		System.out.println("El resultado es: " + sumapedida);	
		
		System.out.println (dato1 == dato2);
	}

}
