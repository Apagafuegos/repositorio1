package ejj25;

import java.util.Random;
import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String eleccion = "";
		do {

			System.out.println("Piedra, papel, tijera… un, dos, tres… ya!!");
			eleccion = sc.nextLine().toLowerCase();

			if (!eleccion.equals("papel") && !eleccion.equals("tijera") && !eleccion.equals("piedra")) {
				System.out.println("Eleccion no correcta :p");
			}
		} while (!eleccion.equals("papel") && !eleccion.equals("tijera") && !eleccion.equals("piedra"));

		Integer eleccionMaquinaN = rand.nextInt(1, 4);
		String eleccionMaquina = "";

		switch (eleccionMaquinaN) {

		case 1:
			eleccionMaquina = "piedra";
			break;
		case 2:
			eleccionMaquina = "papel";
			break;
		case 3:
			eleccionMaquina = "tijera";
			break;
		}

		System.out.println(eleccionMaquina);

		if (eleccionMaquina.equals("piedra") && eleccion.equals("piedra")) {
			System.out.println("EMPATE");
		} else if (eleccionMaquina.equals("tijera") && eleccion.equals("tijera")) {
			System.out.println("EMPATE");
		} else if (eleccionMaquina.equals("papel") && eleccion.equals("papel")) {
			System.out.println("EMPATE");
		} else if (eleccionMaquina.equals("piedra") && eleccion.equals("papel")) {
			System.out.println("GANAS TU!!!!");
		} else if (eleccionMaquina.equals("piedra") && eleccion.equals("tijera")) {
			System.out.println("PERDISTE :CCCCC");
		} else if (eleccionMaquina.equals("papel") && eleccion.equals("piedra")) {
			System.out.println("PERDISTE :CCCCC");
		} else if (eleccionMaquina.equals("papel") && eleccion.equals("tijera")) {
			System.out.println("GANAS TU!!!!");
		} else if (eleccionMaquina.equals("tijera") && eleccion.equals("papel")) {
			System.out.println("PERDISTE :CCCCC");
		} else if (eleccionMaquina.equals("tijera") && eleccion.equals("piedra")) {
			System.out.println("GANAS TU!!!!");
		}

		
		sc.close();
	}

}
