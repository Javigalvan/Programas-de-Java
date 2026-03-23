package colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EjColecciones {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

	int numero = (int)(Math.random() * 21) + 50;
	
	Set<Integer> conjunto = new HashSet<>(numero);
	Set<Integer> conjuntoLinked = new LinkedHashSet<>(numero);
	Set<Integer> conjuntoTree = new TreeSet();
	
	
	System.out.println("Insertando " + numero + " numeros");
	
	for (int i=0;i<numero;i++) {
		int num =((int)(Math.random() * 100));
		System.out.println("Insertando: " + num);
		conjunto.add(num);
		conjuntoLinked.add(num);
		conjuntoTree.add(num);
	}
	
	if (!conjunto.add(numero)){
	     System.out.println("No se pudo añadir. El número "+numero+" ya está en la lista.");
	}
	if (!conjuntoLinked.add(numero)) {
        System.out.println("LinkedHashSet: No se pudo añadir " + numero + ". Ya está en el conjunto.");
    }

    if (!conjuntoTree.add(numero)) {
        System.out.println("TreeSet: No se pudo añadir " + numero + ". Ya está en el conjunto.");
    }
	
	System.out.println(conjunto);
	System.out.println(conjuntoLinked);
	System.out.println(conjuntoTree);
	
	
	System.out.print("Introduce un número: ");
    int valor = scanner.nextInt();
    
    if (conjunto.contains(valor)) {
        System.out.println("El número está en el conjunto.");
    } else {
        System.out.println("El número NO está en el conjunto.");
    }
    
    System.out.print("Introduce un número: ");
    int valor2 = scanner.nextInt();
    if (conjunto.remove(valor2)) {
        System.out.println("El número está en el conjunto.");
    } else {
        System.out.println("El número NO está en el conjunto.");
    }
    
    System.out.println(conjunto.toString());
    
    
    System.out.println("Hay " + conjunto.size() + " numeros");
    
    
    Set<Integer> conjunto2 = new HashSet<>(10);
    
    for (int i=0;i<10;i++) {
		conjunto2.add((int)(Math.random() * 100));
	}
    
    System.out.println("Hay " + conjunto2.size() + " numeros");
    try {
    	conjunto.addAll(conjunto2);
    } catch(NullPointerException ex1) {
    	
    } catch(Exception e) {
    	
    }
	System.out.println("Hay " + conjunto.size() + " numeros");
	
	
	try {
    	conjunto.retainAll(conjunto2);
    } catch(NullPointerException ex1) {
    	
    } catch(Exception e) {
    	
    }
	
	
	System.out.println("Suma pares:" + sumaPares(conjunto));
	System.out.println("Suma pares:" + sumaImpares(conjunto));

	
	
	Set<Integer> conjunto3 = new LinkedHashSet<>(numero);
	
	for (int i=0;i<numero;i++) {
		conjunto3.add((int)(Math.random() * 100));
	}
	
	for (Integer i : conjunto3){
	    System.out.println(i);
	}
	System.out.println(conjunto3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}    
	
public static int sumaPares(Set<Integer> conjunto) {
	int sumaPares = 0;

    for (int i : conjunto) {
         if (i % 2 == 0) {
             sumaPares += i;
        }
}
    return sumaPares;  

}
public static int sumaImpares (Set<Integer> conjunto) {
	int sumaImpares = 0;

    for (int i : conjunto) {
         if (i % 2 != 0) {
             sumaImpares += i;
         }
    }
    return sumaImpares; 
}









}