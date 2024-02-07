package ej48;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ej48 {

	public static void main(String[] args) {

		Set<String> listaCadenas = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 5 cadenas");

		while (listaCadenas.size() < 5) {
			listaCadenas.add(sc.nextLine());
		}
		System.out.println(listaCadenas);

		Set<String> listaCaps = new HashSet<>();
		for (String string : listaCadenas) {
			listaCaps.add(string.toUpperCase());
		}
		listaCadenas = listaCaps;

		System.out.println(listaCadenas);

		for (String string : listaCadenas) {
			if (string.isEmpty())
				System.err.println("Hay cadenas vacías");
		}

		Iterator<String> it = listaCadenas.iterator();
		while(it.hasNext()) {
			String aux = (String) it.next();
			if (aux.length() < 6) {
				it.remove();
			}
		}
		System.out.println(listaCadenas);
		sc.close();
	}

}
