package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej2ContraMaquina {

	public static Scanner sc = new Scanner(System.in);
	public static Random rand = new Random();

	public static String[][] generarTablero() {
		Integer columnas = 3, filas = 3;
		String[][] tablero = new String[filas][columnas];

		for (int i = 0; i < tablero.length; i++) {
			String[] filaZ = tablero[i];
			for (int j = 0; j < filaZ.length; j++) {
				filaZ[j] = "-";
			}
		}
		return tablero;
	}

	public static void imprimirTablero(String tablero[][]) {
		for (int j = 0; j < 3; j++) {
			for (int j2 = 0; j2 < 3; j2++) {
				System.out.print(tablero[j][j2] + " ");
			}
			System.out.println();

		}
	}

	public static Integer[] peticionUsuario() {

		Integer[] coordenadas = new Integer[2];
		Integer filaUsuario = 0;
		Integer columnaUsuario = 0;
		do {
			System.out.println("Introduce la fila");
			filaUsuario = sc.nextInt();
			if (filaUsuario > 2 || filaUsuario < 0) {
				System.err.println("Nº de fila no correcta");
			}
		} while (filaUsuario > 2 || filaUsuario < 0);
		coordenadas[0] = filaUsuario;
		do {
			System.out.println("Introduce la columna");
			columnaUsuario = sc.nextInt();
			if (columnaUsuario > 2 || columnaUsuario < 0) {
				System.err.println("Nº de fila no correcta");
			}
		} while (columnaUsuario > 2 || columnaUsuario < 0);
		coordenadas[1] = columnaUsuario;

		return coordenadas;
	}

	public static Boolean condicionVictoria(String[][] tablero) {
		Boolean ganado = false;
		Boolean diagonal1X = (tablero[0][0].contains("X") && tablero[1][1].contains("X")
				&& tablero[2][2].contains("X"));
		Boolean diagonal1O = (tablero[0][0].contains("O") && tablero[1][1].contains("O")
				&& tablero[2][2].contains("O"));
		Boolean diagonal2X = (tablero[2][0].contains("X") && tablero[1][1].contains("X")
				&& tablero[0][2].contains("X"));
		Boolean diagonal2O = (tablero[2][0].contains("O") && tablero[1][1].contains("O")
				&& tablero[0][2].contains("O"));
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
			System.out.println("¡Gana la CPU!");
			ganado = true;
		} else if (diagonal1X || diagonal2X || hor1X || hor2X || hor3X || ver1X || ver2X || ver3X) {
			System.out.println("¡Gana el Jugador 1!");
			ganado = true;
		}

		return ganado;
	}

	public static Integer[] peticionCPU(String[][] tableroJuego) {

		Integer[] coordenadas = new Integer[2];
		Integer x = rand.nextInt(0, 3);
		Integer y = rand.nextInt(0, 3);
		coordenadas[0] = x;
		coordenadas[1] = y;

		return coordenadas;
	}

	public static void main(String[] args) {

		Integer fila = 0;
		Integer columna = 0;

		List<String> listaPosiciones = new ArrayList<String>();
		Boolean turno = false, ganado = false, posicionTomada = false;
		// Turno: False es J1, true es J2

		System.out.println("Inicio de partida:");
		String[][] tablero = generarTablero();
		imprimirTablero(tablero);

		do {
			if (!turno) {
				System.out.println("Turno de jugador 1");
			} else {
				System.out.println("Turno de la máquina");
			}
			posicionTomada = false;
			do {
				if (!turno) {
					Integer[] coordenadasIntroducidas = peticionUsuario();
					fila = coordenadasIntroducidas[0];
					columna = coordenadasIntroducidas[1];
				} else {
					Integer[] coordenadasIntroducidasCPU = peticionCPU(tablero);
					fila = coordenadasIntroducidasCPU[0];
					columna = coordenadasIntroducidasCPU[1];
				}
				String posicion = fila.toString() + "," + columna.toString();

				if (listaPosiciones.contains(posicion)) {
					if(!turno) {
					System.err.println("Esa coordenada ya está tomada");
					}
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

			imprimirTablero(tablero);

			// Condiciones de victoria
			ganado = condicionVictoria(tablero);
			
			if (listaPosiciones.size() == 9 && !ganado) {
				System.out.println("¡Nadie ha ganado y no hay más huecos que ocupar!");
				ganado = true;
			}

		} while (!ganado);

		sc.close();
	}

}
