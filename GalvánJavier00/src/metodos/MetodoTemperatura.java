package metodos;

public class MetodoTemperatura {

	public static void main(String[] args) {
		final int MESES = 12;
		final int DIAS = 30;
		
	        int[][] temperaturas = new int[MESES][DIAS];

	        inicializarTemperaturas(temperaturas);
	        mostrarTemperaturas(temperaturas);
	        mostrarMaximasPorMes(temperaturas);
	        mostrarPrimerDiaMenosDe10(temperaturas);
	    }

	    // Método para inicializar las temperaturas aleatoriamente
	    public static void inicializarTemperaturas(int[][] temperaturas) {
	        for (int mes = 0; mes < temperaturas.length; mes++) {
	            for (int dia = 0; dia < temperaturas[mes].length; dia++) {
	                temperaturas[mes][dia] = (int) (Math.random() * 40);
	            }
	        }
	    }

	    // Método para mostrar la tabla completa de temperaturas
	    public static void mostrarTemperaturas(int[][] temperaturas) {
	        System.out.println("=== TEMPERATURAS MENSUALES ===");
	        for (int mes = 0; mes < temperaturas.length; mes++) {
	            System.out.print("Mes " + (mes + 1) + ": ");
	            for (int dia = 0; dia < temperaturas[mes].length; dia++) {
	                System.out.print(temperaturas[mes][dia] + "\t");
	            }
	            System.out.println();
	        }
	    }

	    // Método para mostrar la temperatura máxima de cada mes
	    public static void mostrarMaximasPorMes(int[][] temperaturas) {
	        System.out.println("\n=== TEMPERATURA MÁXIMA POR MES ===");
	        for (int mes = 0; mes < temperaturas.length; mes++) {
	            int maxTemp = temperaturas[mes][0];
	            int diaMax = 0;
	            for (int dia = 1; dia < temperaturas[mes].length; dia++) {
	                if (temperaturas[mes][dia] > maxTemp) {
	                    maxTemp = temperaturas[mes][dia];
	                    diaMax = dia;
	                }
	            }
	            System.out.println("Mes " + (mes + 1) + ": Día " + (diaMax + 1) + " con " + maxTemp + "°C");
	        }
	    }

	    // Método para mostrar el primer día con temperatura menor a 10 grados por mes
	    public static void mostrarPrimerDiaMenosDe10(int[][] temperaturas) {
	        System.out.println("\n=== PRIMER DÍA CON MENOS DE 10°C POR MES ===");
	        for (int mes = 0; mes < temperaturas.length; mes++) {
	            int diaTemp10 = -1;
	            for (int dia = 0; dia < temperaturas[mes].length; dia++) {
	                if (temperaturas[mes][dia] < 10) {
	                    diaTemp10 = dia;
	                    break;
	                }
	            }
	            if (diaTemp10 != -1) {
	                System.out.println("Mes " + (mes + 1) + ": Día " + (diaTemp10 + 1));
	            } else {
	                System.out.println("Mes " + (mes + 1) + ": No hubo días con menos de 10°C");
	            }
	        }
	    }
	}
