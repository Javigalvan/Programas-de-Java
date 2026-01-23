package ejercicios2_25;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int dinero;
		System.out.println("Dinero: ");
		dinero = entrada.nextInt();
		
		int billete=500;
		
		do {
			int cantidadBilletes = dinero / billete;
			
			if (cantidadBilletes > 0) {
		        System.out.println(cantidadBilletes +" de "+ billete );
		        dinero = dinero % billete;
		    }

		    if (billete == 500) {
		    	billete = 200;
		    }
		    else if (billete == 200) {
		    	billete = 100;
		    }
		    else if (billete == 100) {
		    	billete = 50;
		    }
		    else if (billete == 50) {
		    	billete = 20;
		    }
		    else if (billete == 20) {
		    	billete = 10;
		    }
		    else if (billete == 10) {
		    	billete = 5;
		    }
 
		    
			
		} while (billete >= 5);

	}

}
