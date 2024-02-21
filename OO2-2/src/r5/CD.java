package r5;

public class CD extends Publicacion implements Prestable{
	
	private Boolean prestado;

	public CD(String codigo, String autor, String titulo, Integer año) {
		super(codigo, autor, titulo, año);
		this.prestado = false;
	}
	
	@Override
	public void prestar() {
		prestado = true;		
	}

	@Override
	public void devolver() {
		prestado = false;
		
	}

	@Override
	public Boolean estaPrestado() {
		return prestado;
	}

	@Override
	public String toString() {
		return "(" + titulo + ", " + codigo + ", " + autor + ", " + añoPublicacion + ", Prestado: " + prestado + ")";
	}

}
