package Galvan;

import java.time.LocalDate;

public class Apartamento extends Vivienda{
	
	private short numHabitaciones;
	private short distaciaCentroCiudad;
	private LocalDate fechaUltimaReforma;
	
public Apartamento (String id, LocalDate fechaConstruccion,String direccion,double precioNoche,boolean disponible,byte numDias, short numHabitaciones,short distaciaCentroCiudad,LocalDate fechaUltimaReforma) {
	super(id, fechaConstruccion,direccion, precioNoche, disponible, numDias);
	LocalDate hoy = LocalDate.now();
	
	if (fechaUltimaReforma.isAfter(hoy)) {
		throw new IllegalArgumentException ("Error. La fecha tiene que ser anterior a la de hoy");
	}
	
	this.numHabitaciones = numHabitaciones;
	this.distaciaCentroCiudad = distaciaCentroCiudad;
	this.fechaUltimaReforma = fechaUltimaReforma;
	
}
public Apartamento() {
	this("",LocalDate.of(2022, 02, 02),"Calle Playamar", 100.00, true, (byte) 1, (short)20, (short)1,LocalDate.of(2022, 02, 02));
}
@Override
public void mostrarInformacion() {
	super.mostrarInformacion();
	System.out.println("Numero Habitaciones: " + this.numHabitaciones);
	System.out.println("Distancia centro ciudad : " + this.distaciaCentroCiudad);
	System.out.println("fecha Ultima Reforma: " + this.fechaUltimaReforma);
}
@Override
public void CalcularPrecioEstancia(byte numDias) {
	
	double precioFinal = precioNoche * numDias;
	
	if (distaciaCentroCiudad < 2) {
		precioFinal = precioFinal * 1.15;
	}
	
}
}
