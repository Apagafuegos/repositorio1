package r5;

import java.util.Objects;

public abstract class Publicacion {

	protected String codigo;
	protected String autor;
	protected String titulo;
	protected Integer añoPublicacion;

	public Publicacion(String codigo, String autor, String titulo, Integer año) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		añoPublicacion = año;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(Integer añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
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
		Publicacion other = (Publicacion) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public abstract String toString();
	
}
