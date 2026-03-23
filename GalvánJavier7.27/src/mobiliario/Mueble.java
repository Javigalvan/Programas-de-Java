package mobiliario;

abstract class Mueble {
	
	public static final double MIN_PRECIO = 0.01;
	public static final double MAX_PRECIO  = 10000.00;
	
	private static int contador = 0;
	private final int id;
	protected double precio;
	private final String descripcion;

public Mueble (double precio,String descripcion ) throws IllegalArgumentException {
	
	if (precio > MAX_PRECIO || precio < MIN_PRECIO) {
		throw new IllegalArgumentException("Error. El precio no está en el rango permitido");
	}
	
    this.id = contador++;
	this.precio = precio;
	this.descripcion = descripcion;
}

public int getId() {
	return id;
}

public double getPrecio() {
	return precio;
}

public String getDescripcion() {
	return descripcion;
}
@Override
public String toString() {
	return "Tipo = "+ this.getClass().getSimpleName() + "id = " + this.getId() + ", precio = " + this.getPrecio() + ", descripcion = " + this.getDescripcion();
}

public  String obtenerModulos(String modulo) {
	return "Se ha añadido : " + modulo;
}
public static String anyadirModulo(Modulo modulo) {
	return "";
}
public static String extraerModulos() {
	return "";
}


}
