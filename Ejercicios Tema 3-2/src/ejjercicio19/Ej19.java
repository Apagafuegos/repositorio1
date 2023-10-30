package ejjercicio19;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase");
		String frase = sc.nextLine().toLowerCase();
		String arrayFrase [] = frase.split("");
		Integer wCount = 1;
		Integer aCount = 0;
		
		for (int i = 0; i < arrayFrase.length; i++) {
			
			if(arrayFrase[i].equals(" ")) {
				wCount++;
			}else if(arrayFrase[i].equals("a")) {
				aCount++;
			}
			
		}
		
		System.out.println("La frase tiene " + wCount + " palabras y la letra A aparece en " + aCount + " ocasiones.");

	}

}
