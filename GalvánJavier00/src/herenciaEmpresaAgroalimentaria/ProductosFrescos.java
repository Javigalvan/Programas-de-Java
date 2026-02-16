package herenciaEmpresaAgroalimentaria;

import java.time.LocalDate;

public class ProductosFrescos extends Productos{
	
	private LocalDate fechaEnvasado;
	private String paisOrigen;


public ProductosFrescos(int codigoProducto, String nombre, LocalDate fechaCaducidad, int numLote) {
	super(codigoProducto, nombre, fechaCaducidad, numLote);
	
	this.fechaEnvasado = fechaEnvasado;
	this.paisOrigen = paisOrigen;

 }


public LocalDate getFechaEnvasado() {
	return fechaEnvasado;
}


public void setFechaEnvasado(LocalDate fechaEnvasado) {
	this.fechaEnvasado = fechaEnvasado;
}


public String getPaisOrigen() {
	return paisOrigen;
}


public void setPaisOrigen(String paisOrigen) {
	this.paisOrigen = paisOrigen;
}


@Override
public String toString() {
	String cadena = super.toString();
	return  cadena + " fechaEnvasado : " + fechaEnvasado + ", paisOrigen : " + paisOrigen ;
}

}
