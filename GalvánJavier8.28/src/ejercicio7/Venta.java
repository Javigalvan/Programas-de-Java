package ejercicio7;

public class Venta {
	String mes;
    int ventas;

    public Venta(String mes, int ventas) {
        this.mes = mes;
        this.ventas = ventas;
    }

    public String toString() {
        return mes + ": " + ventas;
    }
}
	
