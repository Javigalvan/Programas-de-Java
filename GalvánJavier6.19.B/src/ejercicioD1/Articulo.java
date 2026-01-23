package ejercicioD1;

public class Articulo {

	final double iva = 1.21;
	
	String nombre;
	int precio;
	int cuantosQuedan; 
	

public Articulo(double iva, String nombre, int precio, int cuantosQuedan) throws IllegalArgumentException{
	
   this.nombre = nombre;
   this.precio = precio;
   this.cuantosQuedan = cuantosQuedan;
 }
}