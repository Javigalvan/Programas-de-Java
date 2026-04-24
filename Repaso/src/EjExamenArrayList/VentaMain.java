	package EjExamenArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class VentaMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Venta> ventas = new ArrayList<>();
	       
	       int opcion;
	       do {
	           System.out.println("\n--- Menú ---");
	           System.out.println("1.- Introducir ventas de coches de cada mes");
	           System.out.println("2.- Mostrar ventas introducidas");
	           System.out.println("3.- Mostrar suma total de ventas del año");
	           System.out.println("4.- Mostrar ventas totales de meses que empiezan por A");
	           System.out.println("5.- Mostrar mes con más ventas");
	           System.out.println("6.- Salir");
	           System.out.print("Elige una opción (1-6): ");
	           opcion = sc.nextInt();
	           sc.nextLine(); // Limpiar buffer
	           switch(opcion) {
	               case 1:
	                   ventas.clear(); // Para permitir reingresar datos
	                   for(String mes : new String[]{"Enero","Febrero","Marzo","Abril","Mayo","Junio",
	                                                "Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}) {
	                       System.out.print("Introduce ventas de coches para " + mes + ": ");
	                       int coches = sc.nextInt();
	                       sc.nextLine();
	                       ventas.add(new Venta(mes, coches));
	                   }
	                   break;
	               case 2:
	                   System.out.println("\nVentas introducidas:");
	                   for(Venta v : ventas) {
	                       System.out.println(v);
	                   }
	                   break;
	               case 3:
	                   int total = 0;
	                   for(Venta v : ventas) total += v.getCochesVendidos();
	                   System.out.println("Suma total de ventas del año: " + total + " coches");
	                   break;
	               case 4:
	                   int totalA = 0;
	                   for(Venta v : ventas) {
	                       if(v.getMes().startsWith("A")) {
	                           totalA += v.getCochesVendidos();
	                       }
	                   }
	                   System.out.println("Ventas totales de meses que empiezan por A: " + totalA + " coches");
	                   break;
	               case 5:
	                   if(!ventas.isEmpty()) {
	                       Venta max = ventas.get(0);
	                       for(Venta v : ventas) {
	                           if(v.getCochesVendidos() > max.getCochesVendidos()) max = v;
	                       }
	                       System.out.println("Mes con más ventas: " + max.getMes() + " (" + max.getCochesVendidos() + " coches)");
	                   } else {
	                       System.out.println("No se han introducido ventas aún.");
	                   }
	                   break;
	               case 6:
	                   System.out.println("¡Adiós!");
	                   break;
	               default:
	                   System.out.println("Opción incorrecta. Introduce un número del 1 al 6.");
	           }
	       } while(opcion != 6);


	}

}
