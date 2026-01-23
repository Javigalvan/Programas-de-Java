package claseDado;

public class DadoMain {

	public static void main(String[] args) {
		
		Dado dado1 = new Dado();
		
		System.out.println("Numero Caras: " + dado1.GetNumeroCaras());	
		System.out.println("Numero Lanzamientos: " + dado1.GetNumeroLanzamientos());
		
		
		System.out.println(dado1.lanzar());
		System.out.println(dado1.lanzar());
		System.out.println(dado1.lanzar());
		System.out.println(dado1.lanzar());
		System.out.println(dado1.lanzar());
		System.out.println(dado1.ToString());
		
		System.out.println(dado1.getNumeroVecesCara(1));
		System.out.println(dado1.getNumeroVecesCara(2));
		System.out.println(dado1.getNumeroVecesCara(3));
		System.out.println(dado1.getNumeroVecesCara(4));
		
		
	}

}
