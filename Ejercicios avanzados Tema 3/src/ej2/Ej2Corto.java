package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej2Corto {

	public static void main(String[] args) {

		Integer columnas = 3, filas = 3;
		String[][] tablero = new String[filas][columnas];
		Integer fila = 0;
		Integer columna = 0;

		for (int i = 0; i < tablero.length; i++) {
			String[] filaZ = tablero[i];
			for (int j = 0; j < filaZ.length; j++) {
				filaZ[j] = "---";
			}
		}

		List<String> listaPosiciones = new ArrayList<String>();
		Boolean turno = false, ganado = false, posicionTomada = false;
		// Turno: False es J1, true es J2
		Scanner sc = new Scanner(System.in);

		System.out.println("Inicio de partida:");

		for (int j = 0; j < filas; j++) {
			for (int j2 = 0; j2 < columnas; j2++) {
				System.out.print(tablero[j][j2] + " ");
			}
			System.out.println();

		}

		do {
			if (turno) {
				System.out.println("Turno de jugador 2");
			} else {
				System.out.println("Turno de jugador 1");
			}
			posicionTomada = false;
			do {
				do {
					System.out.println("Introduce la fila");
					fila = sc.nextInt();
					if (fila > 2 || fila < 0) {
						System.err.println("Nº de fila no correcta");
					}
				} while (fila > 2 || fila < 0);
				do {
					System.out.println("Introduce la columna");
					columna = sc.nextInt();
					if (columna > 2 || columna < 0) {
						System.err.println("Nº de fila no correcta");
					}
				} while (columna > 2 || columna < 0);

				String posicion = fila.toString() + "," + columna.toString();

				if (listaPosiciones.contains(posicion)) {
					System.err.println("Esa coordenada ya está tomada");
					posicionTomada = true;
				} else {
					if (turno) {
						tablero[fila][columna] = "O";
						turno = false;
					} else {
						tablero[fila][columna] = "X";
						turno = true;
					}
					listaPosiciones.add(posicion);
					posicionTomada = false;
				}

			} while (posicionTomada);

			for (int j = 0; j < filas; j++) {
				for (int j2 = 0; j2 < columnas; j2++) {
					System.out.print(tablero[j][j2] + " ");
				}
				System.out.println();

			}
			Boolean diagonal1X = (tablero[0][0].contains("X") && tablero[1][1].contains("X") && tablero[2][2].contains("X"));
			Boolean diagonal1O = (tablero[0][0].contains("O") && tablero[1][1].contains("O") && tablero[2][2].contains("O"));
			Boolean diagonal2X = (tablero[2][0].contains("X") && tablero[1][1].contains("X") && tablero[0][2].contains("X"));
			Boolean diagonal2O = (tablero[2][0].contains("O") && tablero[1][1].contains("O") && tablero[0][2].contains("O"));
			Boolean hor1X = (tablero[1][0].contains("X") && tablero[1][1].contains("X") && tablero[1][2].contains("X"));
			Boolean hor1O = (tablero[1][0].contains("O") && tablero[1][1].contains("O") && tablero[1][2].contains("O"));
			Boolean hor2X = (tablero[0][0].contains("X") && tablero[0][1].contains("X") && tablero[0][2].contains("X"));
			Boolean hor2O = (tablero[0][0].contains("O") && tablero[0][1].contains("O") && tablero[0][2].contains("O"));
			Boolean hor3X = (tablero[2][0].contains("X") && tablero[2][1].contains("X") && tablero[2][2].contains("X"));
			Boolean hor3O = (tablero[2][0].contains("O") && tablero[2][1].contains("O") && tablero[2][2].contains("O"));
			Boolean ver1X = (tablero[0][0].contains("X") && tablero[1][0].contains("X") && tablero[2][0].contains("X"));
			Boolean ver1O = (tablero[0][0].contains("O") && tablero[1][0].contains("O") && tablero[2][0].contains("O"));
			Boolean ver2X = (tablero[0][1].contains("X") && tablero[1][1].contains("X") && tablero[2][1].contains("X"));
			Boolean ver2O = (tablero[0][1].contains("O") && tablero[1][1].contains("O") && tablero[2][1].contains("O"));
			Boolean ver3X = (tablero[0][2].contains("X") && tablero[1][2].contains("X") && tablero[2][2].contains("X"));
			Boolean ver3O = (tablero[0][2].contains("O") && tablero[1][2].contains("O") && tablero[2][2].contains("O"));

			if (diagonal1O || diagonal2O || hor1O || hor2O || hor3O || ver1O || ver2O || ver3O) {
				System.out.println("¡Gana el Jugador 2!");
				ganado = true;
			} else if (diagonal1X || diagonal2X || hor1X || hor2X || hor3X || ver1X || ver2X || ver3X) {
				System.out.println("¡Gana el Jugador 1!");
				ganado = true;
			}

		} while (!ganado);

		sc.close();
	}

}
