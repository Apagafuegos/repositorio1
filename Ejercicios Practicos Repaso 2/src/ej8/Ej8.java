package ej8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		String texto = "";
		String textoOut = "";
		Boolean c1 = null;
		Boolean c2 = null;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Introduzca un texto");
			texto = sc.nextLine();
			c1 = !(texto.endsWith("hastaluego"));
			c2 = !(texto.startsWith("hola"));

		}

		while (c1 || c2);

		if ((texto.endsWith("hastaluego") && (texto.startsWith("hola")))) {
			Integer a = texto.indexOf("hola") + 4;
			Integer b = texto.lastIndexOf("hastaluego");
			textoOut = texto.substring(a, b);
			System.out.println("Entendido. Mensaje:" + textoOut);
		}
		sc.close();
	}

}
