package mobiliario;

public class Sofa extends Asiento {
	
	private String composicion;

    public Sofa(double precio, String descripcion, String tapiceria, String color, String composicion) {
        super(precio, descripcion, Asiento.MIN_PLAZAS, tapiceria, color);
        this.composicion = composicion;
    }

    public String getComposicion() {
        return composicion;
    }

    @Override
    public String toString() {
    	return super.toString() + ", composicion = " + composicion;
    }
    
}
