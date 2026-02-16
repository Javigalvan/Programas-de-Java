package ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		Humano humano1 = new Humano();
		Humano humano2 = new Humano("Josema", "Julay");
		Humano humano3 = new Humano("Joaquin", "Rico");
		
		Ciudadano ciudadado1 = new Ciudadano("Pablo", "Grippi", "Documento1");
		Ciudadano ciudadado2 = new Ciudadano("Izan", "Mateo", "Documento2");
		
		System.out.println(humano1.getNombreCompleto());
		System.out.println(humano2.getNombreCompleto());
		System.out.println(humano3.getNombreCompleto());
		
		System.out.println(ciudadado1.GetDocumento());
		System.out.println(ciudadado2.GetDocumento());
		
		
		

	}

}
