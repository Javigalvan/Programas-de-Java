package Galvan;

public class VehiculosMain {

	public static void main(String[] args) {
		
		//1
		Coches coche1 = new Coches();
		coche1.mostrarInformacion();
		System.out.println("");
		//2
		coche1.precioAlquiler((byte)10);
		System.out.println("");
		
		//3
		Motos moto1 = new Motos("1234 ABC");
		moto1.mostrarInformacion();
		System.out.println("");
		
		//4
		moto1.precioAlquiler((byte)5);
		System.out.println("");
		
		//5
		
	}

}
