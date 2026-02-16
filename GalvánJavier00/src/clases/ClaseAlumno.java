package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClaseAlumno {
	
	    
	    public static final String DNI_DEFAULT = "74629304D";
	    public static final String NOMBRE_DEFAULT = "Josema";
	    public static final String APELLIDOS_DEFAULT = "Gonzalez";
	    public static final LocalDate FECHA_NACIMIENTO_DEFAULT = LocalDate.now();
	    public static final float PESO_DEFAULT = 60.00f;
	    public static final float ALTURA_DEFAULT = 1.80f;
	    public static final short NUMALUMNOS_DEFAULT = 500;
	    public static final short NUMMAXALUMNOS_DEFAULT = 30;
	    public static final byte NUMHERMANOS_DEFAULT = 1;
	    public static final boolean MAYOREDAD_DEFAULT = true;
	    public static final LocalTime HORAMAXIMA_DEFAULT = LocalTime.now();
	    public static final LocalTime HORAMINIMA_DEFAULT = LocalTime.now();
	    
	    
		private String dni;
	    private String nombre;
		private String apellidos;
	    private LocalDate fechaNacimiento;
	    private float peso;
	    private float altura;
	    private static short numAlumnos;
	    private static short numMaxAlumnos;	    
	    private byte numHermanos;
	    private boolean mayorEdad;
	    private LocalTime horaMaxima;
	    private LocalTime horaMinima;
	    

			
public ClaseAlumno (String dni, String nombre, String apellidos,LocalDate fechaNaciminiento, float peso, float altura, short NumAlumnos, short numMaxAlumnos, 
		byte numHermanos, boolean mayorEdad, LocalTime horaMaxima, LocalTime horaMinima) throws IllegalArgumentException  {
	
	if (dni == null || dniCorrecto(dni) == false) {
		throw new IllegalArgumentException("DNI invalido");
	}		
	if (nombre == null || nombre.isEmpty()) {
        throw new IllegalArgumentException("El nombre no puede estar vacio");
    }	
	if (apellidos == null || apellidos.isEmpty()) {
        throw new IllegalArgumentException("Los apellidos no pueden estar vacios");
    }	
	if (fechaNacimiento == null || fechaNacimiento.isAfter(LocalDate.now())) {
         throw new IllegalArgumentException("Fecha de nacimiento invalida");
    }	 
	if (peso <= 0) {
         throw new IllegalArgumentException("El peso tiene que ser positivo");
     }	 	 
	 if (altura <= 0) {
         throw new IllegalArgumentException("La altura tiene que ser positiva");
     }
	
	 this.dni = dni;
	 this.nombre = nombre;
	 this.apellidos = apellidos;
	 this.fechaNacimiento = fechaNacimiento;
	 this.peso = peso;
	 this.altura = altura;
	 this.numAlumnos = numAlumnos;
	 this.numMaxAlumnos = numMaxAlumnos;
	 this.numHermanos = numHermanos;
	 this.mayorEdad = mayorEdad;
	 this.horaMaxima = horaMaxima;
	 this.horaMinima = horaMinima;
}

public static boolean dniCorrecto (String dni) {
	
	boolean dniValido = false;
	
	if (dni.matches("\\d{8}[A-Za-z]")) {
		return dniValido = true;
	} else {
		return dniValido= false;
	}
	
}

public ClaseAlumno (String dni, String nombre, String apellidos) throws IllegalArgumentException {
	
	this (dni, nombre, apellidos, FECHA_NACIMIENTO_DEFAULT, PESO_DEFAULT, ALTURA_DEFAULT, NUMALUMNOS_DEFAULT,NUMMAXALUMNOS_DEFAULT 
			, NUMHERMANOS_DEFAULT, MAYOREDAD_DEFAULT, HORAMAXIMA_DEFAULT, HORAMINIMA_DEFAULT);
}

public ClaseAlumno () {
	
	this (DNI_DEFAULT, NOMBRE_DEFAULT, APELLIDOS_DEFAULT, FECHA_NACIMIENTO_DEFAULT, PESO_DEFAULT, ALTURA_DEFAULT, NUMALUMNOS_DEFAULT,NUMMAXALUMNOS_DEFAULT 
			, NUMHERMANOS_DEFAULT , MAYOREDAD_DEFAULT, HORAMAXIMA_DEFAULT, HORAMINIMA_DEFAULT );
}


}
	
