package ejj18;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la palabra para ser revertida jeje :p");
		String palabra = sc.nextLine().toLowerCase(), palabraReversed = "";
		char c;
		Integer marcador = palabra.length()-1;
		for(Integer i = marcador; i>=0; i--) {
			c = palabra.charAt(i);
			palabraReversed = palabraReversed + c;
		}
		System.out.println(palabraReversed);
		

	}

}
