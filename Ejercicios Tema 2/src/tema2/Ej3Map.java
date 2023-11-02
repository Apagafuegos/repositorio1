package tema2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej3Map {
	public static void main(String[] args) {

		// Declaro los tipos de IVA e inicio la variable precioIVA
		Scanner sc = new Scanner(System.in);
		System.out.println("Digame el precio del producto sin IVA");
		Double precio = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digame el tipo de IVA del producto");
		String tipoDeIVA = sc.nextLine().toLowerCase();
		// Scanner para pedir el tipo de iva y el precio del producto sin iva

		Map<String, Double> IVA;
		IVA = new HashMap<>();
		IVA.put("normal", 1.21);
		IVA.put("reducido", 1.1);
		IVA.put("superreducido", 1.04);

		Double porcIVA = IVA.get(tipoDeIVA);

		System.out.println("El precio con IVA es de " + precio * porcIVA);
		System.out.println("El IVA es " + ((precio * porcIVA) - precio));
		sc.close();
	}
}
