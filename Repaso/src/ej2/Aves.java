package ej2;

import java.time.LocalDate;

public abstract class Aves extends Mascotas {
    protected String pico;
    protected boolean vuela;

    public Aves(String nombre, int edad, LocalDate fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    public void volar() {
        if (this.vuela) {
            System.out.println(this.nombre + " está volando");
        } else {
            System.out.println(this.nombre + " no puede volar");
        }

    }
}
