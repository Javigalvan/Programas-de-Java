package ej2;

import java.time.LocalDate;

public class Gato extends Mascotas {
    protected String color;
    protected boolean peloLargo;

    public Gato(String nombre, int edad, LocalDate fechaNacimiento, String color, boolean peloLargo) {
        super(nombre, edad, fechaNacimiento);
        this.color = color;
        this.peloLargo = peloLargo;
    }

    public void habla() {
        System.out.println(this.nombre + " dice: Miau!");
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Color: " + this.color);
        System.out.println("Pelo Largo: " + this.peloLargo);
    }
}
