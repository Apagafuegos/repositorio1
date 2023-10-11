package ejj10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {

//		PROTOCOLO://PARTE1.PARTE2.PARTE3
		Scanner sc = new Scanner(System.in);
		String url = "";

		do {
			System.out.println(
					"Introduzca una dirección web con el siguiente formato(PROTOCOLO://PARTE1.PARTE2.PARTE3):");
			url = sc.nextLine();
			if (!(url.contains("//")) || !(url.contains(":"))) {
				System.out.println("URL no correcto, introduzca de nuevo");
			}
		} while (!(url.contains("//")) || !(url.contains(":")));

		String protocolo = url.substring(0, url.indexOf("//") + 2);
		String aux = url.substring(url.indexOf("//") + 2);
		String parte1 = aux.substring(0, aux.indexOf("."));
		String parte2 = aux.substring(aux.indexOf(".") + 1, aux.lastIndexOf("."));
		String parte3 = aux.substring(aux.lastIndexOf(".") + 1);

		System.out.println(protocolo);
		System.out.println(parte1);
		System.out.println(parte2);
		System.out.println(parte3);
	}

}
