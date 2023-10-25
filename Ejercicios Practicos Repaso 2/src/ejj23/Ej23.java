package ejj23;

import java.util.Random;
import java.util.Scanner;

public class Ej23 {

	public static void tiradaDado(Integer veces) {

		Random rand = new Random();
		Integer n1 = 0;
		Integer n2 = 0;
		Integer n3 = 0;
		Integer n4 = 0;
		Integer n5 = 0;
		Integer n6 = 0;
		for (Integer n = 0; n < veces; n++) {
			Integer numero = rand.nextInt(1, 7);
			switch (numero) {
			case 1:
				n1++;
				break;
			case 2:
				n2++;
				break;
			case 3:
				n3++;
				break;
			case 4:
				n4++;
				break;
			case 5:
				n5++;
				break;
			case 6:
				n6++;
				break;
			}
		}
		
		System.out.println("El número 1 se ha repetido " + n1 + " veces.");
		System.out.println("El número 2 se ha repetido " + n2 + " veces.");
		System.out.println("El número 3 se ha repetido " + n3 + " veces.");
		System.out.println("El número 4 se ha repetido " + n4 + " veces.");
		System.out.println("El número 5 se ha repetido " + n5 + " veces.");
		System.out.println("El número 6 se ha repetido " + n6 + " veces.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¿Cuántas veces quieres tirar el dado?");
		Integer veces = sc.nextInt();

		tiradaDado(veces);
		sc.close();

	}

}
