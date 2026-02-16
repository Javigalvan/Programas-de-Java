package ejercicio1;

public class Humano {
	
	protected String nombre;
	protected String apellido;
	
protected Humano (String nombre,String apellido ) {
	this.nombre = nombre;
	this.apellido = apellido;
}
public Humano() {
	this("Juan", "Garcia");
}
public String getNombreCompleto() {
	return nombre + ", " + apellido;
}



}
