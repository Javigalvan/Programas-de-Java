package ejercicio1;

public class LineaMain {

	public static void main(String[] args) {
		
			Linea l1 = new Linea();
		
			System.out.println(l1.escribirLinea());
		
		 	l1.setPuntoA(new Punto(5, 5));
	        l1.setPuntoB(new Punto(6, 6));
	        System.out.println("l1 con setters: ");
	        System.out.print(l1.escribirLinea());
	        
	        
			Punto p1 = new Punto(1, 2);
		 	Punto p2 = new Punto(3, 4);
	        Linea linea2 = new Linea(p1, p2);
	        System.out.println("Línea2: ");
	        System.out.print(linea2.escribirLinea());

	        linea2.mueveDerecha(2);
	        System.out.println("Linea2 moviendo 2 a la derecha: ");
	        System.out.print(linea2.escribirLinea());

	        linea2.mueveArriba(3);
	        System.out.println("Linea2 moviendo 3 a arriba: ");
	        System.out.print(linea2.escribirLinea());

	        linea2.mueveIzquierda(1);
	        System.out.println("Linea2 moviendo 1 a la izquierda: ");
	        System.out.print(linea2.escribirLinea());

	        linea2.mueveAbajo(4);
	        System.out.println("Linea2 moviendo 2 a abajo: ");
	        System.out.print(linea2.escribirLinea());

	       
		
		
	}

}
