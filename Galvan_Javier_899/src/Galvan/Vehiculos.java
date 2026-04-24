package Galvan;

import java.time.LocalDate;

public class Vehiculos {
	
	
	
 	public static final  LocalDate FECHAFABRICACION_DEFAULT = LocalDate.of(2020, 1, 1);
	public static final  String MATRICULA_DEFAULT = "0000 AAA";
	public static final  byte PRECIODIA_DEFAULT = 100;
	public static final  boolean ALQUILADO_DEFAULT = false;
	
	protected static final short COCHE_MAX_ID = 999;
	protected static short contador = 0;
	
	protected String id;
	protected String matricula;
	protected LocalDate fechaFabricacion;
	protected byte precioDia;
	protected boolean alquilado;
	
	public byte numDias;
	
	
	public Vehiculos(String id, String matricula, LocalDate fechaFabricacion, byte precioDia, boolean alquilado) throws IllegalArgumentException {
		LocalDate primeraFecha = LocalDate.of(2000, 1, 1);
		
		if (fechaFabricacion.isBefore(primeraFecha) || fechaFabricacion == null) {
			throw new IllegalArgumentException ("Error. La capacidad de carga tiene que estar entre 0.5 y 20 tn");
		}
		
		this.id = fechaFabricacion.getYear() + "" + contador;
		this.matricula = matricula;
		this.fechaFabricacion = fechaFabricacion;
		this.precioDia = precioDia;
		this.alquilado = alquilado;
	}
	public Vehiculos (String id) {
		this(id, MATRICULA_DEFAULT, FECHAFABRICACION_DEFAULT,PRECIODIA_DEFAULT, ALQUILADO_DEFAULT );
	}
	

	public void mostrarInformacion() {
		System.out.println("Id: " + this.id);
	    System.out.println("Matricula: " + this.matricula);
	    System.out.println("Fecha de Fabricacion: " + this.fechaFabricacion);
	    System.out.println("Esta Alquilado: " + this.alquilado);
	    System.out.println("Precio por dia: " + this.precioDia);
	}
	
	
	

}
