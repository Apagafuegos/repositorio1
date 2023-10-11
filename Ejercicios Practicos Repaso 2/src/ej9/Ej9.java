package ej9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		String texto = "";
		String textoOut = "";
		Boolean c1 = null;
		Boolean c2 = null;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Introduzca un texto");
			texto = sc.nextLine();
			c1 = !(texto.endsWith("adios"));
			c2 = !(texto.startsWith("hola"));

			if (texto.endsWith("hastaluego") && (texto.startsWith("hola"))) {
				Integer a = texto.lastIndexOf("hola") + 4;
				Integer b = texto.lastIndexOf("hastaluego");
				textoOut = texto.substring(a, b);
				System.out.println("Mensaje:" + textoOut);
			}

		}

		while (c1 || c2);

		if ((texto.endsWith("adios") && (texto.startsWith("hola")))) {
			Integer a = texto.lastIndexOf("hola") + 4;
			Integer b = texto.lastIndexOf("adios");
			textoOut = texto.substring(a, b);
			System.out.println("Entendido. Mensaje:" + textoOut);
		}

	}

}
