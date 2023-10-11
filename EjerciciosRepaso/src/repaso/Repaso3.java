package repaso;

import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		System.out.println("Deme un número entero:");
		String n1 = sc.nextLine();
		System.out.println("Deme otro número entero:");
		String n2 = sc.nextLine();
		
		Double x = Double.parseDouble(n1);
		Double y = Double.parseDouble(n2);
		
		System.out.println("El resultado de la multiplicación de ambos números es: " + x*y);
		
		sc.close();
	}

}
