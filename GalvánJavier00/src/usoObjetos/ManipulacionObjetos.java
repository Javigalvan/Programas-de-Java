package usoObjetos;

import java.awt.Rectangle;

public class ManipulacionObjetos {

	public static void main(String[] args) {
		
		Rectangle r1, r2;// Declaracion de un objeto
		
		r1 = new Rectangle(); // Instanciacion de un objeto
		
		System.out.println(r1.toString());
		
		r1.x = 10;
		 
		System.out.println(r1);
		
		r2 = r1;
		System.out.println(r2);
		
		r2.x = 20;
		System.out.println(r1);
		
		r1.setLocation(50, 50);
		r1.setSize(10, 10);
		System.out.println(r2);
		
		double coordenadaX = r1.getX();
		
		System.out.println(coordenadaX);
		
		
	}

}
