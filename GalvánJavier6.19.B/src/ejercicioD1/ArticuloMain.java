package ejercicioD1;


public class ArticuloMain {

	public static void main(String[] args) {
		
		Articulo producto = new Articulo(1.21,"Camiseta", 20, 5);
		
		double pvp = producto.precio * producto.iva;
		
		
		System.out.println(producto.nombre + " -  Precio: " + producto.precio + " -  IVA: " + producto.iva + " -  PVP: " + pvp );

	}

}
