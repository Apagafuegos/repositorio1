package tema2;

import java.util.Scanner;

public class Ejj14For {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer num; 
	
		do {	
			System.out.println("Introduzca un numero entero entre 0 y 10:");
			num = sc.nextInt();
			if (!(num >= 0 && num <= 10)) {
				System.out.println("Introduzca un número correcto");
			}
		} while (!(num >= 0 && num <= 10));
		
		for(Integer num2=0;num2<=10; num2++) {
			System.out.println(num + " x " + num2 + " = " + num * num2);
			
		}

	}
}