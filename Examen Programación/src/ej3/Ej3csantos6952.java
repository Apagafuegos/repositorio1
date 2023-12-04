package ej3;

import java.util.Scanner;

public class Ej3csantos6952 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número largo (no introduzcas palabras)");
		String peticion = sc.nextLine();
		String[] numeros = peticion.split("");
		Integer cuenta = 0;
		int i = 0;

		for (int j = 0; j < numeros.length; j++) {
			cuenta = 1;
			for (i = j + 1; i < numeros.length; i++) {
				if (numeros[j].equals(numeros[i])) {
					cuenta++;
				} else {
					break;
				}
			}

			if (cuenta > 1) {
				System.out.println("El dígito " + numeros[j] + " se repite seguidamente " + cuenta + " veces.");
				j = i;
			}
		}

		sc.close();
	}

}
