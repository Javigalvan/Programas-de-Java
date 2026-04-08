package ejercicio4;

public class Trabajador {
	
	private String nombre;
	private int edad;
	private String sexo;
	private String estadoCivil;
	private int salarioBase;
	
	
	public Trabajador(String nombre, int edad, String sexo, String estadoCivil, int salarioBase) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.salarioBase = salarioBase;
	}
	


	public String getNombre() {
		return nombre;
	}



	public int getEdad() {
		return edad;
	}



	public String getSexo() {
		return sexo;
	}



	public String getEstadoCivil() {
		return estadoCivil;
	}



	public int getSalarioBase() {
		return salarioBase;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}



	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}



	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil
				+ ", salarioBase=" + salarioBase + "]";
	}



	
	
	

}
