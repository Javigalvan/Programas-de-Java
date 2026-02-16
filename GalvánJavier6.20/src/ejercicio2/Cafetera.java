package ejercicio2;


public class Cafetera {
	
	public static final double CAPACIDADMAX_DEFAULT = 1000;
	public static final double CANTIDADACTUAL_DEFAULT = 0;
	
	private double capacidadMaxima;
	private double cantidadActual;
	
public Cafetera(double capacidadMaxima, double cantidadActual) throws IllegalArgumentException {
	
    this.capacidadMaxima = capacidadMaxima;

    if (cantidadActual > capacidadMaxima) {
        double sobrante = cantidadActual - capacidadMaxima;
        this.cantidadActual = capacidadMaxima;
        throw new IllegalArgumentException("La cantidad actual supera la capacidad máxima");
    } else {
        this.cantidadActual = cantidadActual;
    }
}	

public Cafetera () {
	
	this(CAPACIDADMAX_DEFAULT, CANTIDADACTUAL_DEFAULT);
	
}

public Cafetera (double capacidadMaxima) {
	
	this(CAPACIDADMAX_DEFAULT, CANTIDADACTUAL_DEFAULT);
	
	this.capacidadMaxima = capacidadMaxima;
	this.cantidadActual = cantidadActual;
}


public void llenarCafetera (double cantidad) throws IllegalArgumentException {

    if (cantidad < 0) {
        throw new IllegalArgumentException("No se puede añadir una cantidad negativa");
    }

    if ((cantidadActual + cantidad) > capacidadMaxima) {
        double sobrante = (cantidadActual + cantidad) - capacidadMaxima;
        cantidadActual = capacidadMaxima;
        throw new IllegalArgumentException("Se ha superado la capacidad máxima de la cafetera");       
    }
    cantidadActual += cantidad;
}

public void servirTaza (int cantidad) throws IllegalArgumentException {
	
	if (this.cantidadActual < cantidad) {
        double servido = this.cantidadActual;
        this.cantidadActual = 0;
        throw new IllegalStateException("No hay suficiente café. Se han servido solo " + servido + " cc.");
    }

    this.cantidadActual -= cantidad;
}

public void vaciarCafetera () {
	this.cantidadActual = 0;
}

public double getCapacidadMaxima() {
	return capacidadMaxima;
}

public void setCapacidadMaxima(double capacidadMaxima) {
	this.capacidadMaxima = capacidadMaxima;
}

public double getCantidadActual() {
	return cantidadActual;
}

public void setCantidadActual(double cantidadActual) {
	this.cantidadActual = cantidadActual;
}

@Override
public String toString() {
	return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + "]";
}

}

