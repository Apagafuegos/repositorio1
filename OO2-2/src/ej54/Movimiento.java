package ej54;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class Movimiento {
	
	protected LocalDate fecha;
	protected BigDecimal importe;
	protected DecimalFormat formato = new DecimalFormat("#,##0.00€");
	
	public Movimiento(LocalDate fecha, BigDecimal importe) {
		this.fecha = fecha;
		this.importe = importe;
	}
	
	public abstract String toString();
	
	public abstract BigDecimal getImporte();
	
	public abstract String getTipo();
}
