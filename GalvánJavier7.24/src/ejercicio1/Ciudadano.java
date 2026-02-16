package ejercicio1;

public class Ciudadano extends Humano {
	protected String documento;
	
public Ciudadano(String nombre, String apellido, String documento) {
	super(nombre, apellido);
	
	this.documento = documento;
}
public String GetDocumento () {
	return super.getNombreCompleto() + ", " + documento;
}

}
