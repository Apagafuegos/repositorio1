package prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		char array1[] = new char[palabra.length()];
		ArrayList<String> random = new ArrayList<String>();
		System.out.println("Cómo de grande quieres es ArrayList?");
		Integer tamañoArray = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < tamañoArray; i++) {
			System.out.println("Introduce la palabra " + (i+1));
			String add = sc.nextLine();
			random.add(add);
		}
		System.out.println(random.toString());

		for (Integer i = 0; i < array1.length; i++) {
			array1[i] = palabra.charAt(i);
			System.out.println(array1[i]);

		}
		
		
		sc.close();
	}

}
