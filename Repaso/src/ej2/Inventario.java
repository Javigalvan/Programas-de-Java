package ej2;

import java.util.ArrayList;

public class Inventario {
	
	private Mascotas[] mascotas;
    private int cantidad; // número actual de mascotas

    // Constructor con tamaño máximo
    public Inventario(int capacidad) {
        this.mascotas = new Mascotas[capacidad];
        this.cantidad = 0;
}

    public void agregar(Mascotas m) {
        if (cantidad < mascotas.length) {
            mascotas[cantidad] = m;
            cantidad++;
        } else {
            System.out.println("Inventario lleno");
        }
    }

    public void mostrar() {
        for (int i = 0; i < cantidad; i++) {
            mascotas[i].mostrar();
            System.out.println("");
        }
    }

    public void buscar(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (mascotas[i].getNombre().equalsIgnoreCase(nombre)) {
                mascotas[i].mostrar();
                return;
            }
        }
        System.out.println("No encontrada");
    }

    public void eliminar(String nombre) {
        for (int i = 0; i < cantidad; i++) {
            if (mascotas[i].getNombre().equalsIgnoreCase(nombre)) {

                // Desplazar elementos hacia la izquierda
                for (int j = i; j < cantidad - 1; j++) {
                    mascotas[j] = mascotas[j + 1];
                }

                mascotas[cantidad - 1] = null; 
                cantidad--;

                System.out.println("Eliminada");
                return;
            }
        }
        System.out.println("No existe");
    }

    public void vaciar() {
        for (int i = 0; i < cantidad; i++) {
            mascotas[i] = null;
        }
        cantidad = 0;
    }
}
