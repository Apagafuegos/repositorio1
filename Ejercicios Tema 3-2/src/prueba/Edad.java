package prueba;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		Double edad = 0.00;
		Double edadTotal = 0.00;
		Integer cont = 0 ;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce edades");
			edad = sc.nextDouble();
			edadTotal = edadTotal + edad;
			if(edad != 0) {
			cont++;}
			
		}while(edad != 0);

		Double edadMedia = (edadTotal)/(cont);
		System.out.println("Has introducido " + cont + " edades y su media es de " + edadMedia);
		
		
	}

}
