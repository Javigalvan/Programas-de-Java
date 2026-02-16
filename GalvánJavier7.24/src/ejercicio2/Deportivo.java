package ejercicio2;

import java.time.LocalDate;

public class Deportivo extends Coche{
	
	 protected String traccion;
	 
public Deportivo (int cilindrada,int potencia, String traccion) throws IllegalArgumentException {
	super(cilindrada, potencia);
		
	setTraccion(traccion);

}
public void setTraccion(String traccion) {
    if (traccion == null || !(traccion.equalsIgnoreCase("total") || traccion.equalsIgnoreCase("delantera"))) {
        throw new IllegalArgumentException("La tracción solo puede ser 'total' o 'delantera'");
    }
    this.traccion = traccion.toLowerCase();
}
@Override
public String toString() {
	return super.toString() + ", traccion = " + traccion ;
}

}
