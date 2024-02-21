package r5;

public class Libro extends Publicacion implements Prestable, Consultable {

	private Boolean prestado;
	private Boolean consultado;

	public Libro(String codigo, String autor, String titulo, Integer año) {
		super(codigo, autor, titulo, año);
		consultado = false;
		prestado = false;
	}

	@Override
	public void prestar() {
		if (!consultado)
			prestado = true;
		else
			System.err.println("El libro está siendo consultado, no se puede prestar en este momento");
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
	public void retirarParaConsulta() {
		if (!prestado)
			consultado = true;
		else
			System.err.println("El libro está prestado, no se puede consultar en este momento");
	}

	@Override
	public void terminarConsulta() {
		consultado = false;
	}

	@Override
	public Boolean estaConsultado() {
		return consultado;
	}

	@Override
	public String toString() {
		return "(" + titulo + ", " + codigo + ", " + autor + ", " + añoPublicacion + ", Prestado: " + prestado + ", Consultado: " + consultado + ")";
	}
	
	

}
