package r5;

public class Revista extends Publicacion implements Consultable {
	
	private Boolean consultado;

	public Revista(String codigo, String autor, String titulo, Integer año) {
		super(codigo, autor, titulo, año);
		consultado = false;
	}

	@Override
	public void retirarParaConsulta() {
		consultado = true;		
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
		return "(" + titulo + ", " + codigo + ", " + autor + ", " + añoPublicacion + ", Consultado: "+ consultado + ")";
	}

}
