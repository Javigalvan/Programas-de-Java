package ejercicio1;

import libtarea3.*;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		
	//1	
		Bombilla bombilla1;
		Bombilla bombilla2;
		Bombilla bombilla3;
		
	//2
		System.out.printf("Hay %s bombillas creadas %n", Bombilla.getBombillasCreadas());
		
		System.out.printf("Hay %s bombillas encendidas %n", Bombilla.getBombillasCreadas());
		
	//3	
		//3.1
		try {
			Bombilla bombillaError1 = new Bombilla(true, 250);
		} catch (IllegalArgumentException ex31) {
			System.out.printf("ERROR, %s W %n", ex31.getMessage());	
		}
		
		//3.2
		try {
			Bombilla bombillaError2 = new Bombilla(5);
		} catch (IllegalArgumentException ex32) {
			System.out.printf("ERROR, %s W %n", ex32.getMessage());	
		}
		
		//3.3
		try {
			bombilla1 = new Bombilla(true, 100);
		} catch (IllegalArgumentException ex33) {
			System.out.printf("ERROR, %s W %n", ex33.getMessage());	
			bombilla1 = new Bombilla(true, 100);
		}
		
		//3.4
		try {
			bombilla2 = new Bombilla(true);
		} catch (IllegalArgumentException ex34) {
			System.out.printf("ERROR, %s W %n", ex34.getMessage());	
			bombilla2 = new Bombilla(true);
		}
		
		//3.5
		try {
			bombilla3 = new Bombilla();
		} catch (IllegalArgumentException ex35) {
			System.out.printf("ERROR, %s W %n", ex35.getMessage());	
			bombilla3 = new Bombilla();
		}
		
	//4
		//4.1
		try {
			bombilla1.encender();
		} catch (IllegalStateException ex41) {
			System.out.printf("ERROR, %s%n", ex41.getMessage());	
		}
		
		//4.2
		for (int i=1; i<=6; i++) {
			bombilla1.conmutar();
			System.out.println(bombilla1.toString());
			Utilidades.esperar(1);
		}
		
		//4.3
		try {
			bombilla2.apagar();
		} catch (IllegalStateException ex43) {
			System.out.printf("ERROR, %s%n", ex43.getMessage());	
		}
		
		//4.4
		try {
			bombilla3.encender();
		} catch (IllegalStateException ex44) {
			System.out.printf("ERROR, %s%n", ex44.getMessage());	
		}
		
	//5
		System.out.printf("%n");
		//5.1
		System.out.printf("Potencia de la bombilla: %s W %n", bombilla1.getPotencia());
		//5.2
		System.out.printf("Estado de la bombilla: %s%n", bombilla1.getEstado());
		//5.3
		System.out.printf("Última vez que se encendió la bombilla: %s%n", bombilla1.getUltimaVezEncendida());
		//5.4
		System.out.printf("Número de veces encendida: %s%n", bombilla1.getVecesEncendida());
		//5.5
		System.out.printf("Tiempo que lleva encendida: %s segundos %n", bombilla1.getTiempoEncendida());
		//5.6
		System.out.printf("Potencia consumida: %s W %n", bombilla1.getPotenciaConsumida());
		
	//6
		System.out.printf("%n");
		//6.1
		System.out.printf("Hay %s bombillas creadas %n", Bombilla.getBombillasCreadas());
		//6.2
		System.out.printf("Hay %s bombillas encendidas %n", Bombilla.getBombillasCreadas());
		
	}


}
