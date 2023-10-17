package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número pa ver si es capicua jeje :p");
		String numero = sc.nextLine(), numeroReversed = "";
		char c;
		Integer marcador = numero.length()-1;
		for(Integer i = marcador; i>=0; i--) {
			c = numero.charAt(i);
			numeroReversed = numeroReversed + c;
		}
		
		if(numero.equals(numeroReversed)) {
			System.out.println(numero + " es capicúa :)");
		}else {
			System.out.println(numero + " no es capicúa :c");
		}

		sc.close();
	}

}
