package herenciaEmpresaAgroalimentaria;

import java.time.LocalDate;

public class ProductosCongelados extends Productos{
	
	private int temperaturaCongelacion;
	private LocalDate mesesConservar;


public ProductosCongelados(int codigoProducto, String nombre, LocalDate fechaCaducidad, int numLote) {
	super(codigoProducto, nombre, fechaCaducidad, numLote);
	
	this.temperaturaCongelacion = temperaturaCongelacion;
	this.mesesConservar = mesesConservar;

 }


public int getTemperaturaCongelacion() {
	return temperaturaCongelacion;
}


public void setTemperaturaCongelacion(int temperaturaCongelacion) {
	this.temperaturaCongelacion = temperaturaCongelacion;
}


public LocalDate getMesesConservar() {
	return mesesConservar;
}


public void setMesesConservar(LocalDate mesesConservar) {
	this.mesesConservar = mesesConservar;
}


@Override
public String toString() {
	String cadena = super.toString();
	return cadena + " temperaturaCongelacion : " + temperaturaCongelacion + ", mesesConservar : " + mesesConservar ;
}

}
