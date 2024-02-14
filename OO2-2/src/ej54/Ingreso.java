package ej54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Ingreso extends Movimiento{

	private String descripcion;
	
	public Ingreso(LocalDate fecha, BigDecimal importe, String descripcion) {
		super(fecha, importe);
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "[I - " + fecha + " - " + formato.format(importe.setScale(2, RoundingMode.HALF_EVEN)) + " - " + descripcion + "]"; 
	}
	
	@Override
	public BigDecimal getImporte() {
		return importe.setScale(2, RoundingMode.HALF_EVEN);
	}

	@Override
	public String getTipo() {
		return "INGRESO";
	}

}
