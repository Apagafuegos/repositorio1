package ejjercicio22;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		String[] array = palabra.split("");
		
		for (String letra : array) {
			System.out.println(letra);
		}
		

	}

}
