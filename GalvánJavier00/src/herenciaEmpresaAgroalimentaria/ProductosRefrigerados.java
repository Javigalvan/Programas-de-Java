package herenciaEmpresaAgroalimentaria;

import java.time.LocalDate;

public class ProductosRefrigerados extends Productos{
	
	private int codigoOrganismo;
	private int temperaturaMinima;
	private LocalDate fechaConsumo;


public ProductosRefrigerados(int codigoProducto, String nombre, LocalDate fechaCaducidad, int numLote) {
	super(codigoProducto, nombre, fechaCaducidad, numLote);
	
	this.codigoOrganismo = codigoOrganismo;
	this.temperaturaMinima = temperaturaMinima;
	this.fechaConsumo = fechaConsumo;

 }


public int getCodigoOrganismo() {
	return codigoOrganismo;
}


public void setCodigoOrganismo(int codigoOrganismo) {
	this.codigoOrganismo = codigoOrganismo;
}


public int getTemperaturaMinima() {
	return temperaturaMinima;
}


public void setTemperaturaMinima(int temperaturaMinima) {
	this.temperaturaMinima = temperaturaMinima;
}


public LocalDate getFechaConsumo() {
	return fechaConsumo;
}


public void setFechaConsumo(LocalDate fechaConsumo) {
	this.fechaConsumo = fechaConsumo;
}


@Override
public String toString() {
	String cadena = super.toString();
	return cadena + " codigoOrganismo : " + codigoOrganismo + ", temperaturaMinima : " + temperaturaMinima + ", fechaConsumo : " + fechaConsumo;
}

}
