package Galvan;

import java.time.LocalDate;

public class Furgoneta extends Vehiculos {
	
	private double volumenMax;
	private boolean sistemaRefrigeracion;

	public Furgoneta(String id, String matricula, LocalDate fechaMatriculacion, boolean itv, double precioDia, double volumenMax, boolean sistemaRefrigeracion) {
		super(id, matricula, fechaMatriculacion, itv, precioDia);
		
		this.volumenMax = volumenMax;
		this.sistemaRefrigeracion = sistemaRefrigeracion;
	}
	public Furgoneta(double volumenMax, boolean sistemaRefrigeracion) {
		this(" ","1111AAA",LocalDate.of(2020, 1, 1), true, 100.00, 0, true);
	}
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
	    System.out.println("Volumen Maximo de la mercancia: " + this.volumenMax);
	    System.out.println("Sistema de Refrigeracion: " + this.sistemaRefrigeracion);
	}
	public void modificar(String id, String matricula, LocalDate fechaMatriculacion, boolean itv, double precioDia, double volumenMax,boolean sistemaRefrigeracion ) {
		this.id = id;
		this.matricula = matricula;
		this.fechaMatriculacion = fechaMatriculacion;
		this.itv = itv;
		this.precioDia = precioDia;
		this.volumenMax = volumenMax;
		this.sistemaRefrigeracion=sistemaRefrigeracion; 
	}
	
	public void CalcularPrecio(int numDias) {
	
	if(itv==false) {
		System.out.println("No tiene la ITV en vigor");
	} else {
	double precioFinal = precioDia * numDias;
		
	if (sistemaRefrigeracion == true) {
		precioDia = precioDia + 25;
	}
	
	System.out.println(precioFinal);
	}
	}
	public boolean tieneRefrigeracion() {
		if (sistemaRefrigeracion == true) {
			return true;
		} else {
			return false;
		}
	}
}
