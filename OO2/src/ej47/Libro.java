package ej47;

public class Libro extends Articulo {

	public Libro(Integer precio, String descripcion, String autor) {
		super(precio, descripcion);
		this.autor = autor;
	}

	protected String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return precio + ", " +  descripcion + ", " + autor;
	}
	
	
}
