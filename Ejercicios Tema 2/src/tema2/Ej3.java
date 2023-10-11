package tema2;

import java.util.Scanner;

public class Ej3 {

	private final static double NORMAL = 1.21;
	private final static double REDUCIDO = 1.1;
	private final static double SUPERREDUCIDO = 1.04;

	// Declaro tipos de iva
	public static void main(String[] args) {

		Double precioIVA = null;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digame el precio del producto sin IVA");
		Double precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digame el tipo de IVA del producto");
		String tipoDeIVA = sc.nextLine();
		// Creo e inicio scanner

		if (tipoDeIVA.equalsIgnoreCase("Normal")) {
			precioIVA = precio * NORMAL;
		} else if (tipoDeIVA.equalsIgnoreCase("Reducido")) {
			precioIVA = precio * REDUCIDO;
		} else if (tipoDeIVA.equalsIgnoreCase("Superreducido")) {
			precioIVA = precio * SUPERREDUCIDO;
		} else if (tipoDeIVA.equalsIgnoreCase("Exento")) {
			precioIVA = precio;
		} else {
			System.out.println("Tipo de IVA no correcto.");
		}

		System.out.println("El precio del producto con IVA es " + precioIVA);
		System.out.println("El IVA es " + (precioIVA - precio));
		// Imprimo el total y el iva por si solo

		sc.close();
	}

}
