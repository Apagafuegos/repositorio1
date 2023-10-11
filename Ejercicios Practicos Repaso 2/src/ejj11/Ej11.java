package ejj11;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		Integer n1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		Integer n2 = sc.nextInt();

		System.out.println("*** MENU ***");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		System.out.println("4.Dividir");
		System.out.println("0.Salir");

		Integer seleccion = sc.nextInt();

		do {

			if (n2 == 0 && seleccion == 4) {
				seleccion = 5;
			}

			switch (seleccion) {
			case 1:
				System.out.println("La suma de los dos números es " + n1 + n2);
				break;
			case 2:
				System.out.println("La resta de los dos números es " + (n1 - n2));
				break;
			case 3:
				System.out.println("La multiplicación de los dos números es " + n1 * n2);
				break;
			case 4:
				System.out.println("La división de los dos números es " + n1 / n2);
				break;
			case 5:
				System.out.println("El segundo número introducido es 0, por lo que la división no es posible.");
				break;
			case 0:
				break;
			default:
				System.out.println("Seleccion INCORRECTA");
				break;
			}
			if (seleccion == 0) {
				System.out.println("Programa finalizado");
			} else {
				System.out.println("*** MENU ***");
				System.out.println("1.Sumar");
				System.out.println("2.Restar");
				System.out.println("3.Multiplicar");
				System.out.println("4.Dividir");
				System.out.println("0.Salir");
				seleccion = sc.nextInt();
			}

		} while (seleccion != 0);

	}

}
