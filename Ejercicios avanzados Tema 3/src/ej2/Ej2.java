package ej2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Integer columnas = 3;
		Integer filas = 3;
		String[][] tablero = new String[filas][columnas];
		List<String> listaPosiciones = new ArrayList<String>();
		Boolean posicionTomada = false;
		Boolean turno = false;
		Boolean ganado = false;
		// False es J1, true es J2
		// { "0,0", "0,1", "0,2", "1,0", "1,1", "1,2", "2,0", "2,1", "2,2" };
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < tablero.length; i++) {
			String[] fila = tablero[i];
			for (int j = 0; j < fila.length; j++) {
				fila[j] = "---";
			}
		}

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
				posicionTomada = false;
				do {
					System.out.println("Introduce la fila");
					Integer fila = sc.nextInt();
					System.out.println("Introduce la columna");
					Integer columna = sc.nextInt();

					String posicion = fila.toString() + "," + columna.toString();

					if (listaPosiciones.contains(posicion)) {
						System.out.println("Esa coordenada ya está tomada");
						posicionTomada = true;
					} else {
						tablero[fila][columna] = "O";
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
				turno = false;
			} else {
				System.out.println("Turno de jugador 1");
				posicionTomada = false;
				do {
					System.out.println("Introduce la fila");
					Integer fila = sc.nextInt();
					System.out.println("Introduce la columna");
					Integer columna = sc.nextInt();

					String posicion = fila.toString() + "," + columna.toString();

					if (listaPosiciones.contains(posicion)) {
						System.out.println("Esa coordenada ya está tomada");
						posicionTomada = true;
					} else {
						tablero[fila][columna] = "X";
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
				turno = true;
			}
		} while (!ganado);

		sc.close();
	}
}
