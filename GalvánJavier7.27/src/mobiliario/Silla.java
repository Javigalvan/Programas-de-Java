package mobiliario;

public class Silla extends Asiento implements Ajustable {
	
	public static final int MIN_POSICION = 1;
	public static final int MAX_POSICION = 4;
	
	protected int numPosicionRespaldo;
	
public Silla (double precio, String descripcion,String tapiceria, String color, int numPosicion ) {
	super(precio, descripcion,Asiento.MIN_PLAZAS, tapiceria,color);
	
	this.numPosicionRespaldo = MIN_POSICION;
	
}

public int obtenerPosicion() {
	return numPosicionRespaldo;
}

public int bajarPosicion() {
	return numPosicionRespaldo - 1;
}

public int subirPosicion() {
	return numPosicionRespaldo + 1;
}

@Override
public String toString() {
	return super.toString() + ", numPosicion=" + numPosicionRespaldo;
}

}
