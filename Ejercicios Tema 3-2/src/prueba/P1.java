package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		//char array1[] = new char[palabra.length()]; otra forma
		char[] array1 = new char[palabra.length()];
		ArrayList<String> numeros = new ArrayList<String>();
		System.out.println("Cómo de grande quieres es ArrayList?");
		Integer tamañoArray = sc.nextInt();
		sc.nextLine();
		
		for (Integer i = 0; i < tamañoArray; i++) {
			System.out.println("Introduce la palabra " + (i+1));
			String input = sc.nextLine();
			numeros.add(input);
		}
		System.out.println(numeros.toString());

		for (Integer i = 0; i < array1.length; i++) {
			array1[i] = palabra.charAt(i);
		}
		
		
		Integer arrayMatriz[][] = new Integer[3][3];
		int j = 0;
		
		for (int i = 0; i < 3 && j < 3; i++) {
			
			arrayMatriz[i][j] = i;
			System.out.println(arrayMatriz[i][j]);
			j++;
		}
		
		
		sc.close();
	}

}
