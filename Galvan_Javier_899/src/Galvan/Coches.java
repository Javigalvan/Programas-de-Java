package Galvan;

import java.time.LocalDate;

public class Coches extends Vehiculos{
	
	private String tipoCombustible;
	private int contador=0;

	public Coches(String id, String matricula, LocalDate fechaFabricacion, byte precioDia, boolean alquilado, String tipoCombustible) throws IllegalArgumentException {
		super(id, matricula, fechaFabricacion, precioDia, alquilado);
		
		if(!tipoCombustible.equalsIgnoreCase("gasolina") && !tipoCombustible.equalsIgnoreCase("gasoil") && !tipoCombustible.equalsIgnoreCase("electrico")) {
			throw new IllegalArgumentException ("Error. El tipo de combustible tiene que ser gasolina, gasoil o electrico");
		}
		
		this.tipoCombustible = tipoCombustible;
	}
	public Coches () {
		this("", MATRICULA_DEFAULT, FECHAFABRICACION_DEFAULT,PRECIODIA_DEFAULT, ALQUILADO_DEFAULT, "Gasolina");
	}
	public void precioAlquiler(byte numDias) {
		
		if (alquilado == true) {
			System.out.println("El coche ya esta alquilado");
		} else {
		
			double precioFinal = precioDia * numDias;
		
			if(tipoCombustible == "Electrico") {
				precioFinal = precioFinal * 1.05;
			}
			System.out.println(precioFinal);
		}	
		
	}
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
	    System.out.println("Tipo de combustible: " + this.tipoCombustible);
	}
	
	
	
}
