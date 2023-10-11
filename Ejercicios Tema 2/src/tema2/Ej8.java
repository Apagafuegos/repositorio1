package tema2;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1;
		String s2;

		do {
			System.out.println("Introduzca la primera cadena");
			s1 = sc.nextLine().trim();
			System.out.println("Introduzca la segunda cadena");
			s2 = sc.nextLine().trim();
			if(!(s1.equalsIgnoreCase(s2))) {
				System.out.println("No son iguales, primo.");
			}
		} while (!(s1.equalsIgnoreCase(s2)));

		System.out.println("Muchas gracias, un saludo.");
	}

}
