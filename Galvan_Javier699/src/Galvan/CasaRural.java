package Galvan;

import java.time.LocalDate;

public class CasaRural extends Vivienda{
	
	private short metrosCuadrados;
	private boolean admiteMascotas;
	
public CasaRural (String id, LocalDate fechaConstruccion,String direccion,double precioNoche,boolean disponible,byte numDias, short metrosCuadrados, boolean admiteMascotas) {
	super(id, fechaConstruccion,direccion, precioNoche, disponible, numDias);
	
	if (metrosCuadrados < 0) {
		throw new IllegalArgumentException ("Error. Los metros cuadrados tienen que ser positivos");
	}
	this.metrosCuadrados = metrosCuadrados;
	this.admiteMascotas = admiteMascotas;
	
}
@Override
public void mostrarInformacion() {
	super.mostrarInformacion();
	System.out.println("Numero metros Cuadrados: " + this.metrosCuadrados);
	System.out.println("admite Mascotas: " + this.admiteMascotas);

}
@Override
public void CalcularPrecioEstancia(byte numDias) {
	double precioFinal = precioNoche * numDias;
	
	if (admiteMascotas == true) {
		precioFinal = precioFinal + 20;
	}
}
public boolean esPetFriendly() {
	
	boolean petfriendly = false;
	
	if (metrosCuadrados > 100 && admiteMascotas ==true) {
		petfriendly=true;
	}
	return petfriendly;
}

}

