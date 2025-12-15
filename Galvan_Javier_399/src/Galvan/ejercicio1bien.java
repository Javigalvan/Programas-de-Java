package Galvan;

import java.util.Scanner;

public class ejercicio1bien {

	public static void main(String[] args) {
		
		        Scanner entrada = new Scanner(System.in);

		        String nombreProducto;
		        int numeroUnidades;
		        double precio;
		        double precioFinal = 0;
		        double porcentaje = 0;
		        int productosProcesados = 0;
		        String opcion;

		        do {

		            System.out.print("Escribe el nombre de un producto (o 'Terminar' para finalizar): ");
		            nombreProducto = entrada.nextLine();
		           
		            opcion = nombreProducto;

		                // Pedir unidades con validación
		                System.out.print("Escribe el número de unidades a comprar: ");
		                numeroUnidades = entrada.nextInt();

		                while (numeroUnidades < 1 || numeroUnidades > 100) {
		                    System.out.print("Escribe un número de unidades entre 1 y 100: ");
		                    numeroUnidades = entrada.nextInt();
		                }

		                // Pedir precio
		                System.out.print("Escribe el precio: ");
		                precio = entrada.nextDouble();

		                // Limpieza del buffer
		                entrada.nextLine();

		                // Cálculo del descuento
		                if (numeroUnidades >= 1 && numeroUnidades <= 10) {
		                    porcentaje = 5;
		                    precioFinal = (precio * numeroUnidades) * 0.95;
		                } else if (numeroUnidades <= 50) {
		                    porcentaje = 10;
		                    precioFinal = (precio * numeroUnidades) * 0.90;
		                } else { // 51 a 100
		                    porcentaje = 15;
		                    precioFinal = (precio * numeroUnidades) * 0.85;
		                }

		                // Mostrar resultados
		                System.out.println("\n------ RESULTADO ------");
		                System.out.println("Nombre del producto: " + nombreProducto);
		                System.out.println("Número de unidades: " + numeroUnidades);
		                System.out.println("Porcentaje de descuento: " + porcentaje + "%");
		                System.out.println("Total sin descuento: " + (precio * numeroUnidades) + "$");
		                System.out.println("Total con descuento: " + precioFinal + "$");
		                System.out.println("------------------------\n");

		                productosProcesados++;
		            }while (opcion.equalsIgnoreCase("Terminar"));

		        

		        // Mostrar total de productos procesados
		        System.out.println("Cantidad total de productos procesados: " + productosProcesados);
		        entrada.close();
		    



	}

}
