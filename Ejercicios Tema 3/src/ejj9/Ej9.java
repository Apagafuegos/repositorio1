package ejj9;

import java.util.Random;
import java.util.Scanner;

public class Ej9 {

	public static int tirarDado() {
		Random ram = new Random();
		Integer tirada = ram.nextInt(1, 7);
		return tirada;
		// Funcion que autogenera las tiradas de dado por cada llamada
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer posUser = 0;
		Integer posCPU = 0;
		Integer i = 0;
		Boolean turno = true;
		Boolean check = true;

		do {
			if (posUser != 60 && posCPU != 60) {

				if (turno) {
					System.out.println("Posición del Usuario: " + posUser);
					System.out.println("Posición de EvilCPU: " + posCPU);
					System.out.println("Pulse ENTER para tirar el dado");
					sc.nextLine(); // Esperar al enter
					Integer dado = tirarDado();// Meto mi función
					System.out.println("Tu dado ha dado " + dado);
					Integer aux = posUser; // Posicion previa, por si se pasa
					posUser += dado;
					if (posUser % 5 == 0) {
						posUser += 5;
						System.out.println("De oca en oca tiras porque te TOCAAA, pasa de " + (posUser - 5) + " a " + posUser);
					}
					if (posUser > 60) {
						Integer aux2 = 60 - aux;
						posUser = 60 - (dado - aux2);
					}
					if (dado == 6) {
						turno = true;
						System.out.println("Turno gratis jeje");
					} else {
						turno = false;
					}
				}

				else {

					System.out.println("Posición del Usuario: " + posUser);
					System.out.println("Posición de EvilCPU: " + posCPU);
					System.out.println("Turno de EvilCPU");
					sc.nextLine();
					Integer dado = tirarDado();
					System.out.println("El dado de EvilCPU ha dado " + dado);
					Integer aux = posCPU; // Posicion previa, por si se pasa
					posCPU += dado;
					if (posCPU % 5 == 0) {
						posCPU += 5;
						System.out.println(
								"De oca en oca tira porque LE TOCAAA, pasa de " + (posCPU - 5) + " a " + posCPU);
					}
					if (posCPU > 60) {
						Integer aux2 = 60 - aux;
						posCPU = 60 - (dado - aux2);
					}
					if (dado == 6) {
						turno = false;
						System.out.println("Turno gratis para EvilCPU jeje");
					} else {
						turno = true;
					}
				}

			}
		} while ((posUser != 60 && posCPU != 60));

		if (posUser == 60) {
			System.out.println("Enhorabuena!!! GANASTE");
		} else {
			System.out.println("Has perdido, pringao.");
		}

		sc.close();

	}

}
