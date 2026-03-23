package ej2;

import java.time.LocalDate;

abstract class Mascotas {
	
    protected String nombre;
    protected int edad;
    protected String estado;
    protected LocalDate fechaNacimiento;

    public Mascotas(String nombre, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = "Vivo";
    }

    public void cumpleaños() {
        ++this.edad;
    }

    public void morir() {
        this.estado = "Muerto";
    }

    public abstract void habla();

    public void mostrar() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Estado: " + this.estado);
        System.out.println("Fecha nacimiento: " + String.valueOf(this.fechaNacimiento));
    }

    public String getNombre() {
        return this.nombre;
    }
}
