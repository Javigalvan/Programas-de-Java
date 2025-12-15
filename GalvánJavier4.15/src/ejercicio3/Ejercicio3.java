package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		System.out.println(indicaMesDias(12));

	}
	
	public static String indicaMesDias (int mes) {
		String[] nombresMes = {
		        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
		        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
		    };
		
		int[] diasMes = {
		        31, 28, 31, 30, 31, 30,
		        31, 31, 30, 31, 30, 31
		    };
		
		if (mes < 1 || mes > 12) {
	        return "Mes incorrecto";
	    }
		
		return nombresMes[mes - 1] + ", " + diasMes[mes - 1];
	}
		
}
