package ej47;

import java.math.BigDecimal;

public class Ropa extends Articulo {

	protected String talla;
	protected String color;
	
	public Ropa(BigDecimal precio, String talla, String descripcion, String color) {
		super(precio, descripcion);
		this.talla = talla;
		this.color = color;		
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return precio + ", " + talla + ", " + descripcion + ", " + color;
	}

}
