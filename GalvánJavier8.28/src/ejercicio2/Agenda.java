package ejercicio2;

import java.time.LocalDate;
import java.util.Objects;

public class Agenda implements Comparable<Agenda> {
	
	private String nombre;
	public String telefono;
	private String email;
	private String fechaNacimiento;
	
public Agenda(String nombre, String telefono, String email, String fechaNacimiento) {
	
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		
	}

public String getNombre() {
    return nombre;
}

public String getTelefono() {
    return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getFechaNacimiento() {
    return fechaNacimiento;
}

@Override
public String toString() {
	return "Nombre: " + nombre + "\nTelefono:" + telefono + "\nEmail: " + email + "\nFecha de Nacimiento: "
			+ fechaNacimiento;
}

@Override
public int compareTo(Agenda o) {
	return this.nombre.compareTo(o.nombre);
}


//LinkedHashSet
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Agenda)) return false;
    Agenda agenda = (Agenda) o;
    return telefono.equals(agenda.telefono);
}

@Override
public int hashCode() {
    return Objects.hash(telefono);
}
	
}
