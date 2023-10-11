package tema2;

import java.util.Scanner;

public class Ej3Switch {
	private final static double NORMAL = 1.21;
	private final static double REDUCIDO = 1.1;
	private final static double SUPERREDUCIDO = 1.04;
	// Declaro los tipos de IVA

	public static void main(String[] args) {

		Double precioIVA = null;
		// Declaro los tipos de IVA e inicio la variable precioIVA

		Scanner sc = new Scanner(System.in);
		System.out.println("Digame el precio del producto sin IVA");
		Double precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digame el tipo de IVA del producto");
		String tipoDeIVA = sc.nextLine();
		// Scanner para pedir el tipo de iva y el precio del producto sin iva

		switch (tipoDeIVA) {

		// En vez de usar muchos if-else, uso el switch

		case "Normal":
			precioIVA = precio * NORMAL;
			break;
		case "Reducido":
			precioIVA = precio * REDUCIDO;
			break;
		case "Superreducido":
			precioIVA = precio * SUPERREDUCIDO;
			break;
		case "Exento":
			precioIVA = precio;
			break;
		default:
			System.out.println("Tipo de IVA incorrecto");
		}
		System.out.println("El precio con IVA es de " + precioIVA);
		System.out.println("El IVA es " + (precioIVA - precio));
		sc.close();
	}

}
