package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre de ciudad 1");
		String ciudad1 = sc.nextLine();
		System.out.println("Introduzca el nombre de ciudad 2");
		String ciudad2 = sc.nextLine();
		System.out.println("Introduzca el nombre de ciudad 3");
		String ciudad3 = sc.nextLine();

		Integer lCiudad1 = ciudad1.length();
		Integer lCiudad2 = ciudad2.length();
		Integer lCiudad3 = ciudad3.length();

		if (lCiudad1 > lCiudad2 && lCiudad1 > lCiudad3 && lCiudad2 > lCiudad3) {

			System.out.println(ciudad3);
			System.out.println(ciudad2);
			System.out.println(ciudad1);
		} else if (lCiudad1 > lCiudad2 && lCiudad1 > lCiudad3 && lCiudad3 > lCiudad2) {

			System.out.println(ciudad2);
			System.out.println(ciudad3);
			System.out.println(ciudad1);
		} else if (lCiudad2 > lCiudad1 && lCiudad2 > lCiudad3 && lCiudad1 > lCiudad3) {

			System.out.println(ciudad3);
			System.out.println(ciudad1);
			System.out.println(ciudad2);
		}
		else if (lCiudad2 > lCiudad1 && lCiudad2 > lCiudad3 && lCiudad3 > lCiudad1) {

			System.out.println(ciudad1);
			System.out.println(ciudad3);
			System.out.println(ciudad2);
		}
		else if (lCiudad3 > lCiudad1 && lCiudad3 > lCiudad2 && lCiudad1 > lCiudad2) {
			
			System.out.println(ciudad2);
			System.out.println(ciudad1);
			System.out.println(ciudad3);
		}
		else if (lCiudad3 > lCiudad1 && lCiudad3 > lCiudad2 && lCiudad2 > lCiudad1) {
			
			System.out.println(ciudad1);
			System.out.println(ciudad2);
			System.out.println(ciudad3);
		}
	}

}
