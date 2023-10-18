package ej5;

import java.util.Scanner;

public class Ej5c {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer wCount = 0;
		Integer aCount = 0;
		System.out.println("Introduce una frase");
		String frase = sc.nextLine();

		for (Integer n = 0; n < frase.length(); n++) {

			Character index = frase.charAt(n);

			if (index.equals(' ')) {
				wCount++;
			} else if (index.equals('a')) {
				aCount++;
			} else if (n == frase.length() - 1) {
				wCount++;
			}else if (frase.indexOf(" ") == -1 && n == 0) {
				wCount++;
			}
		}

		System.out.println("La frase tiene " + wCount + " palabras y en total contiene la letra A un total de " + aCount
				+ " veces.");

		sc.close();
	}

}
