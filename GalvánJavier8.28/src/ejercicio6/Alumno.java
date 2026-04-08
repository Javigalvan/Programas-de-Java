package ejercicio6;

import java.time.LocalDate;

public class Alumno {
	String codigo;
    String apellidos;
    String nombre;
    String direccion;
    String telefono;
    String codigoCiclo;
    int cursosAprobados;
    LocalDate fechaAlta;

    // Constructor
    public Alumno(String codigo, String apellidos, String nombre, String direccion,
                  String telefono, String codigoCiclo, int cursosAprobados, LocalDate fechaAlta) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoCiclo = codigoCiclo;
        this.cursosAprobados = cursosAprobados;
        this.fechaAlta = fechaAlta;
    }

    // Método toString para mostrar la información
    @Override
    public String toString() {
        return "Alumno{" +
                "codigo='" + codigo + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", codigoCiclo='" + codigoCiclo + '\'' +
                ", cursosAprobados=" + cursosAprobados +
                ", fechaAlta=" + fechaAlta +
                '}';
    }
}
