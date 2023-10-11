package ejj23;

import java.util.Random;
import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("¿Cuántas veces quieres tirar el dado?");
		Integer veces = sc.nextInt();
		
		for(Integer n = 0; n<=veces;n++) {
			Integer numero = rand.nextInt(1,7);
			System.out.println(numero);
		}

	}

}
