package tema2;

import java.util.Scanner;

public class Ejj11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String email;
		Integer aux;
		Integer aux2;

		do {
			System.out.println("Introduzca su email");
			email = sc.nextLine();
			aux = email.indexOf("@");
			aux2 = email.indexOf(".");
			if ((!(email.contains("@")) || !(email.contains(".")) || !(aux2 != aux+ 1)||email.endsWith("."))) {
				System.out.println("Formato de email incorrecto");
			}
		} while ((!(email.contains("@")) || !(email.contains(".")) || !(aux2 != aux + 1)||email.endsWith(".")));

		System.out.println("Bienvenido");
		sc.close();
	}

}
