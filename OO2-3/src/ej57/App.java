package ej57;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, List<String>> palabras = new HashMap<>();
		String palabra = null;
		do {
			System.out.println("Introduce palabras. Cuando introduzcas \"FIN\" pararé.");
			palabra = sc.nextLine();
			String letra = palabra.substring(0, 1).toUpperCase();

			if (palabra.equalsIgnoreCase("fin")) {
				break;
			} else if (!palabras.containsKey(letra)) {
				palabras.put(letra.toUpperCase(), new ArrayList<String>(List.of(palabra)));
			} else {
				List<String> aux = palabras.get(letra);
				aux.add(palabra);
				palabras.replace(letra.toUpperCase(), aux);
			}

		} while (!palabra.equalsIgnoreCase("fin"));

		StringBuilder letraAElegir = new StringBuilder("");

		do {
			System.out.println("Introduce una letra");
			String letra = sc.nextLine().toUpperCase();
			if (letra.equalsIgnoreCase("fin")) {
				break;
			} else if (palabras.containsKey(letra)) {
				System.out.println("Hay " + palabras.get(letra).size() + " palabras que empiezan por " + letra);
				palabras.keySet().stream().filter(e -> e.equals(letra)).forEach((e) -> {
					for (String p : palabras.get(e)) {
						System.out.println("\t> " + p);
					}

				});
				letraAElegir = new StringBuilder(letra);
			} else {
				System.err.println("No hay ninguna palabra con dicha letra");
			}

		} while (!letraAElegir.toString().equalsIgnoreCase("fin"));

		sc.close();

	}

}
