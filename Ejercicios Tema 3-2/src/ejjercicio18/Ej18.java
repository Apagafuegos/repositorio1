package ejjercicio18;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número a ver si es capicúa o no:");
		String num = sc.nextLine();
		String arrayNum[] = num.split("");
		String numRev = "";
		
		for (int i = arrayNum.length - 1; i >= 0; i--) {
			numRev = numRev + arrayNum[i];
		}
		
		System.out.println(numRev);

		if(numRev.equals(num)) {
			System.out.println("El número es capicúa");
		}else {
			System.out.println("El número no es capicúa");
		}

		sc.close();
	}

}
