package ej2;

import java.util.Random;
import java.util.Scanner;

public class Ej2csantos6952 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		String palabra = "";

		do {
			System.out.println("Introduce una palabra que empiece por F y tenga más de 7 letras");
			palabra = sc.nextLine();

		} while (!(palabra.startsWith("F") && palabra.length() > 7));

		Integer aleatorio = rand.nextInt(1, (palabra.length() - 1));
		System.out.println(aleatorio);

		String[] arrayLetras = palabra.split("");

		for (int i = 0; i < arrayLetras.length; i++) {
			if (i == aleatorio - 1) {
				arrayLetras[i] = aleatorio.toString();
			}
		}

		for (String letra : arrayLetras) {
			System.out.print(letra);
		}

		sc.close();

	}

}
