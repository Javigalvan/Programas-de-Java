package examen;

import java.util.Scanner;

public class ClaseMath {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escribe un número decimal: ");
        double numero = entrada.nextDouble();

        double ceilValor = Math.ceil(numero);
        double floorValor = Math.floor(numero);
        double roundValor = Math.round(numero);
   
        System.out.println("Math.ceil = " + ceilValor); //Redondea hacia arriba 
        System.out.println("Math.floor = " + floorValor); //Redondea hacia abajo 
        System.out.println("Math.round = " + roundValor); //Redondea al numero más cercano
        
        /*
        Math.min(num1, num2) -- minimo de 2 numeros

        Math.pow(num1, num2) -- eleva un numero

        Math.sqrt(num1) -- raiz cuadrada

        Math.random() * num2 -- numero random entre 0 y 1
		*/
	}

}
