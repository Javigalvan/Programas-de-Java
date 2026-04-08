package Galvan;

import java.time.LocalDate;
import java.util.Scanner;

public class Camion extends Vehiculos {
	
	private double capacidadCarga;

	public Camion(String id, String matricula, LocalDate fechaMatriculacion, boolean itv, double precioDia, double capacidadCarga) throws IllegalArgumentException{
		super(id, matricula, fechaMatriculacion, itv, precioDia);
		
		if (capacidadCarga < 0.5 && capacidadCarga > 20) {
			throw new IllegalArgumentException ("Error. La capacidad de carga tiene que estar entre 0.5 y 20 tn");
		}
		
		this.capacidadCarga = capacidadCarga;
	}
public Camion(double capacidadCarga) {
	this(" ","1111AAA",LocalDate.of(2020, 1, 1), false, 100.00, 0);
}
@Override
public void mostrarInformacion() {
	super.mostrarInformacion();
    System.out.println("Capacidad de carga: " + this.capacidadCarga);
}
public void CalcularPrecio(int numDias) {
	
	if(itv==false) {
		System.out.println("No tiene la ITV en vigor");
	} else {
		
	double precioFinal = precioDia * numDias;
	
	if (capacidadCarga > 10) {
		precioFinal = precioFinal * 1.20;
	}
	System.out.println(precioFinal);
	}
	
}
public void modificar(String id, String matricula, LocalDate fechaMatriculacion, boolean itv, double precioDia, double capacidadCarga) {
	this.id = id;
	this.matricula = matricula;
	this.fechaMatriculacion = fechaMatriculacion;
	this.itv = itv;
	this.precioDia = precioDia;
	this.capacidadCarga = capacidadCarga;
}
public void crearCamion() {
	Scanner entrada = new Scanner(System.in);
	
	this.id = entrada.nextLine();
	this.matricula = entrada.nextLine();
	this.fechaMatriculacion = fechaMatriculacion;
	this.itv = entrada.nextBoolean();
	this.precioDia = entrada.nextDouble();
	this.capacidadCarga = entrada.nextDouble();
}
}
