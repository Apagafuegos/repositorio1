package ej54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Cargo extends Movimiento {

	private String cif;

	public Cargo(LocalDate fecha, BigDecimal importe, String cif) {
		super(fecha, importe);
		this.cif = cif;
	}

	@Override
	public String toString() {
		return "[C - " + fecha + " - " + formato.format(importe.setScale(2, RoundingMode.HALF_EVEN)) + " - " + cif + "]";
	}

	@Override
	public BigDecimal getImporte() {
		return importe.negate().setScale(2, RoundingMode.HALF_EVEN);
	}

	@Override
	public String getTipo() {
		return "CARGO";
	}

}
