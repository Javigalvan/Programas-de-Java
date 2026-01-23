package claseBombilla;

public class Bombilla {
	
	public static final boolean ESTADO_INICIAL = false;
	
	private static int bombillasCreadas;
	private static int bombillasEncendidas;
	
	private boolean estadoBombilla;
	private int NumVecesEncendida;
	


public Bombilla (boolean estadoInicial) {
	
	this.estadoBombilla = estadoInicial;
	this.NumVecesEncendida = 0;
	if (estadoInicial) {
	    this.NumVecesEncendida = 1;
	}
	else {
	    this.NumVecesEncendida = 0;
	};
	
	Bombilla.bombillasCreadas++;
	Bombilla.bombillasEncendidas = 0;
	
	if (estadoInicial) {
	    this.NumVecesEncendida = 1;
	}
	else {
	    this.NumVecesEncendida = 0;
	};
}
public Bombilla () {

	this(ESTADO_INICIAL);

}
public boolean GetEstadoBombilla () {
	
	return this.estadoBombilla;
	
}
public int GetNumVecesEncendida () {
	
	return this.NumVecesEncendida;
	
}
public int GetBombillasCreadas() {
	
	return this.bombillasCreadas;

}
public int GetbombillasEncendidas() {
	
	return this.bombillasEncendidas;

}
public String toString() {
	
    String estado = String.format ("Bombilla %s. Se ha encendido %d %s", this.estadoBombilla ? "encendida" : "apagada", this.NumVecesEncendida,
    		this.NumVecesEncendida == 1 ? "vez" : "veces");

    return estado; 
}

public void encender () throws IllegalStateException {
	
	if (this.estadoBombilla == false) {
		this.estadoBombilla = true;
		this.NumVecesEncendida++;
		Bombilla.bombillasEncendidas++;
	} else {
		throw new IllegalStateException ("Error. La bombilla ya está encendida");
	}
	
}
public void apagar () throws IllegalStateException {
	
	if (this.estadoBombilla == true) {
		this.estadoBombilla = false;
		Bombilla.bombillasEncendidas--;
	} else {
		throw new IllegalStateException ("Error. La bombilla ya está apagada");
	}
	
}
public void conmutar () throws IllegalStateException {
	
	if (this.estadoBombilla == false) {
		encender();
	} else {
		apagar();
		Bombilla.bombillasEncendidas--;
	}
	
}

}
