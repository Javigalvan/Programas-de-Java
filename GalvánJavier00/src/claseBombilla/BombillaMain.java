package claseBombilla;

public class BombillaMain {

	public static void main(String[] args) {
		
		Bombilla b1 = new Bombilla();
		
		 
		 System.out.println("Estado de la Bombilla: " + b1.GetEstadoBombilla());	
		 System.out.println("Numero de veces encendida: " +b1.GetNumVecesEncendida());	
		 System.out.println("Bombillas Creadas total: " +b1.GetBombillasCreadas());
		 System.out.println("Bombillas encendidas total: " +b1.GetbombillasEncendidas());	
		 	 		 
		 
		 b1.encender();	
		 System.out.println(b1.toString());			 
		 b1.apagar();		 
		 System.out.println(b1.toString());	
		 b1.conmutar();	 
		 System.out.println(b1.toString());	
		 
	}

}
