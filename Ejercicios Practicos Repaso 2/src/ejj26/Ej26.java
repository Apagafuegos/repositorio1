package ejj26;

import java.util.Random;
import java.util.Scanner;

public class Ej26 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String eleccion = "";
		String eleccion2 = "";
		String resultado = "";
		String resAcumulado = "";
		do {
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
				resultado = "EMPATE";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("tijera") && eleccion.equals("tijera")) {
				resultado = "EMPATE";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("papel") && eleccion.equals("papel")) {
				resultado = "EMPATE";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("piedra") && eleccion.equals("papel")) {
				resultado = "GANAS TU!!!";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("piedra") && eleccion.equals("tijera")) {
				resultado = "PERDISTE :CCC";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("papel") && eleccion.equals("piedra")) {
				resultado = "PERDISTE :CCC";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("papel") && eleccion.equals("tijera")) {
				resultado = "GANAS TU!!!";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("tijera") && eleccion.equals("papel")) {
				resultado = "PERDISTE :CCC";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);
			} else if (eleccionMaquina.equals("tijera") && eleccion.equals("piedra")) {
				resultado = "GANAS TU!!!";
				resAcumulado = resAcumulado + " " + resultado;
				System.out.println(resultado);

			}

			do {
				System.out.println("¿Quieres echar otra partida?");
				eleccion2 = sc.nextLine().toLowerCase();
				if (!(eleccion2.equals("si") || eleccion2.equals("no"))) {
					System.out.println("Escribe algo con sentido, nene.");
				}
			} while (!(eleccion2.equals("si") || eleccion2.equals("no")));

		} while (eleccion2.equals("si"));

		System.out.println("Adios :c");
		System.out.println("Los resultados de tu(s) partida(s) han sido : " + resAcumulado );

		sc.close();
	}

}
