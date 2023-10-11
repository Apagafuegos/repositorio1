package tema2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		System.out.println("Introduzca números 1 a 1 que quiera sumar (introducir 0 para parar y mostrar la suma)");
		Scanner sc = new Scanner(System.in);
		Integer total = 0;
		Integer n;

		do {
			n = sc.nextInt();
			total = total + n;
		} while (n != 0);

		System.out.println("La suma total es " + total);
	}

}
