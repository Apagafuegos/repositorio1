package ej59;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Geografia {

	private Map<String, String> mapa;

	public Geografia() {
		mapa = new HashMap<>();
	}

	public Boolean agregarPais(String pais, String capital) {
		pais = pais.toUpperCase();
		capital = (capital.substring(0, 1).toUpperCase() + capital.substring(1));
		if (mapa.containsKey(pais)) {
			mapa.replace(pais, capital);
			return false;
		}
		mapa.put(pais, capital);
		return true;
	}

	public String obtenerCapital(String pais) {
		pais = pais.toUpperCase();
		if (mapa.containsKey(pais)) {
			return mapa.get(pais);
		}

		return "";
	}

	public void imprimirPaises() {
		mapa.entrySet().forEach((e) -> {
			System.out.println("PAIS: " + e.getKey() + " - CAPITAL: " + e.getValue());
		});
	}

	public void eliminarPais(String pais) {
		pais = pais.toUpperCase();
		if (mapa.containsKey(pais))
			mapa.remove(pais);
	}

	public Double calcularLongitudMediaPaises() {
		StringBuilder aux = new StringBuilder("");
		Double total = 0d;
		if (!mapa.isEmpty()) {
			mapa.keySet().stream().forEach(e -> {
				aux.append(e);
			});
			total = Double.valueOf(aux.length() / mapa.size());
		}

		return total;
	}

	public void eliminarPaisConCapitalLetra(String letra) {
		List <String> aux = mapa.keySet().stream().filter(e -> mapa.get(e).startsWith(letra.toUpperCase())).toList();
		mapa.remove(aux.get(0));
	}

	public Integer numeroPaisesConCapitalLetra(String letra) {
		return (int) mapa.keySet().stream().filter(e -> mapa.get(e).startsWith(letra.toUpperCase())).count();
	}

	public void imprimirNumeroPaisesLetra(String letra) {
		int aux = (int) mapa.keySet().stream().filter(e -> mapa.get(e).startsWith(letra.toUpperCase())).count();

		if (aux == 0) {
			System.out.println("No hay ninguna capital que empiece por la letra " + letra.toUpperCase());
			return;
		}
		System.out.println("Los siguientes pares capitales empiezan por la letra " + letra.toUpperCase() + " :");
		mapa.keySet().stream().filter(e -> mapa.get(e).startsWith(letra.toUpperCase())).forEach(e -> {
			System.out.println("\tPAIS : " + e + " - CAPITAL: " + mapa.get(e));
		});

	}

	public void mismaLetra() {
		int aux = (int) mapa.keySet().stream()
				.filter(e -> e.substring(0, 1).equalsIgnoreCase(mapa.get(e).substring(0, 1))).count();

		if (aux == 0) {
			System.out.println("No hay ningún par de pais/capital que empiecen por la misma letra");
			return;
		}
		System.out.println("Los siguientes pares pais/capital empiezan por la misma letra: ");
		mapa.keySet().stream().filter(e -> e.substring(0, 1).equalsIgnoreCase(mapa.get(e).substring(0, 1)))
				.forEach(e -> {
					System.out.println("\tPAIS : " + e + " - CAPITAL: " + mapa.get(e));
				});
	}

}
