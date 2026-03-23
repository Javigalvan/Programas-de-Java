package Galvan;

import java.time.LocalDate;

public class Hotel extends Vivienda {
	
	private byte estrellas;
	private short numHabitaciones;
	private boolean haySpa;
	
public Hotel (String id, LocalDate fechaConstruccion,String direccion,double precioNoche,boolean disponible,byte numDias,  byte estrellas, short numHabitaciones, boolean haySpa) {
	super(id, fechaConstruccion,direccion, precioNoche, disponible,numDias);
	
	this.estrellas = estrellas;
	this.numHabitaciones = numHabitaciones;
	this.haySpa = haySpa;
}
@Override
public void mostrarInformacion() {
	super.mostrarInformacion();
	System.out.println("Numero estrellas: " + this.estrellas);
	System.out.println("numero de Habitaciones: " + this.numHabitaciones);
	System.out.println("hay Spa: " + this.haySpa);
}
@Override
public void CalcularPrecioEstancia(byte numDias) {
	double precioFinal = precioNoche * numDias;
	
	if (estrellas >= 3) {
		precioFinal = precioFinal * 1.05;
	}
	if (haySpa == true) {
		precioFinal = precioFinal + 30;
	}
}
public boolean esLujoso() {
	
	boolean lujoso = false;	
	
	if (estrellas == 5 && haySpa == true) {
		lujoso = true;
	}
	return lujoso;
}
}



