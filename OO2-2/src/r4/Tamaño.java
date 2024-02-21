package r4;

import java.math.BigDecimal;

public class Tamaño {

	private BigDecimal ancho;
	private BigDecimal alto;

	public Tamaño(BigDecimal alto, BigDecimal ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	public BigDecimal getTamaño() {
		return alto.multiply(ancho);
	}

	public void setTamaño(BigDecimal alto, BigDecimal ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

}
