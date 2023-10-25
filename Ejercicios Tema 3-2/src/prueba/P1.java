package prueba;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		String palabra = sc.nextLine();
		char array1 [] = new char[palabra.length()];

		
		for(Integer i = 0; i < array1.length; i++) {
			array1[i]=palabra.charAt(i);
			System.out.println(array1[i]);
			
		}
		
		}

	}

