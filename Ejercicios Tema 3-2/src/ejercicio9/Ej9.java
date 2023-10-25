package ejercicio9;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos números vas a meter?");
		Integer longitudArray = sc.nextInt();
		Integer arrayNum[] = new Integer[longitudArray];
		Integer arrayNumAux[] = new Integer[longitudArray];
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("Introduce el número " + (i+1));
			Integer numero = sc.nextInt();
			arrayNum[i] = numero;
			arrayNumAux[i] = numero;
		}
		for (int i = 1; i < arrayNumAux.length; i++) {
			
				for (int j = 0; j < i; j++) {
					
					if(arrayNumAux[i] < arrayNum[j]) {
						arrayNum[j] = arrayNumAux[i];
					}else if(j<arrayNum.length - 1){
						arrayNum[j+1] = arrayNumAux[i];
					}
				
			}
//			if(arrayNumAux[i+1] < arrayNum[i] && i < arrayNum.length) {
//				arrayNum[i] = arrayNumAux[i+1];
//				arrayNum[i+1] = arrayNum[i];
//				
//			}
		}
		
		
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.print(arrayNum[i] + " ");
		}

	}

}
