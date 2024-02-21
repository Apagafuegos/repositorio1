package r4;

import java.time.LocalDate;

public abstract class Libro {

	protected String titulo;
	protected String autor;
	protected LocalDate fechaEdicion;
	protected Integer paginas;
	
	public abstract String getTipo();
	
	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public Libro(String titulo, String autor, LocalDate fecha, Integer paginas) {
		this.titulo = titulo;
		this.autor = autor;
		fechaEdicion = fecha;
		this.paginas = paginas;
	}
	
	public abstract Integer getPeso();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDate getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(LocalDate fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	@Override
	public String toString() {
		return "Libro [" +  titulo + ", " + autor + " es " + this.getTipo() + "]";
	}
	
	

}
