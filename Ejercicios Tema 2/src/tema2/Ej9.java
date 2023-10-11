package tema2;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre completo");
		String nombreCompleto = sc.nextLine().trim();

		Integer sp = nombreCompleto.indexOf(" ");
		Integer sp2 = nombreCompleto.lastIndexOf(" ");
		String nombre = nombreCompleto.substring(0, sp);
		String apellido1 = nombreCompleto.substring(sp, sp2);
		String apellido2 = nombreCompleto.substring(sp2);

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido 1:" + apellido1);
		System.out.println("Apellido 2:" + apellido2);
		
		sc.close();

		// Carlos Santos Expósito

	}

}
