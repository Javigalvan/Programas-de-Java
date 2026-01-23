package ejercicioA2;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();		

		System.out.println("Persona 1 ");
		PedirDatos(p1);

        System.out.println("Persona 2 ");
        PedirDatos(p2);

        System.out.println("Persona 1:");
        MostrarDatos(p1);

        System.out.println("Persona 2:");
        MostrarDatos(p2);

		
}
	public static void PedirDatos (Persona p) {
		
		Scanner entrada = new Scanner(System.in);
		
	    System.out.println("Escribe tu dni ");
	    p.dni = entrada.nextLine();

	    System.out.println("Escribe tu nombre ");
	    p.nombre = entrada.nextLine();

	    System.out.println("Escribe tus apellidos ");
	    p.apellidos = entrada.nextLine();

	    System.out.println("Escribe tu edad ");
	    p.edad = entrada.nextInt();
	    entrada.nextLine();
	    
}
	public static void MostrarDatos (Persona p) {
	
		System.out.println("DNI: " + p.dni + ", Nombre: " + p.nombre + ", Apellidos: " + p.apellidos + ", Edad: " + p.edad);

}
}
