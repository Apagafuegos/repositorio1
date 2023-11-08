package ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

	public static String[][] creacionTableroMuestra() {

		String[][] tableroMuestra = new String[10][10];

		for (int i = 0; i < tableroMuestra.length; i++) {
			String[] fila = tableroMuestra[i];
			for (int j = 0; j < fila.length; j++) {
				fila[j] = "*";
			}
		}

		return tableroMuestra;
	}

	public static String[][] creacionTableroJuego() {
		String[][] tableroJuego = new String[10][10];
		Random rand = new Random();
		Integer n1 = rand.nextInt(0, 10);
		Integer n2 = rand.nextInt(0, 10);
		Integer contMinas = 0;

		for (int i = 0; i < tableroJuego.length; i++) {
			for (int j = 0; j < tableroJuego.length; j++) {
				tableroJuego[i][j] = "-";
			}
		}

		do {
			tableroJuego[n1][n2] = "M";
			n1 = rand.nextInt(0, 10);
			n2 = rand.nextInt(0, 10);
			contMinas++;

		} while (contMinas < 5);

		return tableroJuego;
	}

	public static void imprimirTablero(String[][] tablero) {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero.length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] tableroMuestra = creacionTableroMuestra();
		String[][] tableroJuego = creacionTableroJuego();
		String coordenadaTotal = "";
		List<String> posicionesOcupadas = new ArrayList<String>();
		// imprimirTablero(tableroJuego);
		System.out.println();
		imprimirTablero(tableroMuestra);
		Integer x = 0;// coordenada x
		Integer y = 0;// coordenada y
		Integer posicionesCubiertas = 0;
		Integer contMinasPosicion = 0;
		Boolean minaExplota = false;

		do {

			do {
				if (posicionesOcupadas.contains(coordenadaTotal)) {
					System.err.println("Ya has desvelado esa coordenada");
				}
				do {
					if (x < 0 || x > 9) {
						System.err.println("Coordenada X no correcta");
					}
					System.out.println("Introduce coordenada X");
					x = sc.nextInt();
				} while ((x < 0 || x > 9));

				do {
					if (y < 0 || y > 9) {
						System.err.println("Coordenada Y no correcta");
					}
					System.out.println("Introduce coordenada Y");
					y = sc.nextInt();
				} while (y < 0 || y > 9);

				coordenadaTotal = x.toString() + ":" + y.toString();

			} while ((posicionesOcupadas.contains(coordenadaTotal)));
			posicionesOcupadas.add(coordenadaTotal);
			coordenadaTotal = "";
			if (tableroJuego[x][y].equals("M")) {
				System.out.println("¡Una mina ha explotado!");
				System.out.println("GAME OVER :(");
				minaExplota = true;
			} else {
				contMinasPosicion = 0;
				for (int i = x - 1; i <= x + 1; i++) {

					for (int j = y - 1; j <= y + 1; j++) {
						if (!(i < 0 || j < 0 || i > 9 || j > 9)) {
							if (tableroJuego[x][y].equals("M")) {
								posicionesCubiertas++;
							} else {
								if (tableroJuego[i][j].equals("M")) {
									contMinasPosicion++;
								}

							}
						}
					}
				}

				if (contMinasPosicion != 0) {
					tableroMuestra[x][y] = contMinasPosicion.toString();
				} else {
					tableroMuestra[x][y] = "-";
				}

			}

			for (int i = 0; i < tableroMuestra.length; i++) {
				for (int j = 0; j < tableroMuestra.length; j++) {

					if (tableroMuestra[i][j].equals(" ")) {
						posicionesCubiertas++;
					}
				}
			}

			// imprimirTablero(tableroJuego);
			System.out.println();
			imprimirTablero(tableroMuestra);

		} while (posicionesCubiertas < 95 && !minaExplota);

	}

}
