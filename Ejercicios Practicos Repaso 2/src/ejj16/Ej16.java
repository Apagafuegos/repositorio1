package ejj16;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra cualquiera :p");
		String palabra = sc.nextLine();

		for (Integer n = 0; n < palabra.length(); n++) {
			System.out.println(palabra.charAt(n));
		}

	}

}
