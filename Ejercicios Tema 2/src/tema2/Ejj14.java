package tema2;

import java.util.Scanner;

public class Ejj14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer num;
		Integer num2 = 0;
		System.out.println("Introduzca un numero entero entre 0 y 10:");
		
		num = sc.nextInt();

		do {
			System.out.println(num + " x " + num2 + " = " + num * num2);
			++num2;
		} while (num2 <= 10);
		
		//Hacer usando bucle for
		//Comentar TODOS LOS EJERCICIOS

	}

}
