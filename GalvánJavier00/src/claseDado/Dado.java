package claseDado;


public class Dado {
	
	private static final String[] NOMBRES_CARAS = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", 
		"DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISÉIS", "DICECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE"};
	
	public static final int DEFAULT_NUMERO_CARAS = 6;
	private int[] registroLanzamientos;
	private final int numCaras;
	private int cantidadLanzamientos;
	
public Dado (int numCaras) throws IllegalArgumentException, IllegalStateException{
	
	if (numCaras != 4 && numCaras != 6 && numCaras != 8 && numCaras != 12 && numCaras != 20) {
        throw new IllegalArgumentException ("Error. Numero de caras no valido");
  }
	
	this.numCaras = numCaras;
	this.cantidadLanzamientos = 0;
	this.registroLanzamientos= new int[numCaras];
	
}
public Dado () {
	this(DEFAULT_NUMERO_CARAS);
}
public int GetNumeroCaras() {
	return this.numCaras;
}
public int GetNumeroLanzamientos() {
	return this.cantidadLanzamientos;	
}
public String lanzar() {
	int aleatorio = (int) (Math.random()* numCaras);
	this.cantidadLanzamientos++;
	this.registroLanzamientos[aleatorio]++;
	return Dado.NOMBRES_CARAS[aleatorio];
	
}
public String ToString() {
	String resultado = "Numero de caras: " + this.numCaras + ", Numero de lanzamientos: " + this.cantidadLanzamientos;
	return resultado;
}

public int getNumeroVecesCara (int cara) throws IllegalArgumentException {
	  if (cara < 1 || cara > this.GetNumeroCaras()) {
	    throw new IllegalArgumentException ("Error. Numero de cara no valida");
	  }
	  return this.registroLanzamientos[cara-1];
	}
}
