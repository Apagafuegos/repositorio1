package ej53;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Hucha {
	
	private BigDecimal importe;
	private DecimalFormat formato = new DecimalFormat("#,##0.00€");
	
	public Hucha() {
		this.importe = BigDecimal.ZERO;
	}
	
	public BigDecimal meterDinero(BigDecimal intr) {
		importe = importe.add(intr);
		return importe;
	}
	
	public BigDecimal contarDinero() {
		return importe;
	}
	
	public BigDecimal sacarDinero (BigDecimal sac) {
		if(sac.compareTo(importe) > 0) {
			BigDecimal aux = importe;
			importe = BigDecimal.ZERO;
			return aux;
		}else {
			importe = importe.subtract(sac);
			return sac;
		}
	}
	
	public BigDecimal romperHucha() {
		return sacarDinero(importe);
	}

	@Override
	public String toString() {
		return "En la hucha hay " + formato.format(importe);
	}
	
	

}
