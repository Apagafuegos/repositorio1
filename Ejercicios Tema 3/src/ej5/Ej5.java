package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		Integer wCount = 0, i = 0;
		String aux = "", listaA = "", aux2 = "", frase = sc.nextLine().toLowerCase().trim();
		Boolean check = true;

		while (check) {

			if (frase.indexOf(" ") != -1) {
				if (i == 0) {
					aux = frase.substring(0, frase.indexOf(" ")); // Separa las palabras por espacios
					aux2 = frase.substring(frase.indexOf(" ") + 1);
					if (aux.indexOf("a") != -1) {
						listaA = listaA + aux.substring(aux.indexOf("a"), aux.indexOf("a") + 1);
					}
					i++;
					wCount++; // Cada vez que separa una, añade 1 a la cuenta
				} else if (i != 0) {
					aux = aux2.substring(0, aux2.indexOf(" "));
					aux2 = aux2.substring(aux2.indexOf(" ") + 1);
					if (aux2.indexOf(" ") != -1) {
						if (aux.indexOf("a") != -1) {
							listaA = listaA + aux.substring(aux.indexOf("a"), aux.indexOf("a") + 1);
							if (aux.lastIndexOf("a") != aux.indexOf("a")) {
								listaA = listaA + aux.substring(aux.lastIndexOf("a"), aux.lastIndexOf("a") + 1);
							}
						}
						wCount++;
					} else if (aux2.indexOf(" ") == -1) {
						if (aux.indexOf("a") != -1) {
							listaA = listaA + aux.substring(aux.indexOf("a"), aux.indexOf("a") + 1);
							if (aux.lastIndexOf("a") != aux.indexOf("a")) {
								listaA = listaA + aux.substring(aux.lastIndexOf("a"), aux.lastIndexOf("a") + 1);
							}
						}
						if (aux2.indexOf("a") != -1) {
							listaA = listaA + aux2.substring(aux2.indexOf("a"), aux2.indexOf("a") + 1);
							if (aux2.lastIndexOf("a") != aux2.indexOf("a")) {
								listaA = listaA + aux2.substring(aux2.lastIndexOf("a"), aux2.lastIndexOf("a") + 1);
							}
						}
						wCount++;
						wCount++;
						check = false;
					}

				}

			} else {
				wCount = 1;
				if (frase.indexOf("a") != -1) {
					listaA = listaA + frase.substring(frase.indexOf("a"), frase.indexOf("a") + 1);
					if (frase.lastIndexOf("a") != frase.indexOf("a")) {
						listaA = listaA + frase.substring(frase.lastIndexOf("a"), frase.lastIndexOf("a") + 1);
					}
					check = false;
				}
			}

		}

		System.out.println("La frase introducida tiene " + wCount + " palabras y la letra A se repite " + listaA.length() + " veces.");
	}
}
