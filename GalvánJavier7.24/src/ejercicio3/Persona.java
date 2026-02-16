package ejercicio3;

import java.time.LocalDate;

public class Persona {
	
	protected static final int EDAD_JUBILACION = 65;
	
	protected String dni;
	protected String nombre;
	protected String apellidos;
	protected LocalDate fechaNacimiento;
	protected String genero;
	protected double salario;
	protected String telefono;
	protected String email;
	
public Persona(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String genero, double salario, String telefono, String email) {
	
	this.dni = dni;
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.fechaNacimiento = fechaNacimiento;
	this.genero = genero;
	this.salario = salario;
	this.telefono = telefono;
	this.email = email;
}	
public Persona() {
	
}

public void aumentoSalario(double porcentaje) {
    if (porcentaje > 0) {
        salario += salario * (porcentaje / 100);
    }
}

public int anyosJubilacion() {

    LocalDate hoy = LocalDate.now();

    int edadActual = hoy.getYear() - fechaNacimiento.getYear();

    if (hoy.getMonthValue() < fechaNacimiento.getMonthValue() ||
        (hoy.getMonthValue() == fechaNacimiento.getMonthValue() &&
         hoy.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
        edadActual--;
    }

    int anyosRestantes = EDAD_JUBILACION - edadActual;

    if (anyosRestantes < 0) {
        return 0;
    }

    return anyosRestantes;
}
public String getDni() {
    return dni;
}

public void setDni(String dni) {
    this.dni = dni;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellidos() {
    return apellidos;
}

public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

public LocalDate getFechaNacimiento() {
    return fechaNacimiento;
}

public void setFechaNacimiento(LocalDate fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
}

public String getGenero() {
    return genero;
}

public void setGenero(String genero) {
    this.genero = genero;
}

public double getSalario() {
    return salario;
}

public void setSalario(double salario) {
    this.salario = salario;
}

public String getTelefono() {
    return telefono;
}

public void setTelefono(String telefono) {
    this.telefono = telefono;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}
@Override
public String toString() {
	return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNacimiento="
			+ fechaNacimiento + ", genero=" + genero + ", salario=" + salario + ", telefono=" + telefono + ", email="
			+ email + "]";
}

}
