package ejj20;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero cualquiera");
		Integer peticion = sc.nextInt();

		for (Integer n1 = 1; n1 <= peticion; n1++) {
			for (Integer n2 = 1; n2 <= peticion; n2++) {
				if(n2==n1) {
					System.out.print("*" + " ");
				}else {
					System.out.print("-" + " ");
				}
				
			}
			System.out.println();
		}
		

	}

}
