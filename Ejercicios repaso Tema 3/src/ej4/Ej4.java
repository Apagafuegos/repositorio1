package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		System.out.println("¿Qué nota buscas?");
		Integer peticion = sc.nextInt();
		Integer contador = 0;

		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] > peticion) {
				contador++;
			}
		}

		if (contador != 0) {
			System.out.println("Hay " + contador + " notas superiores a la introducida.");
		}else {
			System.out.println("No se ha encontrado ninguna nota superior a la introducida.");
		}

		sc.close();
	}
}
