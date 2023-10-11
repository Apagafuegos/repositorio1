package tema2;

import java.util.Scanner;

public class Ejj10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = "";
		String s2 = "";
		Integer comp;

		do {
			System.out.println("Introduzca la cadena 1");
			s1 = sc.nextLine();
			System.out.println("Introduzca la cadena 2");
			s2 = sc.nextLine();

		} while (((s1.isEmpty() || s1.isBlank()) || (s2.isEmpty() || s2.isBlank())));

		comp = s1.compareTo(s2);

		if (comp < 0) {
			System.out.println(s1 + ", " + s2);
		} else if (comp > 0) {
			System.out.println(s2 + ", " + s1);
		} else {
			System.out.println(s1 + ", " + s2 + " (MISMO ORDEN ALFABÉTICO)");
		}

	}

}	
