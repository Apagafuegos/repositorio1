package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el término del que quieres el valor");
		Integer termino = sc.nextInt();
		System.out.println("Introduce cuantos terminos quieres de la sucesión total");
		Integer terminosTotales = sc.nextInt();
		Integer[] sucesion = sucesionCompleta(terminosTotales);
		System.out.println("El término numero " + termino + " de la sucesión es " + fibonacci(termino));
		for (Integer terminoIndividual : sucesion) {
			System.out.print(terminoIndividual + " ");
		}
		sc.close();
	}

	public static Integer fibonacci(Integer numTermino) {
		// Calcula el n-esimo y el n-1-esimo termino
		if (numTermino == 0) {
			return 0;
		} else if (numTermino == 1) {
			return 1;
		}
		return fibonacci(numTermino - 1) + fibonacci(numTermino - 2);
		
	}
	
	public static Integer[] sucesionCompleta (Integer terminos) {
		Integer[] sucesionTotal = new Integer[terminos]; 
		for (int i = 0; i < sucesionTotal.length; i++) {
			sucesionTotal[i] = fibonacci(i);
		}
		return sucesionTotal;
	}

}
