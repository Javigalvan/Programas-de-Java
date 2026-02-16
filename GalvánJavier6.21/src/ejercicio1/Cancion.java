package ejercicio1;

public class Cancion {
	
	public static final  String TITULO_DEFAULT = "Sin Titulo";
	public static final  String AUTOR_DEFAULT = "Sin Autor";
	
	private String titulo;
	private String autor;
	
	
public Cancion (String titulo, String autor) throws IllegalArgumentException {
		
	if (titulo == null || titulo.isEmpty()) {
        throw new IllegalArgumentException("El titulo no puede estar vacio");
    }
	if (autor == null || autor.isEmpty()) {
        throw new IllegalArgumentException("El autor no puede estar vacio");
    }
		
	this.titulo = titulo;
	this.autor = autor;
		
}

public Cancion () {
	
	this(TITULO_DEFAULT, AUTOR_DEFAULT);
}

public String dameTitulo() {
	return titulo;
}
public String dameAutor() {
	return autor;
}
public void ponTitulo(String titulo) {
    if (titulo == null || titulo.isEmpty()) {
        throw new IllegalArgumentException("El titulo no puede estar vacio");
    }
    this.titulo = titulo;
}

public void ponAutor(String autor) {
    if (autor == null || autor.isEmpty()) {
        throw new IllegalArgumentException("El autor no puede estar vacio");
    }
    this.autor = autor;
}

@Override
public String toString() {
	return "Cancion Titulo: " + titulo + ", Autor: " + autor;
}
public Cancion clonar() {
    return new Cancion(this.titulo, this.autor);
}


}
