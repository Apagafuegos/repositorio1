package ejj14;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String contraseña = "";

		do {
			System.out.println("Introduzca una contraseña de al menos 8 caracteres");
			contraseña = sc.nextLine().toLowerCase();
			if (contraseña.length() < 8) {
				System.out.println("Longitud no correcta");
			}

		} while (contraseña.length() < 8);

		String contraseñaTrans = contraseña.replace("a", "4").replace("e", "3").replace("i", "1").replace("o", "0").replace("t", "7");

		System.out.println(contraseñaTrans);

	}

}
