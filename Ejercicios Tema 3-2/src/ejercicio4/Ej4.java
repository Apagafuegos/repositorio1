package ejercicio4;

import java.util.Scanner;

public class Ej4 {

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
		
		for (int i = arrayNum.length - 1 ; i >= 0; i--) {
			System.out.print(arrayNum[i] + " ");
		}


	}

}
