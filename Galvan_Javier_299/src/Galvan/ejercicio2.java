package Galvan;

public class ejercicio2 {
	

	public static void main(String[] args) {
		
		
		 int[][] numeros = new int[2][20];
		
		
		 for (int i = 0; i < 2; i++) {
	        	for (int j = 0; j < 20; j++) {
	        	   numeros[i][j] = (int)(Math.random()*50); // Declaramos las variables con los numeros random
	        	   System.out.print(numeros[i][j] +  "\t"); 
	        }
	        	 System.out.println(); 
		 }
		
		 int contador;
		 int media = 0;
		 int par=0;
		 int impar;
		 
		 
		 for (int i = 0; i < 2; i++) {
	        	for (int j = 0; j < 20; j++) {
	        	 contador = j + 2;      	 
	        	 par++;
	        	 media = contador / 11;	        	 
	        }	        	
		 }
		 System.out.println(media);
		 for (int i = 0; i < 2; i++) {
	        	for (int j = 0; j < 20; j++) {
	        		contador = j + 2;
	        		impar = numeros[0][j];;
	        		if (impar < media) {
	        			
	        		}
	        }	
	        System.out.println(media);
	        	
		 }
	}

}
