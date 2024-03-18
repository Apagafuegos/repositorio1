package ej55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.w3c.dom.Notation;

public class Evaluacion {

	private Map<String, BigDecimal> notas;

	public Evaluacion() {
		notas = new HashMap<>();
	}

	public Boolean addNota(String dni, BigDecimal nota) {
		if (!notas.containsKey(dni)) {
			notas.put(dni, nota);
			return true;
		}
		return false;
	}

	public Boolean corregirNota(String dni, BigDecimal nota) {
		if (notas.get(dni) != null) {
			notas.replace(dni, nota);
			return true;
		}

		return false;
	}

	public BigDecimal obtenerNotaAlumno(String dni) {
		if (notas.containsKey(dni))
			return notas.get(dni);
		else
			return BigDecimal.ZERO;
	}

	public BigDecimal obtenerNotaMedia() {
		/*BigDecimal aux = BigDecimal.ZERO;
		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
			BigDecimal val = entry.getValue();
			aux = aux.add(val);
		}*/
		BigDecimal notaTotal;
		notaTotal = notas.values().stream().reduce((a,b) -> a.add(b)).get();
		
		//return aux.divide(new BigDecimal(notas.size())).setScale(2, RoundingMode.HALF_DOWN);
		return notaTotal.divide(new BigDecimal(notas.size())).setScale(2, RoundingMode.HALF_DOWN);
	}

	public Integer obtenerCantidadAprobados() {
		int cant = (int) notas.values().stream().filter(e -> e.compareTo(new BigDecimal(5)) >= 0).count();
		return cant;
	}

	public List<String> obtenerSuspensos() {
		List<String> listaSuspensos = new ArrayList<>();
		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
			String key = entry.getKey();
			BigDecimal val = entry.getValue();
			if (val.compareTo(new BigDecimal(5)) < 0) {
				listaSuspensos.add(key);
			}
		}

		return listaSuspensos;
	}

	public void borrarAprobados() {
		for (Iterator<BigDecimal> iterator = notas.values().iterator(); iterator.hasNext();) {
			BigDecimal nota = (BigDecimal) iterator.next();
			if (nota.compareTo(new BigDecimal(5)) > 0) {
				iterator.remove();
			}
		}
	}
	
	@Override
	public String toString() {
		String aux = "Aprobados:\n";
		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
			String key = entry.getKey();
			BigDecimal val = entry.getValue();
			if (val.compareTo(new BigDecimal(5)) > 0) {
				aux += "\t" + key + " (" + val.setScale(2, RoundingMode.HALF_DOWN) + ")" + "\n";
			}			
		}
		aux += "Suspensos:\n"; 
		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
			String key = entry.getKey();
			BigDecimal val = entry.getValue();
			if (val.compareTo(new BigDecimal(5)) < 0) {
				aux += "\t" + key + " (" + val.setScale(2, RoundingMode.HALF_DOWN) + ")" + "\n";
			}			
		}
		
		return aux;
	}

}
