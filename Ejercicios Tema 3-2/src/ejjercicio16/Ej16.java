package ejjercicio16;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra para ser revertida jeje :p");
		String palabra = sc.nextLine().toLowerCase();
		String arrayPalabra[] = new String[palabra.length()];

		arrayPalabra = palabra.split("");

		for (int i = (arrayPalabra.length - 1); i >= 0; i--) {

			System.out.print(arrayPalabra[i]);
		}


		sc.close();

	}

}
