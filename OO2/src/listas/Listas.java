package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Listas {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce 5 cadenas");
		for (int i = 0; i < 5; i++) {
			String cadena = sc.nextLine();
			lista.add(cadena);
		}

		System.out.println(lista);

		for (int i = 0; i < lista.size(); i++) {
			String aux = lista.get(i).toUpperCase();
			lista.set(i, aux);
		}

		System.out.println(lista);

		if (lista.indexOf("") != -1) {
			System.out.println("Hay cadenas vacías");
		}
		Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String aux = (String) it.next();
			if (aux.length() < 6) {
				it.remove();
			}

		}
		System.out.println(lista);
		sc.close();
	}

}
