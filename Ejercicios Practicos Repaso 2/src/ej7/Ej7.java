package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número entre 1 y 10");
		Integer n = sc.nextInt();
		Integer suma = 0;
		while (n != 0) {
			if (n >= 1 && n <= 10) {
				for (Integer n2 = 1; n2 <= 10; n2++) {
					if (n2 == 10) {
						suma = suma + n2 * n;
						System.out.print(n2 * n + " = " + suma);
						System.out.println();
						System.out.println("Introduzca un número entre 1 y 10");
						n = sc.nextInt();
					} else {
						suma = suma + n2 * n;
						System.out.print(n2 * n + " + ");
					}
				}

			} else if (n < 0 && n > 10) {
				System.out.println("Número no correcto");
				System.out.println("Introduzca un número entre 1 y 10");
				n = sc.nextInt();
			}
		}

	}

}
