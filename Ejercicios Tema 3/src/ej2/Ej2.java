package ej2;

import java.util.Scanner;

public class Ej2 {

	public static Integer tamañoAPedir() {

		Scanner sc = new Scanner(System.in);
		Integer peticion = 0;
		do {
			System.out.println("Introduzca un numero cualquiera");
			peticion = sc.nextInt();
		} while (peticion <= 0);

		sc.close();
		return peticion;

	}

	public static void main(String[] args) {

		Integer peticion = tamañoAPedir();

		Integer fila = 0;

		for (Integer n1 /* fila */ = 1; n1 <= peticion; n1++) {
			for (Integer n2 /* columna */ = 1; n2 <= peticion; n2++) {
				if (n2 == n1 || n2 == peticion - fila) {
					System.out.print("* ");
					if (n2 == peticion - fila) {
						fila++;
					}

				} else {
					System.out.print("- ");
				}

			}
			System.out.println();
		}

	}

}
