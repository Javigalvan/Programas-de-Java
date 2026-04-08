package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class PoblacionMain {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
		
		ArrayList<Poblacion> censo = new ArrayList<>();
		
		String[] nombres = {"Ana", "Luis", "Carlos", "Marta"};
       String[] sexos = {"Masculino", "Femenino", };
       String[] estados = {"Soltero", "Casado","viudo", "divorciado"};
       
       int cantidad = 20 + (int)(Math.random() * 11);
       
       for (int i = 0; i < cantidad; i++) {
           String nombre = nombres[(int)(Math.random() * nombres.length)] + i;
           int edad = 18 + (int)(Math.random() * 40);
           String sexo = sexos[(int)(Math.random() * sexos.length)];
           String estado = estados[(int)(Math.random() * estados.length)];        
           censo.add(new Poblacion(nombre, sexo, estado, edad));
       }
      
      
       for (Poblacion t : censo) {
           System.out.println(t.getNombre() + " - " + t.getEdad()+ " - " + t.getSexo() + " - " + t.getEstadoCivil());
       }
      
       contarPorSexo(censo, entrada);
       contarPorEstadoCivil(censo, entrada);
       contarPorDecada(censo, entrada);
       contarSexoYEstado(censo, entrada);        
      
           }	
      
       public static void contarPorSexo(ArrayList<Poblacion> censo, Scanner entrada) {
       	System.out.println("Introduce sexo: ");
           String sexoBuscado = entrada.next();
          
           int contador=0;
           for (Poblacion p : censo) {
           	if(p.getSexo().equalsIgnoreCase(sexoBuscado)) {
           		contador++;
           	}
           }
           System.out.println("Cantidad sexo: " + contador);
       }
      public static void contarPorEstadoCivil(ArrayList<Poblacion> censo, Scanner entrada) {
   	   System.out.println("Introduce estado civil: ");
          String estado = entrada.next();
         
          int contador=0;
          for(Poblacion p : censo) {
       	   if(p.getEstadoCivil().equalsIgnoreCase(estado)) {
       		   contador++;
       	   }
          }
          System.out.println("Cantidad estado: " + contador);
      }
      // Por edad exacta
      public static void contarPorDecada(ArrayList<Poblacion> censo, Scanner entrada) {
   	  
   	   System.out.println("Introduce una decada: ");
          int anyo = entrada.nextInt();
         
          int anyoActual = 2026;
          int edadCalc= 2026-anyo;
          int contador=0;
         
          for(Poblacion p : censo) {
       	   if(p.getEdad()== edadCalc) {
       		   contador++;
       	   }
          }
          System.out.println("Cantidad decada: " + contador);
      }
      public static void contarSexoYEstado(ArrayList<Poblacion> censo, Scanner entrada) {
   	   System.out.println("Introduce sexo: ");
          String sexoBuscado = entrada.next();
         
          System.out.println("Introduce estado civil: ");
          String estado = entrada.next();
         
          int contador=0;
         
          for (Poblacion p : censo) {
          	if(p.getSexo().equalsIgnoreCase(sexoBuscado) && p.getEstadoCivil().equalsIgnoreCase(estado)) {
          		contador++;
          	}
          }
          System.out.println("Cantidad sexo y estado: " + contador);
   	  
      }
	



	}


