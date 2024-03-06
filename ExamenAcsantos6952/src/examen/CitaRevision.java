package examen;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CitaRevision extends Cita implements InterfazFactura {

	private Integer numRevision;
	
	public CitaRevision(String nombre) {
		super(nombre);
		numRevision = 0;
	}

	public CitaRevision(LocalDate fecha, Integer hora, String nombre, Boolean seguroMedico) {
		super(fecha, hora, nombre, seguroMedico);
		numRevision = 0;
	}

	@Override
	public BigDecimal getImporteFactura() {
		return new BigDecimal(50).add(BigDecimal.TEN.multiply(new BigDecimal(numRevision)));
	}

	public void setNumRevision(Integer numRevision) {
		this.numRevision = numRevision;
	}

	public Integer getNumRevision() {
		return numRevision;
	}
	
}
