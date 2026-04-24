package Galvan;

import java.time.LocalDate;

public class Motos extends Vehiculos{
	

	public Motos (String id, String matricula, LocalDate fechaFabricacion, byte precioDia, boolean alquilado) {
		super(id, matricula, fechaFabricacion, precioDia, alquilado);
		
	}
	public Motos (String matricula) {
		this("",matricula, LocalDate.of(2020, 1, 1), (byte)100, false);
	}
	public void precioAlquiler(byte numDias) {
		
		if (alquilado == true) {
			System.out.println("La moto ya esta alquilado");
		} else {
			double precioFinal = 25 * numDias;
			int anyoHoy = LocalDate.now().getYear();
			int anyo = anyoHoy - fechaFabricacion.getYear();
		
			if (anyo > 5) {
				precioFinal = precioFinal * 0.90;
			}
			System.out.println(precioFinal);
		}
		
	}

}
