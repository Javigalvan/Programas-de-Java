package OperArrayListEntero;

public class Alumnos {
	private String grupo;
    private String nombre;
    private int matematicas;
    private int lengua;
    private int fisica;
    private int quimica;
    private int ingles;

    public Alumnos(String grupo, String nombre, int matematicas, int lengua, int fisica, int quimica, int ingles) {
        this.grupo = grupo;
        this.nombre = nombre;
        this.matematicas = matematicas;
        this.lengua = lengua;
        this.fisica = fisica;
        this.quimica = quimica;
        this.ingles = ingles;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return grupo + ";" + nombre + ";" + matematicas + ";" + lengua + ";" +
                fisica + ";" + quimica + ";" + ingles;
    }

	public int getMatematicas() {
		return matematicas;
	}

	public double getLengua() {
		// TODO Auto-generated method stub
		return lengua;
	}

	public double getFisica() {
		// TODO Auto-generated method stub
		return fisica;
	}

	public double getIngles() {
		// TODO Auto-generated method stub
		return ingles;
	}

}
