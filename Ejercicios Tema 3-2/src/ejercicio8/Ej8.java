package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		System.out.println("Va a introducir 3 palabras");
		Scanner sc = new Scanner(System.in);
		String palabraTotal = "";
		String[] palabras = new String[3];

		for (int i = 0; i < palabras.length; i++) {

			String palabra = sc.nextLine();
			palabras[i] = palabra;

		}

		for (int j = palabras.length-1; j >= 0; j--) {

			palabraTotal = palabraTotal + palabras[j];

		}

		System.out.println(palabraTotal);

	}

}
