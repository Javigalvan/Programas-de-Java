package ejercicio3;

import java.time.LocalDate;

public class Profesor extends Persona{
	
	protected String titulacion;
	protected String asignatura1;
	protected String asignatura2;
	protected String tutor;
	protected int anyosExperiencia;
		
	
public Profesor (String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String genero, 
		double salario, String telefono, String email, String titulacion,String asignatura1, String asignatura2, String tutor,int anyosExperiencia) {
	
	super(dni, nombre, apellidos, fechaNacimiento, genero, salario, telefono, email);
	
	this.titulacion = titulacion;
    this.asignatura1 = asignatura1;
    this.asignatura2 = asignatura2;
    this.tutor = tutor;
    this.anyosExperiencia = anyosExperiencia;
}
public void aumentarSalario() {

    double porcentaje = 0;

    if (anyosExperiencia >= 5) {
        porcentaje = 5;
    } else if (anyosExperiencia >= 3) {
        porcentaje = 2;
    } else if (anyosExperiencia >= 1) {
        porcentaje = 1;
    }

    if (porcentaje > 0) {
        setSalario(getSalario() + getSalario() * (porcentaje / 100));
    }
}
public String toString() {
    return super.toString() +
            ", Profesor{" +
            "titulacion='" + titulacion + '\'' +
            ", asignatura1='" + asignatura1 + '\'' +
            ", asignatura2='" + asignatura2 + '\'' +
            ", tutor=" + tutor +
            ", anyosExperiencia=" + anyosExperiencia +
            '}';
}

}
