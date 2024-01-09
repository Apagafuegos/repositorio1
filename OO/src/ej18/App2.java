package ej18;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Profesor profesor1 = new Profesor();
		System.out.println("¿Nombre del profesor?");
		profesor1.setNombre(sc.nextLine());
		System.out.println("¿Edad?");
		profesor1.setEdad(sc.nextInt());
		sc.close();

	}

}
