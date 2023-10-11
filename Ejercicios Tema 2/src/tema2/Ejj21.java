package tema2;

import java.util.Scanner;

public class Ejj21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número cualquiera");
		Integer peticion = sc.nextInt();
		Integer n = 1;
		Integer n2 = 1;
		String n3 = "";

		for (; n <= peticion; n++) {
			for (; n2 == n; n2++) {
				System.out.print(n3 + " " + n2 + " ");
				n3 = n3 + " " + n2.toString();
			}
			System.out.println();
		}
	}

}
