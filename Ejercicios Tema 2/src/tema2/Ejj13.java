package tema2;

import java.util.Scanner;

public class Ejj13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String mensaje = sc.nextLine().trim();
		Integer x = 0;
		Integer y = 5;

		while (y < mensaje.length()) {
			// 0123456789
			System.out.println(mensaje.substring(x, y));
			x += 5;
			y += 5;
		}
		System.out.println(mensaje.substring(x, mensaje.length()));
		sc.close();

	}

}
