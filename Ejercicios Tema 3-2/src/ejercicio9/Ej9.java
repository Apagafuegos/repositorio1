package ejercicio9;

//import java.util.Random;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Random rand = new Random();
		System.out.println("¿Cuantos números vas a meter?");
		Integer longitudArray = sc.nextInt();
		Integer arrayNum[] = new Integer[longitudArray];
		Integer arrayNumReversed[] = new Integer[longitudArray];

		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("Introduce el número " + (i + 1));
			Integer numero = sc.nextInt();
			// Integer numero = rand.nextInt(1,1000);
			arrayNum[i] = numero;
			arrayNumReversed[i] = numero;
		}
		for (int i = 0; i < arrayNum.length; i++) { // Este bucle coge UNA POSICION, NO UN NÚMERO

			for (int j = i + 1; j < arrayNum.length; j++) {
				/*
				 * Este bucle COMPARA LA POSICION ELEGIDA POR EL PRIMER BUCLE con TODAS LAS
				 * POSICIONES POR DELANTE DE LA POSICION DEL PRIMER BUCLE Ejemplo array =
				 * [a1,a2,a3,a4,a5]; el primer bucle coge la posicion a1 y las compara con todas
				 * desde a2 hasta a5 una vez comparadas todas, el primer bucle avanza 1, el
				 * segundo avanza 1, por lo que compara la pos. a2 con todas las posiciones
				 * desde a3 hasta a5
				 */
				if (arrayNum[i] > arrayNum[j]) {
					/*
					 * Ahora, aqui, si el numero en la posicion previa es mayor que cualquiera de
					 * los siguientes, los cambio de sitio. Si no lo es asumo que estan ordenados
					 * entre si, por lo que no hace falta moverlos de sitio.
					 */
					Integer contenedor = arrayNum[i];
					arrayNum[i] = arrayNum[j];
					arrayNum[j] = contenedor;
				}

			}
		}
		for (int i = 0; i < arrayNum.length; i++) {

			for (int j = i + 1; j < arrayNum.length; j++) {
				if (arrayNum[i] < arrayNum[j]) {
					Integer contenedor = arrayNum[i];
					arrayNum[i] = arrayNum[j];
					arrayNum[j] = contenedor;
				}

			}
		}

		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print(arrayNum[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < arrayNumReversed.length; i++) {
			System.out.print(arrayNumReversed[i] + " ");
		}

		sc.close();
	}

}
