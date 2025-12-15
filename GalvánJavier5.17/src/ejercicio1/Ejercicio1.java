package ejercicio1;

import libtarea3.*;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Random;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
	//1
		Random aleatorio = new Random();
		int maximo = aleatorio.nextInt(31) + 30;  
        System.out.println("El valor máximo del juego será: " + maximo);
        
    //2     
        Dado dado1, dado2, dado3;
        
        try {
			dado1 = new Dado(6);
		} catch (IllegalArgumentException ex21) {
			System.out.printf("ERROR, %s%n", ex21.getMessage());	
			dado1 = new Dado(6);
		}
        try {
			dado2 = new Dado(6);
		} catch (IllegalArgumentException ex22) {
			System.out.printf("ERROR, %s%n", ex22.getMessage());
			dado2 = new Dado(6);
		}
        try {
			dado3 = new Dado(6);
		} catch (IllegalArgumentException ex23) {
			System.out.printf("ERROR, %s%n", ex23.getMessage());
			dado3 = new Dado(6);
		}
		
		
    //3   

        int sumaTotal = 0;
        int tirada = 1;
        int resultado1=0;
        int resultado2=0;
        int resultado3=0;

         do {
            
             resultado1 = dado1.lanzar();
             resultado2 = dado2.lanzar();
             resultado3 = dado3.lanzar();
            
            long sumaDado1 = dado1.getSumaPuntuacionHistorica();
            long sumaDado2 = dado2.getSumaPuntuacionHistorica();;
            long sumaDado3 = dado3.getSumaPuntuacionHistorica();;
                      
            
            int sumaTirada = resultado1 + resultado2 + resultado3;
            sumaTotal += sumaTirada;
                                    
            tirada++;
            
            System.out.printf("Tirada %d:%n", tirada);
            System.out.printf("Dado 1: %d | Total Dado 1: %d%n", resultado1, sumaDado1);
            System.out.printf("Dado 2: %d | Total Dado 2: %d%n", resultado2, sumaDado2);
            System.out.printf("Dado 3: %d | Total Dado 3: %d%n", resultado3, sumaDado3);
            System.out.printf("Suma total acumulada: %d%n", sumaTotal);
            
         
        } while (sumaTotal < maximo);
        
    //4
        
        Dado ganador = new Dado();
        
        int max = Math.max(resultado2, resultado3);
        int maxFinal = Math.max(resultado1, max);
        
        System.out.println();
        
        if (maxFinal == resultado1) {
            System.out.println("GANADOR: Dado 1");
            ganador = dado1;
        } else if (maxFinal == resultado2) {
            System.out.println("GANADOR: Dado 2");
            ganador = dado2;
        } else {
            System.out.println("GANADOR: Dado 3");
            ganador = dado3;
        }
        
    //5
        System.out.println();
      //5.1       
        System.out.printf("Número máximo de puntos: %d%n", maxFinal);
      //5.2
        System.out.printf("Lanzamientos de los tres dados: %d%n", tirada);
      //5.3
        System.out.printf("Suma de puntuaciones de todos los lanzamientos realizados: %d%n", sumaTotal);
      //5.4 
        System.out.printf("Dado ganador: %s, y los puntos obtenidos en el último lanzamiento: %d%n", ganador.toString(), maxFinal );
      //5.5 
        System.out.printf("Número de veces que ha salido en todo el juego la puntuación obtenida por el dado ganador: %s%n", ganador.getNumeroVecesCara(maxFinal));
      //5.6
        System.out.printf("Número total de lanzamientos: %d%n", tirada*3);
      //5.7	
        System.out.printf("Puntos de todos los lanzamientos del dado ganador: %s%n", ganador.getSumaPuntuacionHistorica());

	}

}
