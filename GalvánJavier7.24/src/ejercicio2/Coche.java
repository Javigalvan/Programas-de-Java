package ejercicio2;

import java.time.LocalDate;

public class Coche {
	
	protected String matricula;
	
	protected String nombrePropietario;
	protected LocalDate fechaMatriculacion;
	protected int cilindrada;
	protected int potencia;
	
protected Coche (String matricula, String nombrePropietario, LocalDate fechaMatriculacion, int cilindrada,int potencia)	{
	
	this.matricula = matricula;
	this.nombrePropietario = nombrePropietario;
	this.fechaMatriculacion = fechaMatriculacion;
	this.cilindrada = cilindrada;
	this.potencia = potencia;
	
}
public Coche(int cilindrada, int potencia) {
    this.fechaMatriculacion = LocalDate.now();
    setCilindrada(cilindrada);
    setPotencia(potencia);
}

public Coche() {
    this ("", "",LocalDate.now(), 2000, 150);
    
}

public boolean validarMatricula(String matricula)  {
	if (matricula == null) {
        return false;
    }

    return matricula.matches("\\d{4} [A-Z]{3}");
}
public void setMatricula(String matricula) {
	if (!validarMatricula(matricula)) {
        throw new IllegalArgumentException("Formato de matrícula inválido. Debe ser 9999 AAA");
    }

    this.matricula = matricula;
}
public String getNombrePropietario() {
    return nombrePropietario;
}

public LocalDate getFechaMatriculacion() {
    return fechaMatriculacion;
}
public void setNombrePropietario(String nombrePropietario) {
    if (nombrePropietario == null || nombrePropietario.isEmpty()) {
        throw new IllegalArgumentException("El nombre del propietario no puede ser nulo ni vacío");
    }
    this.nombrePropietario = nombrePropietario;
}

public int getCilindrada() {
    return cilindrada;
}
public void setCilindrada(int cilindrada) {
    if (cilindrada < 0) {
        throw new IllegalArgumentException("La cilindrada no puede ser negativa");
    }
    this.cilindrada = cilindrada;
}

public void setPotencia(int potencia) {
    if (potencia < 0) {
        throw new IllegalArgumentException("La potencia no puede ser negativa");
    }
    this.potencia = potencia;
}

public int getPotencia() {
    return potencia;
}

@Override
public String toString() {
	return "matricula = " + matricula + ", nombrePropietario = " + nombrePropietario + ", fechaMatriculacion = "
			+ fechaMatriculacion + ", cilindrada = " + cilindrada + ", potencia = " + potencia;
}


}
