package ej54;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaAhorros {

	private String codigo;
	private List<Movimiento> listaMov;
	private BigDecimal total;
	private DecimalFormat formato = new DecimalFormat("#,##0.00€");

	public CuentaAhorros(String codigo) {
		this.codigo = codigo;
		this.listaMov = new ArrayList<>();
		this.total = BigDecimal.ZERO;
	}

	public Boolean validarCuenta() {
		Pattern patron = Pattern.compile("[0-9]{20}");
		Matcher match = patron.matcher(codigo);
		if (match.matches())
			return true;
		else
			return false;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTotal() {
		return formato.format(total.setScale(2, RoundingMode.HALF_EVEN));
	}

	public void addMovimiento(Movimiento mov) {
		listaMov.add(mov);
		total = total.add(mov.getImporte());
	}

	public BigDecimal totalCuenta() {
		BigDecimal aux = BigDecimal.ZERO;
		for (Movimiento movimiento : listaMov) {
			aux = aux.add(movimiento.getImporte());
		}
		return aux.setScale(2, RoundingMode.HALF_UP);
	}

	public String movimientosTotales() {
		return listaMov.toString();
	}

	public String retiradasTotales() {
		String aux = "";
		for (Movimiento mov : listaMov) {
			if (mov instanceof Retirada) {
				aux += mov;
			}
		}

		return aux;
	}

	public String cargosTotales() {
		String aux = "";
		for (Movimiento mov : listaMov) {
			if (mov instanceof Cargo) {
				aux += mov;
			}
		}

		return aux;
	}

	public String ingresosTotales() {
		String aux = "";
		for (Movimiento mov : listaMov) {
			if (mov instanceof Ingreso) {
				aux += mov;
			}
		}

		return aux;
	}

}
