package operadoresBasicos;

public class EjEnumeradores {
	
	enum Estaciones { PRIMAVERA, VERANO, OTOÑO, INVIERNO }

	public static void main(String[] args) {
		
		Estaciones EstacionActual = Estaciones.OTOÑO ;
		Estaciones EstacionSiguiente = Estaciones.INVIERNO ;
		Estaciones EstacionPasada = Estaciones.VERANO ;
		Estaciones EstacionProxima = Estaciones.PRIMAVERA ;
	
		
		double metros = 0.5 ;
		double decimetros = metros * 10;
		double centimetros = decimetros * 10;
		double milimetros = centimetros * 10;
		
		System.out.println(metros);
		System.out.println(decimetros);
		System.out.println(centimetros);
		System.out.println(milimetros);
	}

}
