package mobiliario;

public class Sillon extends Asiento{
	
	public static final int POS_BAJADO = 0;
	public static final int POS_SUBIDO = 1;
	
	protected int numPosicionPies;
	
	

public Sillon(double precio, String descripcion, String tapiceria, String color) {
	super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
	
	this.numPosicionPies = numPosicionPies;
		
}	

@Override
public String toString() {
	return super.toString() + ", numPosicionPies = " + numPosicionPies;
}

}
