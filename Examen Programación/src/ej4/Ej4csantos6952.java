package ej4;

import java.util.Scanner;

public class Ej4csantos6952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] arrayLetras = { "A", "T", "F", "S", "L" };
		Boolean seguir = true;

		while (seguir) {
			System.out.println("Introduce una palabra:");
			String peticion = sc.nextLine();

			for (int j = 0; j < arrayLetras.length; j++) {
				if (peticion.toUpperCase().startsWith(arrayLetras[j])) {
					System.out.println(
							"La palabra " + peticion + " empieza por la letra en la posición " + j + " del array.");
					seguir = false;
					break;
				}
			}

			if (seguir) {
				System.out.println("La palabra indicada no empieza por ninguna de las letras en el array.");
			}
		}

		sc.close();
	}

}
