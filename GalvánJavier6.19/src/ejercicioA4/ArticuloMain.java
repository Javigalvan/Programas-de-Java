package ejercicioA4;

public class ArticuloMain {

	public static void main(String[] args) {
		
		Articulo producto = new Articulo();
		
		producto.nombre = "Camiseta";
		producto.precio = 20;
		producto.cuantosQuedan = 5;
		
		double pvp = producto.precio * producto.iva;
		
		
		System.out.println(producto.nombre + " -  Precio: " + producto.precio + " -  IVA: " + producto.iva + " -  PVP: " + pvp );
	}

}
