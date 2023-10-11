package tema2;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer n1;
		Integer n2;

		do {
			System.out.println("Introduzca el primer número");
			n1 = sc.nextInt();
			System.out.println("Introduzca el segundo número");
			n2 = sc.nextInt();
		} while (n1 != n2);

		System.out.println("Muchas gracias, un saludo.");
	}

}
