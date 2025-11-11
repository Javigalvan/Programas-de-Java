package operadoresBasicos;

public class ConversionTipos {

	public static void main(String[] args) {
		
		byte monederoPequenyo = 10;
		int monederoMediano = 10000;
		long monederoGrande = 1000000001;
		
		//monederoGrande = monederoMediano;
		//monederoMediano = monederoPequenyo;
		
		monederoPequenyo =  (byte) monederoMediano;
		
		System.out.println("Monedero pequeño: " + monederoPequenyo);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero grande: " + monederoGrande);
	}

}
