package galvan;

import java.util.Random;

public class ejercicio1bien {
	
		    static String[] sucursales = {"Málaga", "Sevilla", "Granada"};
		    static String[] meses = {"Ene", "Feb", "Mar", "Abr", "May", "Jun",
		                             "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};

		    public static void main(String[] args) {

		        int[][] ventas = generarVentas();
		        mostrarVentas(ventas);

		        System.out.println("\nTotal anual de ventas: " + calcularTotalAnual(ventas));
		        System.out.println("Mejor mes: " + calcularMejorMes(ventas));
		        System.out.println("Mejor sucursal: " + calcularMejorSucursal(ventas));
		    }

		    // Método para generar la matriz de ventas
		    public static int[][] generarVentas() {
		        int[][] ventas = new int[3][12];
		        Random random = new Random();

		        for (int i = 0; i < ventas.length; i++) {
		            for (int j = 0; j < ventas[i].length; j++) {
		                // múltiplos de 500 entre 1000 y 20000
		                ventas[i][j] = (random.nextInt(39) + 2) * 500;
		            }
		        }
		        return ventas;
		    }

		    // Método para mostrar la matriz en formato tabla
		    public static void mostrarVentas(int[][] ventas) {
		        System.out.print("\t");
		        for (String mes : meses) {
		            System.out.print(mes + "\t");
		        }
		        System.out.println();

		        for (int i = 0; i < ventas.length; i++) {
		            System.out.print(sucursales[i] + "\t");
		            for (int j = 0; j < ventas[i].length; j++) {
		                System.out.print(ventas[i][j] + "\t");
		            }
		            System.out.println();
		        }
		    }

		    // Método para calcular el total anual
		    public static int calcularTotalAnual(int[][] ventas) {
		        int total = 0;
		        for (int[] sucursal : ventas) {
		            for (int venta : sucursal) {
		                total += venta;
		            }
		        }
		        return total;
		    }

		    // Método para calcular el mejor mes
		    public static String calcularMejorMes(int[][] ventas) {
		        int mejorMes = 0;
		        int maxVentas = 0;

		        for (int j = 0; j < 12; j++) {
		            int sumaMes = 0;
		            for (int i = 0; i < 3; i++) {
		                sumaMes += ventas[i][j];
		            }
		            if (sumaMes > maxVentas) {
		                maxVentas = sumaMes;
		                mejorMes = j;
		            }
		        }
		        return meses[mejorMes];
		    }

		    // Método para calcular la mejor sucursal
		    public static String calcularMejorSucursal(int[][] ventas) {
		        int mejorSucursal = 0;
		        int maxVentas = 0;

		        for (int i = 0; i < ventas.length; i++) {
		            int sumaSucursal = 0;
		            for (int j = 0; j < ventas[i].length; j++) {
		                sumaSucursal += ventas[i][j];
		            }
		            if (sumaSucursal > maxVentas) {
		                maxVentas = sumaSucursal;
		                mejorSucursal = i;
		            }
		        }
		        return sucursales[mejorSucursal];
		        

}
	

}
