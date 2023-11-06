package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		System.out.println("¿Qué nota buscas?");
		Integer peticion = sc.nextInt();
		Integer contador = 1;
		Boolean check = false;

		for (int i = 0; i < listaNotas.length; i++) {
			if(listaNotas[i] == peticion) {
				System.out.println(contador + ": La nota existe y se encuentra en la posición " + (i));
				contador++;
				check = true;
			}
		}

		if(check == false) {
			System.out.println("No se encuentra la nota solicitada.");
		}
		
		sc.close();
	}
}
