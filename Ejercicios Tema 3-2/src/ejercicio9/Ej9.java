package ejercicio9;

import java.util.Scanner;

public class Ej9 {

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
			
				for (int j = i+1; j < arrayNum.length; j++) {
					
					if(arrayNum[i] > arrayNum[j]) {
						Integer aux = arrayNum[i];
						arrayNum[i] = arrayNum[j];
						arrayNum[j] = aux;
						
					}
				
			}
		}
		
		
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print(arrayNum[i] + " ");
		}
		sc.close();
	}

}
