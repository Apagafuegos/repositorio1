package ej58;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Diccionario {

	private Map<String, List<String>> palabras;

	public Diccionario() {
		palabras = new HashMap<>();
	}

	public void cargarDiccionario(List<String> lista) {
		lista.stream().forEach((e) -> {
			if (!palabras.containsKey(e.substring(0, 1).toUpperCase())) {
				palabras.put(e.substring(0, 1).toUpperCase(), new ArrayList<String>(List.of(e)));
			} else {
				List<String> aux = palabras.get(e.substring(0, 1).toUpperCase());
				aux.add(e);
				palabras.put(e.substring(0, 1).toUpperCase(), aux);
			}
		});
	}

	public void borrarDiccionario() {
		palabras.clear();
	}

	public void imprimirPalabras(String letra) {
		System.out.println("Palabras en tu diccionario que empiezan por: " + letra.toUpperCase());
		palabras.values().stream().forEach((v) -> {
			v.stream().filter(e -> e.substring(0, 1).toUpperCase().equals(letra.toUpperCase())).forEach(s -> {
				System.out.println("\t> " + s);
			});
		});
	}

}
