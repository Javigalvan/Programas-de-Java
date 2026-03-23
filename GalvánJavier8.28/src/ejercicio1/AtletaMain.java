package ejercicio1;

import java.util.ArrayList;

public class AtletaMain {

	public static void main(String[] args) {
		
		ArrayList<Atleta> atletas = new ArrayList<>();
		
		String[] nombres = {"Josema","Pablo","Izan","Joaquin","Ivan","Cristian","Juan","Lucia","David","Sofia"};

		int cantidad = (int)(Math.random()*11) + 20;

		for(int i = 0; i < cantidad; i++) {
			
			String nombre = nombres[(int)(Math.random()*nombres.length)];
			int edad = (int)(Math.random()*30) + 10; 
			double altura = 1.50 + Math.random()*0.50; 
			
			atletas.add(new Atleta(nombre, edad, altura));
		}

		double sumaEdades = 0;
		double sumaAlturas = 0;
		int menores = 0;
		int mayores = 0;
		
		for (Atleta a : atletas) {

			sumaEdades += a.getEdad();
			sumaAlturas += a.getAltura();

			if (a.getEdad() < 18) {
				menores++;
			} else {
				mayores++;
			}
		}
		
		double edadMedia = sumaEdades / atletas.size();
		double alturaMedia = sumaAlturas / atletas.size();

		System.out.println("Promedio de edad: " + edadMedia);
		System.out.println("Promedio de altura: " + alturaMedia);

		System.out.println("Menores de edad: " + menores);
		System.out.println("Mayores de edad: " + mayores);
				
		for (Atleta a : atletas) {
            if (a.getAltura() > alturaMedia) {
                System.out.println(a.getNombre() + " - Altura: " + a.getAltura());
            }
		}

}
}
