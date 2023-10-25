package ejercicio7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		System.out.println("Va a introducir 3 palabras");
		Scanner sc = new Scanner(System.in);
		String palabraTotal = "";
		String[] palabras = new String[3];
		String[] palabrasInvertido = new String[3];
		Integer posicion = 2;

		for (int i = 0; i < palabras.length; i++) {

			String palabra = sc.nextLine();
			palabras[i] = palabra;

		}
		
		for (int k = 0; k < palabrasInvertido.length; k++) {
			
			palabrasInvertido[k] = palabras[posicion];
			posicion--;
			
		}

		for (int j = 0; j < palabras.length; j++) {

			palabraTotal = palabraTotal + palabrasInvertido[j];

		}

		System.out.println(palabraTotal);

	}

}
