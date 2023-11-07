package ej1;

import java.util.Random;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("¿Cuántas veces vas a tirar los dados?");
		Integer numTiradas = sc.nextInt();
		Double[] probabilidades = new Double[11];

		for (Integer i = 0; i <= numTiradas; i++) {
			
			for (int k = 0; k < probabilidades.length; k++) {
				probabilidades[k] = 0.00;
			}

			for (int j = 0; j < numTiradas; j++) {
				Integer dado1 = rand.nextInt(1, 7);
				Integer dado2 = rand.nextInt(1, 7);
				Integer dadoTotal = dado1 + dado2;

				switch (dadoTotal) {

				case 2:
					probabilidades[0]++;
					break;
				case 3:
					probabilidades[1]++;
					break;
				case 4:
					probabilidades[2]++;
					break;
				case 5:
					probabilidades[3]++;
					break;
				case 6:
					probabilidades[4]++;
					break;
				case 7:
					probabilidades[5]++;
					break;
				case 8:
					probabilidades[6]++;
					break;
				case 9:
					probabilidades[7]++;
					break;
				case 10:
					probabilidades[8]++;
					break;
				case 11:
					probabilidades[9]++;
					break;
				case 12:
					probabilidades[10]++;
					break;
				}

			}

			for (int j = 0; j < probabilidades.length; j++) {

				probabilidades[j] = (probabilidades[j] / numTiradas)*100;
			}

		}

		System.out.println("La probabilidad de cada número es");
		for (int j = 0; j < probabilidades.length; j++) {
			System.out.print("La del número " + (j + 2) + " es: ");
			System.out.println(probabilidades[j]);
		}
	}

}
