package ej54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Retirada extends Movimiento {

	public Retirada(LocalDate fecha, BigDecimal importe) {
		super(fecha, importe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[R - " + fecha + " - " + formato.format(importe.setScale(2, RoundingMode.HALF_EVEN)) + "]";
	}
	
	@Override
	public BigDecimal getImporte() {
		return importe.negate().setScale(2, RoundingMode.HALF_EVEN);
	}

	@Override
	public String getTipo() {
		return "RETIRADA";
	}

}
