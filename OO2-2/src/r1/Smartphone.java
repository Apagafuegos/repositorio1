package r1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Smartphone {

	private String imei;
	private String marca;
	private String modelo;
	private BigDecimal precio;
	private Integer añoFabricacion;
	private Boolean activo;

	public Smartphone() {
		this.activo = true;
		this.precio = BigDecimal.ZERO;
	}

	public Smartphone(String imei) {
		this();
		this.imei = imei;
	}

	public Smartphone(String imei, String marca, String modelo) {
		this(imei);
		this.marca = marca;
		this.modelo = modelo;
	}

	public void activar() {
		if (!activo)
			this.activo = true;
	}

	public void desactivar() {
		if (activo)
			this.activo = false;
	}

	public Integer getEdad() {
		return (añoFabricacion - 2000);
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public void cambiarMarcaModelo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public void establecerFabricacion(Integer año) {
		añoFabricacion = año;
	}

	public BigDecimal getPrecioIva() {
		return (precio.add(precio.multiply(new BigDecimal(0.21)))).setScale(2, RoundingMode.HALF_EVEN);
	}

	public Boolean isAltaGama(BigDecimal precio) {
		return !(precio.compareTo(this.precio) < 0);
	}

	public Boolean isDatosCompletos() {
		return !(this.imei.isEmpty() || this.imei.indexOf(" ") != -1 || precio == null);
	}

	public Boolean isGratis() {
		if (precio.compareTo(BigDecimal.ZERO) == 0)
			return true;
		else
			return false;
	}
	
	public void rebajar() {
		precio = precio.subtract(BigDecimal.TEN);
	}

	@Override
	public String toString() {
		if(activo)
			return marca + " (" + modelo + ")";
		else {
			return marca + " (" + modelo + ") - INACTIVO";
		}
	}
	
	

}
