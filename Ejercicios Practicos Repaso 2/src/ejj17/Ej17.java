package ejj17;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer n = 0, fn1 = 0, fn2 = 1;

		do {
			System.out.println("Introduce un numero cualquiera mayor de dos jeje :p");
			n = sc.nextInt();
		} while (n < 2);

		for (Integer i = 0; i <= n - 2; i++) {
			if (i == 0) {
				System.out.print(fn1 + " ");
			}
			System.out.print(fn2 + " ");
			fn2 = fn2 + fn1;
			fn1 = fn2 - fn1;

		}

	}

}
