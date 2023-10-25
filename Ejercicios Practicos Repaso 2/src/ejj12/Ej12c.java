package ejj12;

import java.util.Scanner;

public class Ej12c {

	public static void main(String[] args) {

		Integer tamaño = 0;
		Scanner sc = new Scanner(System.in);
		Integer n3 = 0;
		Boolean check = true;
		do {
			System.out.println("Introduzca el tamaño del tablero");
			tamaño = sc.nextInt();
			if ((tamaño <= 0)) {
				System.out.println("No puede ser 0 o menor, introduzca de nuevo");
			}
		} while (!(tamaño != 0));

		for (Integer n1 = 1; n1 <= tamaño; n1++) {// Formacion de cada línea
			for (Integer n2 = 1; n2 <= tamaño; n2++) {

				// Tapa
				if (check) {
					for (n3 = 1; n3 <= 4 + 4 * (tamaño - 1); n3++) //Cada línea tiene 5 caracteres mas 4 multiplicado por el tamaño menos 1
						//caracteres linea = 5+4(n-1); por tanto, necesito generar 5+4(n-1) tapas MENOS los dos espacios del final y principio
					{

						if (n3 == 1) {
							System.out.print(" ");//Espacio del inicio
						} else {
							System.out.print("_");//Normal, solo que en el último no genero nada, viendose el espacio
						}
					}
					if (n3 == 5 + 4 * (tamaño - 1)) {
						System.out.println();//Salto de línea al terminar la tapa
						check = false;//Vuelvo a esta variable auxiliar para que una vez genere la tapa, no la vuelva a crear
						
					}
				}

				// Contenedores de cada linea
				if (n2 == 1) {
					System.out.print("|___|"); // Primer lado de una linea
				} else {
					System.out.print("___|"); // Siguientes lados de la linea
				}

			}
			System.out.println();//salto de línea al acabar con la generacion de contenedores
		}

		sc.close();

	}

}
