package ej55;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
//import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
		return (int) notas.values().stream().filter(e -> e.compareTo(new BigDecimal(5)) >= 0).count();
	}

	public List<String> obtenerSuspensos() {
//		List<String> listaSuspensos = new ArrayList<>();
//		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
//			String key = entry.getKey();
//			BigDecimal val = entry.getValue();
//			if (val.compareTo(new BigDecimal(5)) < 0) {
//				listaSuspensos.add(key);
//			}
//		}
		
//		notas.entrySet().stream().forEach((p) -> {
//			if(p.getValue().compareTo(new BigDecimal(5)) < 0) {
//				listaSuspensos.add(p.getKey());
//			}
//		});
		return notas.keySet().stream().filter(e -> !this.isAprobado(notas.get(e))).toList();
	}

	public void borrarAprobados() {
//		for (Iterator<BigDecimal> iterator = notas.values().iterator(); iterator.hasNext();) {
//			BigDecimal nota = (BigDecimal) iterator.next();
//			if (nota.compareTo(new BigDecimal(5)) > 0) {
//				iterator.remove();
//			}
//		}
		
		notas.values().removeIf(e -> e.compareTo(new BigDecimal(5)) < 0);
		
//		notas.keySet().stream().filter(e -> notas.get(e).compareTo(new BigDecimal(5)) >= 5).forEach(i -> {
//			notas.remove(i);
//		});
	}
	
	@Override
	public String toString() {
		StringBuilder aux = new StringBuilder("Aprobados:\n");
//		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
//			String key = entry.getKey();
//			BigDecimal val = entry.getValue();
//			if (val.compareTo(new BigDecimal(5)) > 0) {
//				aux += "\t" + key + " (" + val.setScale(2, RoundingMode.HALF_DOWN) + ")\n";
//			}			
//		}
		
		notas.keySet().stream().filter(e -> this.isAprobado(notas.get(e))).forEach((e) -> {
			aux.append("\t" + e + " (" + notas.get(e).setScale(2, RoundingMode.HALF_DOWN) + ")\n");
		});
		
		aux.append("Suspensos:\n"); 
//		for (Map.Entry<String, BigDecimal> entry : notas.entrySet()) {
//			String key = entry.getKey();
//			BigDecimal val = entry.getValue();
//			if (val.compareTo(new BigDecimal(5)) < 0) {
//				aux += "\t" + key + " (" + val.setScale(2, RoundingMode.HALF_DOWN) + ")" + "\n";
//			}			
//		}
		notas.keySet().stream().filter(e -> !this.isAprobado(notas.get(e))).forEach((e) -> {
			aux.append("\t" + e + " (" + notas.get(e).setScale(2, RoundingMode.HALF_DOWN) + ")\n");
		});
		
		return aux.toString();
	}
	
	
	private Boolean isAprobado(BigDecimal nota) {
		return nota.compareTo(new BigDecimal(5)) >= 0;
	}

}
