package ejercicio3;

import java.time.LocalDate;

public class PAS extends Persona{
	
	protected boolean aleman;
	protected boolean chino;
	protected boolean ingles;
	protected String areaAtencion;
	
	public PAS(String dni, String nombre, String apellidos, LocalDate fechaNacimiento, String genero, double salario, String telefono, String email,
            boolean aleman, boolean chino, boolean ingles, String areaAtencion) {

	 super(dni, nombre, apellidos, fechaNacimiento, genero, salario, telefono, email);
	 
     this.aleman = aleman;
     this.chino = chino;
     this.ingles = ingles;
     this.areaAtencion = areaAtencion;
 }

public int numIdiomas() {
        int count = 0;
        if (aleman = true) {
        	count++;
        }
        if (chino = true) {
        	count++;
        }
        if (ingles = true) {
        	count++;
        }     
        return count;
    }
public void cambioIdioma(String idioma) {
    switch (idioma.toLowerCase()) {
        case "aleman":
            aleman = !aleman;
            break;
        case "chino":
            chino = !chino;
            break;
        case "ingles":
            ingles = !ingles;
            break;
        default:
            System.out.println("Idioma no reconocido: " + idioma);
    }
}
@Override
public String toString() {
    return super.toString() +
            ", PAS{" +
            "aleman=" + aleman +
            ", chino=" + chino +
            ", ingles=" + ingles +
            ", areaAtencion='" + areaAtencion + '\'' +
            '}';
}
	
}
