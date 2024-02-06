package ej47;

public abstract class Articulo {

	protected Integer precio;
	protected String descripcion;
	
	public Articulo(Integer precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public Integer getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public abstract String toString();

}
