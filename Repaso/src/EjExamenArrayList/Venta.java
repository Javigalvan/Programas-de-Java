package EjExamenArrayList;

public class Venta {
	
	private String mes;
	private int cochesVendidos;
	   
	public Venta(String mes, int cochesVendidos) {
	       this.mes = mes;
	       this.cochesVendidos = cochesVendidos;
	}
	public String getMes() {
		return mes;
	   }
	   
	public int getCochesVendidos() {
	       return cochesVendidos;
	   }
	
	@Override 
	public String toString() {
	       return mes + ": " + cochesVendidos + " coches";
	   }
}

