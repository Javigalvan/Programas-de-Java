package Galvan;

import java.time.LocalDate;


abstract class Vivienda {
	
	protected static final short MAX_ID = 999;
	protected static short ultimoId = 0;
	
	protected String id;
	protected LocalDate fechaConstruccion;
	protected String direccion;
	protected double precioNoche;
	protected boolean disponible;
	
	protected byte numDias;
	
public Vivienda(String id, LocalDate fechaConstruccion,String direccion,double precioNoche,boolean disponible,byte numDias) {
	
	if (Vivienda.MAX_ID == this.ultimoId) {
		throw new IllegalStateException ("Error. No hay mas identificadores");
	}
	
	this.id = fechaConstruccion.getYear() + " " + ultimoId++;
	this.fechaConstruccion = fechaConstruccion;
	this.direccion = direccion;
	this.precioNoche = precioNoche;
	this.disponible = true;
	this.numDias = numDias;
	
}
public void mostrarInformacion() {
	System.out.println("id: " + this.id);
    System.out.println("Fecha Construccion: " + this.fechaConstruccion);
    System.out.println("Direccion: " + this.direccion);
    System.out.println("Precio por Noche: " + this.precioNoche);
    System.out.println("Disponible: " + this.disponible);
}
public short CalcularNumViviendas () {
	
	return ultimoId;
}

public abstract void CalcularPrecioEstancia(byte numDias);


}
