package tema2;

import java.util.Scanner;

public class Ejj21e {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número cualquiera");
		Integer peticion = sc.nextInt();

		for (Integer n = 1; n <= peticion; n++) {
			for (Integer n2 = 1; n2 <= n; n2++) {
				System.out.print(n2 + " ");
			}
			System.out.println();
		}
	}

}
