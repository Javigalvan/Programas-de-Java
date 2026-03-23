package ej2;

import java.time.LocalDate;

public class Canario extends Aves {
    private String color;
    private boolean canta;

    public Canario(String nombre, int edad, LocalDate fechaNacimiento, String pico, boolean vuela, String color, boolean canta) {
        super(nombre, edad, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    public void habla() {
        System.out.println(this.nombre + " canta!");
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Color: " + this.color);
        System.out.println("Canta: " + this.canta);
    }
}
