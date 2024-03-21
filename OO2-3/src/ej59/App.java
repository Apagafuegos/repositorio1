package ej59;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer cont = 0;
		Geografia g1 = new Geografia();

		do {
			String pais, capital;
			System.out.println("Introduce un pais");
			pais = sc.nextLine();
			System.out.println("Introduce su capital");
			capital = sc.nextLine();
			if (g1.agregarPais(pais, capital))
				cont++;

		} while (cont < 5);
		
		g1.imprimirPaises();
		Double media = g1.calcularLongitudMediaPaises();
		System.out.println(media);
		System.out.println("Introduce una letra para ver los paises cuya capital empieza por esa letra");
		String letra = sc.nextLine().toUpperCase();
		g1.imprimirNumeroPaisesLetra(letra);
		g1.eliminarPaisConCapitalLetra(letra);
		g1.imprimirNumeroPaisesLetra(letra);
		sc.close();

	}

}
