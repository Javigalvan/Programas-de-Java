package ejercicio1;

public class Linea {
	
	private Punto puntoA;
	private Punto puntoB;

public Linea (Punto puntoA, Punto puntoB) throws IllegalArgumentException {
	this.puntoA = puntoA;
    this.puntoB = puntoB;
	
}
public Linea () {
	
	this.puntoA = new Punto(0, 0);
    this.puntoB = new Punto(0, 0);
	
}

public Punto getPuntoA() {
    return puntoA;
}

public Punto getPuntoB() {
    return puntoB;
}

public void setPuntoA(Punto puntoA) {
    this.puntoA = puntoA;
}

public void setPuntoB(Punto puntoB) {
    this.puntoB = puntoB;
}

public void mueveDerecha(double distancia) {
    puntoA.setX(puntoA.getX() + distancia);
    puntoB.setX(puntoB.getX() + distancia);
}

public void mueveIzquierda(double distancia) {
    puntoA.setX(puntoA.getX() - distancia);
    puntoB.setX(puntoB.getX() - distancia);
}

public void mueveArriba(double distancia) {
    puntoA.setY(puntoA.getY() + distancia);
    puntoB.setY(puntoB.getY() + distancia);
}

public void mueveAbajo(double distancia) {
    puntoA.setY(puntoA.getY() - distancia);
    puntoB.setY(puntoB.getY() - distancia);
}

public String escribirLinea() {
    return String.format(
        "[(%.1f, %.1f), (%.1f, %.1f)]%n",
        puntoA.getX(), puntoA.getY(),
        puntoB.getX(), puntoB.getY()
    );
}
}

