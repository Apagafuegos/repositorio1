package clase1;

public class Libro {
	protected String titulo;
	protected Integer numPag;

	public void setTitulo(String nombre) {
		this.titulo = nombre;
	}
	
	public void setNumPag(Integer num) {
		this.numPag = num;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public Integer getNumPag() {
		return this.numPag;
	}
}
