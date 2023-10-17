package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = sc.nextLine().toLowerCase().trim();
		Integer wCount = 0;
		String aux = "";
		String aux2 = "";
		String aux3 = "";
		String listaA = "";
		Integer i = 0;
		Boolean check = true;

		while (check) {
			if (i == 0) {
				aux = frase.substring(0, frase.indexOf(" "));
				aux2 = frase.substring(frase.indexOf(" ") + 1);
				if(aux.indexOf("a")!=-1) {
					listaA = listaA + aux.substring(aux.indexOf("a"), aux.indexOf("a")+1);
					}
				i++;
				wCount++;
			} else {
				aux = aux2;
				if (aux.indexOf(" ") != -1) {
					aux2 = aux.substring(aux.indexOf(" ") + 1);
					aux3 = aux.substring(0, 1).toUpperCase();
					if(aux.indexOf("a")!=-1) {
					listaA = listaA + aux.substring(aux.indexOf("a"), aux.indexOf("a")+1);
					}
					aux = aux.substring(1, aux.indexOf(" "));
					wCount++;
				} else {
					aux3 = aux.substring(0, 1).toUpperCase();
					if(aux.indexOf("a")!=-1) {
						listaA = listaA + aux.substring(aux.indexOf("a"), aux.indexOf("a")+1);
						}
					aux = aux.substring(1);
					wCount++;
					check = false;
				}

			}

		}

		System.out.println(wCount);
		System.out.println(listaA.length());
	}
}
