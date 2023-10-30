package ejjercicio17;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto para convertir a Camel Case");
		String texto = sc.nextLine();
		String textoACamelCase[] = texto.split("");

		for (int i = 0; i < textoACamelCase.length; i++) {

			if (textoACamelCase[i].equals(" ")) {
			} else if (i != 0) {

				if (textoACamelCase[i - 1].equals(" ")) {
					textoACamelCase[i] = textoACamelCase[i].toUpperCase();
				}
				System.out.print(textoACamelCase[i]);

			}else {
				System.out.print(textoACamelCase[i]);
			}
			

		}

	}

}
