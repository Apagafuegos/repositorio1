package ejercicio8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		
		System.out.println("Cuantos números quieres introducir");
		Scanner sc = new Scanner(System.in);
		Integer tamaño = sc.nextInt();
		Integer[] numeros = new Integer[tamaño];

		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce el " + (i+1) + " número.");
			Integer numero = sc.nextInt();
			numeros[i] = numero;

		}

		Integer inicio = 0;
		for (int fin = numeros.length-1; fin > (numeros.length - 1)/2; fin--) {

			Integer aux = numeros[inicio];
			numeros[inicio] = numeros[fin];
			numeros[fin] = aux;
			
			inicio++;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			
			System.out.println(numeros[i]);
			
		}
		sc.close();
	}

}
