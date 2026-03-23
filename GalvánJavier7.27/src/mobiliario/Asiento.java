package mobiliario;

abstract class Asiento extends Mueble {
	
	public static final int MIN_PLAZAS = 1;
	public static final int MAX_PLAZAS = 9;
	
	private int numPlazas;
	private String tapiceria;
	private String color;
	
public Asiento (double precio,String descripcion, int numPlazas, String tapiceria, String color ) {
	super(precio, descripcion);
	
	if (numPlazas > MAX_PLAZAS || numPlazas < MIN_PLAZAS) {
		throw new IllegalArgumentException("Error. El numero de plazas no está en el rango permitido");
	}
	
	this.numPlazas = MIN_PLAZAS;
	this.tapiceria = tapiceria;
	this.color = color;
	
}
public int getNumPlazas() {
	return numPlazas;
}

public String getTapiceria() {
	return tapiceria;
}

public String getColor() {
	return color;
}
@Override
public String toString() {
	return super.toString() + ", numPlazas = " + numPlazas + ", tapiceria = " + tapiceria + ", color = " + color;
}


}
