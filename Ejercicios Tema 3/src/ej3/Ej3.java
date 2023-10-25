package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número cualquiera");
		Integer peticion = 5;

		for (Integer n = 1; n <= peticion; n++) {
			for (Integer n2 = 1; n2 <= 9; n2++) {
				if(n2 % n ==0)
				System.out.print(n2);
			}
			System.out.println();
		}
		sc.close();
	}

}
