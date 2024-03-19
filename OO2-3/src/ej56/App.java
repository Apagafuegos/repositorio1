package ej56;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> numeros = new HashMap<>();
		Integer x = null;
		do {
			System.out.println("Introduce numeros. Cuando introduzcas el 0 pararé.");
			x = sc.nextInt();

			if (numeros.isEmpty() || !numeros.containsKey(x)) {
				numeros.put(x, 1);
			} else {
				numeros.replace(x, (numeros.get(x) + 1));
			}

		} while (x != 0);
		
		numeros.remove(0);

		System.out.println("Total de números introducidos: " + numeros.size());
		System.out.println("Distribución:");
		numeros.forEach((k, v) -> System.out.println("\t > Numero " + k + ": " + v + " veces"));

		sc.close();

	}

}
