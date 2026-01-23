package ejercicioA3;

public class RectanguloMain {

	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.x1 = 0;
		r1.y1 = 0;
		r1.x2 = 5;
		r1.y2 = 5;
		
		r2.x1 = 7;
		r2.y1 = 9;
		r2.x2 = 2;
		r2.y2 = 3;
		
		int ancho1 = Math.abs(r1.x2 - r1.x1);
        int alto1 = Math.abs(r1.y2 - r1.y1);
        int area1 = ancho1 * alto1;
        int perimetro1 = 2 * (ancho1 + alto1);
        
        int ancho2 = Math.abs(r2.x2 - r1.x1);
        int alto2 = Math.abs(r2.y2 - r2.y1);
        int area2 = ancho2 * alto2;
        int perimetro2 = 2 * (ancho2 + alto2);
		
		System.out.println("Rectangulo 1:  (" + r1.x1 + "," + r1.y1 + ") (" + r1.x2 + "," + r1.y2 + ") - Area: " + area1 + " - Perimetro: " + perimetro1);
		System.out.println("Rectangulo 2:  (" + r2.x1 + "," + r2.y1 + ") (" + r2.x2 + "," + r2.y2 + ") - Area: " + area2 + " - Perimetro: " + perimetro2);
		
		

	}



}
