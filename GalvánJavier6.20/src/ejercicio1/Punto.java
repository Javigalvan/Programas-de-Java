package ejercicio1;

public class Punto {
	
	double x;
	double y;

public Punto(double x, double y) {
	this.x = x;
	this.y = y;
}

public Punto() {
    this.x = 0;
    this.y = 0;
}

public double getX() {
    return x;
}

public double getY() {
    return y;
}

public void setX(double x) {
    this.x = x;
}

public void setY(double y) {
    this.y = y;
}
}