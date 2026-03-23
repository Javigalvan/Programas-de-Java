package ej2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(4);
        Perro perro1 = new Perro("Rocky", 3, LocalDate.now(), "Labrador", false);
        Gato gato1 = new Gato("Michi", 2, LocalDate.now(), "Negro", true);
        Loro loro1 = new Loro("Pepe", 4, LocalDate.now(), "Curvo", true, "Brasil");
        Canario canario1 = new Canario("Piolin", 1, LocalDate.now(), "Pequeño", true, "Amarillo", true);
        inventario.agregar(perro1);
        inventario.agregar(gato1);
        inventario.agregar(loro1);
        inventario.agregar(canario1);
        System.out.println("=== TODAS LAS MASCOTAS ===");
        inventario.mostrar();
        System.out.println("\n=== BUSCAR 'Michi' ===");
        inventario.buscar("Michi");
        System.out.println("\n=== HABLAN ===");
        perro1.habla();
        gato1.habla();
        loro1.habla();
        canario1.habla();
    }
}
