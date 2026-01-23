package ejercicioB1;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("738956420G","Josema","Gonzalez",10);
		Persona p2 = new Persona("343439420G","Pablo","Rico",21);		

        System.out.println("Persona 1:");
        MostrarDatos(p1);
        System.out.println("Persona 2:");
        MostrarDatos(p2);

	    
}
	public static void MostrarDatos (Persona p) {
	
		System.out.println("DNI: " + p.dni + ", Nombre: " + p.nombre + ", Apellidos: " + p.apellidos + ", Edad: " + p.edad);
		
}
}
