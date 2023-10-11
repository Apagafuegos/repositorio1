package ejj12;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {

		Integer tamaño = 0;
		Scanner sc = new Scanner(System.in);
		Integer n3 = 1;
		do {
			System.out.println("Introduzca el tamaño del tablero");
			tamaño = sc.nextInt();
			if ((tamaño <= 0)) {
				System.out.println("No puede ser 0 o menor, introduzca de nuevo");
			}
		} while (!(tamaño != 0));

		for (Integer n1 = 1; n1 <= tamaño; n1++) {//Formacion de cada línea
			for (Integer n2 = 1; n2 <= tamaño; n2++) {
				if (n2 == 1) {
					while (n3 <= tamaño) {
						if (n3 == 1 && tamaño !=1) { //Si es el primer caracter y si el tamaño NO es 1, general
							System.out.print(" ");
						}else if(n3 == 1 && tamaño == 1) { //Si el tablero es de 1
							System.out.print(" ___");
						}
						else if (n3 == tamaño) {//Si es la última fila
							System.out.print("_ ");
						} else {
							System.out.print("______");//Cualquier otra fila
						}

						n3++;
					}
					if (n3 == tamaño + 1) {
						System.out.println();
						n3++;
					}

					System.out.print("|___|"); //Primer lado de una linea
				} else {
					System.out.print("___|"); //Siguientes lados de la linea
				}

			}
			System.out.println();
		}

		sc.close();
	}

}
