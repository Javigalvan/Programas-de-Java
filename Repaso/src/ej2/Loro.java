package ej2;

import java.time.LocalDate;

public class Loro extends Aves {
    protected String origen;

    public Loro(String nombre, int edad, LocalDate fechaNacimiento, String pico, boolean vuela, String origen) {
        super(nombre, edad, fechaNacimiento, pico, vuela);
        this.origen = origen;
    }

    public void habla() {
        System.out.println(this.nombre + " dice: Loro!");
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("origen: " + this.origen);
    }

    public void volar() {
        if (this.vuela) {
            System.out.println(this.nombre + " está volando");
        } else {
            System.out.println(this.nombre + " no puede volar");
        }

    }
}
