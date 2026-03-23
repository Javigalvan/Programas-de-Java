package ej2;

import java.time.LocalDate;

public class Perro extends Mascotas {
    protected String raza;
    protected boolean pulgas;

    public Perro(String nombre, int edad, LocalDate fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    public void habla() {
        System.out.println(this.nombre + " dice: Guau!");
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Raza: " + this.raza);
        System.out.println("Pulgas: " + this.pulgas);
    }
}
