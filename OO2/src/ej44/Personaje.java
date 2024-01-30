package ej44;

import java.util.Objects;

public abstract class Personaje {
	protected Integer puntosVida;
	protected String nombre;
	protected String codigo;
	protected Integer daño;
	protected Integer tiempoDaño;

	public Personaje(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personaje other = (Personaje) obj;
		return Objects.equals(codigo, other.codigo);
	}
	
	public String getDaño() {
		return nombre + " hace " + daño + " de daño en " + tiempoDaño + " segundo(s).";
	}
	
	public Integer getPuntosVida() {
		return puntosVida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "[" + nombre + ", " + codigo + ", " + puntosVida + "]" ;
	}

}
