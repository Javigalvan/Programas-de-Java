package herenciaEmpresaAgroalimentaria;

import java.time.LocalDate;

abstract class Productos {
	
	private static int contador = 1;
	
	protected String codigoProducto;
	protected String nombre;
	protected LocalDate fechaCaducidad;
	protected int numLote;


protected Productos (int codigoProducto, String nombre, LocalDate fechaCaducidad, int numLote) throws IllegalArgumentException {
	
	if (nombre.isEmpty() || nombre == null) {
        throw new IllegalArgumentException("nombre no valido");
    }
	if (fechaCaducidad.isBefore(LocalDate.now()) || fechaCaducidad == null) {
        throw new IllegalArgumentException("Fecha de caducidad no valida");
    }
	if (numLote < 0) {
		throw new IllegalArgumentException("Numero de lote no valido");
	}
	
	this.codigoProducto = generarCodigo();
	this.nombre = nombre;
	this.fechaCaducidad = fechaCaducidad;
	this.numLote = numLote;

}
protected String generarCodigo() {
	 String codigo = String.format("%04d", contador++);
	 contador++;
	 return codigo;
}
	
	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public int getNumLote() {
		return numLote;
	}

	public void setNumLote(int numLote) {
		this.numLote = numLote;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public LocalDate getFechaCaducidad() {
	    return fechaCaducidad;
	}

	@Override
	public String toString() {
	    return "Código: " + codigoProducto + ", Nombre: " + nombre + ", Caducidad: " + fechaCaducidad + ", Lote: " + numLote;

}

}
