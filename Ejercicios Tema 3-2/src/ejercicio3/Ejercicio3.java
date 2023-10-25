package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos números vas a meter?");
		Integer longitudArray = sc.nextInt();
		Integer arrayNum[] = new Integer[longitudArray];
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("Introduce el número " + (i+1));
			Integer numero = sc.nextInt();
			arrayNum[i] = numero;
		}
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print(arrayNum[i] + " ");
		}

	}

}
