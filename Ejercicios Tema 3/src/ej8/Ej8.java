package ej8;

import java.util.Random;
import java.util.Scanner;

public class Ej8 {

	public static int tirarDado() {
		Random ram = new Random();
		Integer tirada = ram.nextInt(1, 7);
		return tirada;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer posUser = 0;
		Integer posCPU = 0;
		Boolean turno = true;

		do {
			if(posUser != 60 && posCPU != 60) {
				if (turno) {
					System.out.println("Posición del Usuario: " + posUser);
					System.out.println("Posición de EvilCPU: " + posCPU);
					System.out.println("Pulse ENTER para tirar el dado");
					sc.nextLine();
					Integer dado = tirarDado();
					System.out.println("Tu dado ha dado " + dado);
					Integer aux = posUser; //Posicion previa, por si se pasa
					posUser += dado;
					if (posUser > 60) {
						Integer aux2 = 60 - aux;
						posUser = 60 - (dado - aux2);
					}
					turno = false;
				} else {
					System.out.println("Posición del Usuario: " + posUser);
					System.out.println("Posición de EvilCPU: " + posCPU);
					System.out.println("Turno de EvilCPU");
					sc.nextLine();
					Integer dado = tirarDado();
					System.out.println("Su dado ha dado " + dado);
					Integer aux = posCPU; //Posicion previa, por si se pasa
					posCPU += dado;
					if (posCPU > 60) {
						Integer aux2 = 60 - aux;
						posCPU = 60 - (dado - aux2);
					}
					turno = true;
				}

			}
		} while ((posUser != 60 && posCPU != 60));
		
		if(posUser == 60) {
			System.out.println("Enhorabuena!!! GANASTE");
		}else {
			System.out.println("Has perdido, pringao.");
		}
		

		sc.close();
	}

}
