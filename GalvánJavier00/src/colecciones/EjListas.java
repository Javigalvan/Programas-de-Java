package colecciones;

import java.util.ArrayList;
import java.util.List;


public class EjListas {
	public static void main(String[] args) {
	
	int numero = (int)(Math.random() * 21) + 50;
	
	List<Integer> lista1=new ArrayList<Integer>(numero);
	
	for (int i=0;i<numero;i++) {
		int num =((int)(Math.random() * 100));
		lista1.add(num);
	}
	System.out.println(lista1);

	try {
		lista1.add(2, numero);
	} catch (IndexOutOfBoundsException ex1 ) {
		
	}
	System.out.println(lista1);
	
	
	
	
}
}
