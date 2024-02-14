package ej47;

import java.math.BigDecimal;

public abstract class Articulo {

	protected BigDecimal precio;
	protected String descripcion;
	
	public Articulo(BigDecimal precio, String descripcion) {
		this.precio = precio;
		this.descripcion = descripcion;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public abstract String toString();

}
