package r4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class LibroFisico extends Libro {

	private Tamaño tamaño;
	private Integer peso;

	public LibroFisico(String titulo, String autor, LocalDate fecha, Integer paginas, BigDecimal ancho, BigDecimal alto,
			Integer peso) {
		super(titulo, autor, fecha, paginas);
		this.peso = peso;
		this.tamaño = new Tamaño(alto,ancho);
	}

	public Integer getPeso() {
		return peso;
	}

	public void setPeso(Integer peso) {
		this.peso = peso;
	}

	@Override
	public String getTipo() {
		return "Físico";
	}
	
	public BigDecimal getTamaño() {
		return this.tamaño.getTamaño();
	}

}
