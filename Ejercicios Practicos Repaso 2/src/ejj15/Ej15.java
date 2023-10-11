package ejj15;

import java.util.Random;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {

		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		Integer input = 0;
		Integer n = rand.nextInt(10);
		Double score = 0.00;
		Double tries = 1.00;

		do {
			System.out.println("Adivina el número jeje :p");
			input = sc.nextInt();
			if (input != n) {
				System.out.println("Numero incorrecto jeje :p");
				tries++;
			}

		} while (input != n);
		score = 10 / tries;
		System.out.println("Tu puntuación es de " + score + " puntos jeje :p");
	}

}
