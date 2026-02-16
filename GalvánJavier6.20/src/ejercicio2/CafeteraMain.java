package ejercicio2;

public class CafeteraMain {

	public static void main(String[] args) {
		
		Cafetera c1 = new Cafetera();
		
		try {
            c1.llenarCafetera(250);

            while (true) {
                c1.servirTaza(50);
                System.out.println("Taza servida, cafe restante: " + c1.getCantidadActual());
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
       }
		
		Cafetera c2 = new Cafetera(1000);
		
		 for (int i = 1; i <= 50; i++) {
			 try {
				  c2.servirTaza(50);
	              System.out.println("cafe " + i + " servido, queda: " + c2.getCantidadActual());
	            } catch (Exception e) {
	              System.out.println("Cafetera vacia, se rellena");
	              c2.vaciarCafetera();
	              c2.setCantidadActual(c2.getCapacidadMaxima());
	              i--;
	        }
     }

}

}
