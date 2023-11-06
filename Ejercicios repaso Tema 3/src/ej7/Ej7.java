package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu telegrama");
		String mensaje = sc.nextLine();
		String[] telegrama = mensaje.split(" ");
		Double precioTotal = 0.00;

		for (int i = 0; i < telegrama.length; i++) {
			if (telegrama[i].equals("STOP")) {
			} else {
				precioTotal += 0.24;
			}
		}

		System.out.println("El precio será de " + precioTotal + " euros.");
	}

}
