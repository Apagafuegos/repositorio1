package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su nombre");
		String nombre = sc.nextLine();
		System.out.println("Introduzca su año de nacimiento");
		Integer añoNacimiento = sc.nextInt();
		
		Integer edad2030 = (2030 - añoNacimiento);
		
		System.out.println("Hola, " + nombre + ",su edad en el año 2030 será " + edad2030);

	}

}
