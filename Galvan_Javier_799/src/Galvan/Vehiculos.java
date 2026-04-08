package Galvan;

import java.time.LocalDate;

abstract class Vehiculos {
	
	protected static final short MAX_ID = 999;
	protected static short ultimoId = 0;
	
	protected String id;
	protected String matricula;
	protected LocalDate fechaMatriculacion;
	protected boolean itv;
	protected double precioDia;
	
	protected int numDias;
	
	
public Vehiculos(String id, String matricula, LocalDate fechaMatriculacion, boolean itv, double precioDia) {
	
	LocalDate ultimaFecha = LocalDate.of(2010, 1, 1);
	
	if (Vehiculos.MAX_ID == this.ultimoId) {
		throw new IllegalStateException ("Error. No hay mas identificadores");
	}
	if(fechaMatriculacion.isBefore(ultimaFecha)) {
		throw new IllegalStateException ("Error. La fecha tiene que ser despues del 1-1-2010");
	}
	
	this.id = fechaMatriculacion.getYear() + " " + ultimoId++;
	this.matricula = matricula;
	this.fechaMatriculacion = fechaMatriculacion;
	this.itv = itv;
	this.precioDia = precioDia;
	}
	public Vehiculos() {
		this(" ","1111AAA",LocalDate.of(2020, 1, 1), true, 100.00);
	}
	public static int CalcularNumVehiculos () {	
		return ultimoId;
	}
	public void mostrarInformacion() {
		System.out.println("id: " + this.id);
	    System.out.println("Matricula: " + this.matricula);
	    System.out.println("Fecha de matriculacion: " + this.fechaMatriculacion);
	    System.out.println("Tiene ITV: " + this.itv);
	    System.out.println("Precio por dia: " + this.precioDia);
	}
	public abstract void CalcularPrecio(int numDias);
		
	
	}


