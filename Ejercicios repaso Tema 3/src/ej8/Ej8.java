package ej8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu HTML:");
		String codigo = sc.nextLine();
		String[] contenido = codigo.split("");
		Boolean dentroEtiqueta = false;
		Boolean fueraEtiqueta = false;

		System.out.println("Texto extraido:");
		for (int i = 0; i < contenido.length; i++) {
			if (contenido[i].equals("<")) {
				dentroEtiqueta = true;
			} else if (contenido[i].equals(">")) {
				fueraEtiqueta = true;
				dentroEtiqueta = false;
			} else if (fueraEtiqueta && !dentroEtiqueta) {
				System.out.print(contenido[i]);
			}
		}

	}

}
