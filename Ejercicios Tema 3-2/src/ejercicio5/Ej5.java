package ejercicio5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer maximo = 0;
		Integer minimo = 0;
		Integer posMax = 0;
		Integer posMin = 0;
		System.out.println("¿Cuantos números vas a meter?");
		Integer longitudArray = sc.nextInt();
		Integer arrayNum[] = new Integer[longitudArray];
		
		for (int i = 0; i < arrayNum.length; i++) {
			System.out.println("Introduce el número " + (i+1));
			Integer numero = sc.nextInt();
			arrayNum[i] = numero;
		}
		
		for (int j = 0; j < arrayNum.length; j++) {
			
			if(j == 0) {
				maximo = arrayNum[j];
				minimo = arrayNum[j];
				posMax = j + 1;
				posMin = j + 1;
			}else if((arrayNum[j] > maximo) ||(arrayNum[j] < minimo) ) {
				if(arrayNum[j] > maximo) {
					maximo = arrayNum[j];
					posMax = j + 1;
				}else {
					minimo = arrayNum[j];
					posMin = j + 1;
				}
			}
		}
		
		for (int i = arrayNum.length - 1 ; i >= 0; i--) {
			System.out.print(arrayNum[i] + " ");
		}
		System.out.println();
		System.out.println("El número menor de los introducidos es " + minimo + " y fue introducido en el " + posMin + " lugar.");
		System.out.println("El número mayor de los introducidos es " + maximo + " y fue introducido en el " + posMax + " lugar.");

	}

}
