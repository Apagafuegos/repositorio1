package ejj10;

import java.util.Random;
import java.util.Scanner;

public class Ej10 {

	public static Integer tirarDado() {

		Random ram = new Random();
		Integer tirada = ram.nextInt(1, 7);
		return tirada;
	}


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer posUser = 0;
		Integer posCPU = 0;
		Boolean check = true;
		Boolean turno = true;
		Integer i = 0;

		do {
			if (posUser != 60 && posCPU != 60) {
				if (turno) {
					System.out.println("Posición del Usuario: " + posUser);
					System.out.println("Posición de EvilCPU: " + posCPU);
					System.out.println("Pulse ENTER para tirar el dado");
					sc.nextLine();
					Integer dado = tirarDado();
					System.out.println("Tu dado ha dado " + dado);
					Integer aux = posUser; // Posicion previa, por si se pasa
					posUser += dado;
					if (posUser % 5 == 0 && posUser != 60) {
						posUser += 5;
						System.out.println(
								"De oca en oca tiras porque te TOCAAA, pasa de " + (posUser - 5) + " a " + posUser); //De oca en oca (si es multiplo de 5 la posicion)
					}
					if (posUser > 60) {
						Integer aux2 = 60 - aux; //Para que corrija si se pasa de 60
						posUser = 60 - (dado - aux2);
					}
					if (dado == 6) {
						turno = true;
						System.out.println("Turno gratis jeje"); //Turno gratis si tiras 6
					} else {
						turno = false;
					}
				} else {
					System.out.println("Posición del Usuario: " + posUser);
					System.out.println("Posición de EvilCPU: " + posCPU);
					System.out.println("Turno de EvilCPU");
					sc.nextLine();
					Integer dado = tirarDado();
					System.out.println("El dado de EvilCPU ha dado " + dado);
					Integer aux = posCPU; // Posicion previa, por si se pasa
					posCPU += dado;
					if (posCPU % 5 == 0 && posCPU != 60) {
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
 
				if (posUser == 19 && check) { //Penalización de casilla 19 para usuario
					if (i == 0) {
						System.out.println("Pierdes 1 turno");
					}
					turno = false;
					i++;
					if (i == 3) {
						turno = true;
						check = false;
						i = 0;
					}
				} else if (posUser == 31 && check) {//Penalización de casilla 31 para usuario
					if (i == 0) {
						System.out.println("Pierdes 2 turnos");
					}
					turno = false;
					i++;
					if (i == 4) {
						turno = true;
						check = false;
						i = 0;
					}

				} else if (posUser == 56 && check) {//Penalización de casilla 56 para usuario
					if (i == 0) {
						System.out.println("Pierdes 3 turnos");
					}
					turno = false;
					i++;
					if (i == 5) {
						turno = true;
						check = false;
						i = 0;
					}

				}

				if (posCPU == 19 && check) {//Penalización de casilla 19 para cpu
					if (i == 0) {
						System.out.println("EvilCPU pierde 1 turno");
					}
					turno = true;
					i++;
					if (i == 3) {
						turno = false;
						check = false;
						i = 0;
					}
				} else if (posCPU == 31 && check) {//Penalización de casilla 31 para cpu
					if (i == 0) {
						System.out.println("EvilCPU pierde 2 turnos");
					}
					turno = true;
					i++;
					if (i == 4) {
						turno = false;
						check = false;
						i = 0;
					}

				} else if (posCPU == 56 && check) {//Penalización de casilla 56 para cpu
					if (i == 0) {
						System.out.println("EvilCPU pierde 3 turnos");
					}
					turno = true;
					i++;
					if (i == 5) {
						turno = false;
						check = false;
						i = 0;
					}

				}

			}
		} while ((posUser != 60 && posCPU != 60)); //Si la posicion es 60, finaliza el bucle

		if (posUser == 60) { //Si alguno de los dos llega a 60, saca este mensaje
			System.out.println("Enhorabuena!!! GANASTE");
		} else {
			System.out.println("Has perdido, pringao.");
		}

		sc.close();

	}

}
