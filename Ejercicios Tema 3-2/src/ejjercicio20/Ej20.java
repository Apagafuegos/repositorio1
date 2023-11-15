package ejjercicio20;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej20 {

	public static String palabraAdivinar() {

		String[] palabras = new String[] { "azulejo", "tenedor", "saltamontes", "carretilla", "molinero", "sofisticado",
				"terremoto", "culinario", "teclado", "primavera" };
		Random rand = new Random();
		Integer i = rand.nextInt(0, 10);
		String eleccion = palabras[i];
		return eleccion;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String intento = "";
		String palabra = palabraAdivinar();
		String[] adivinanza = palabra.split("");
		String[] partida = new String[palabra.length()];
		Integer intentos = 10;
		Boolean check = false;
		Boolean ganado = true;

		for (int i = 0; i < partida.length; i++) {
			partida[i] = "-";
		}

		System.out.println("INICIO DE PARTIDA");
		System.out.println("La palabra a adivinar tiene " + palabra.length() + " letras.");
		do {
			for (String letra : partida) {
				System.out.print(letra + "");
			}
			System.out.println();
			System.out.println("Ve introduciendo letras jiji");
			intento = sc.nextLine().trim().toLowerCase();

			for (int i = 0; i < adivinanza.length; i++) {
				if (intento.equals(adivinanza[i])) {
					partida[i] = intento;
					check = true;
				}
			}

			if (check) {
				System.out.println("¡Has acertado! Esa letra si es contenida por la palabra :)");
				check = false;
			} else {
				intentos--;
				System.out.println("Fallaste, te quedan " + intentos + " intentos.");
			}

			if (Arrays.equals(partida, adivinanza)) {
				ganado = false;
			}

		} while (intentos > 0 && ganado);

		if (intentos == 0) {
			System.out.println("GAME OVER");
		} else {
			System.out.print("¡Felicidades, acertaste la palabra ");
		}

		if (!ganado) {
			for (int i = 0; i < partida.length; i++) {
				System.out.print(partida[i]);
			}
			System.out.print("!");
		}
		sc.close();
	}

}
