package r2;

import java.math.BigDecimal;

public class Movil extends Telefono {

	private LocalizacionGPS gps;

	public Movil(Integer numero, BigDecimal latitud, BigDecimal longitud) {
		super(numero);
		this.gps = new LocalizacionGPS(latitud, longitud);
	}

}
