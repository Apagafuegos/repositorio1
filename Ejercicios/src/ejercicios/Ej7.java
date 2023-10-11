package ejercicios;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {

		System.out.println("¿Cuál es su altura (en metros)?");
		Scanner sc = new Scanner(System.in);
		Double h = sc.nextDouble();
		
		System.out.println("¿Cuál es su peso (en kg)?");
		Integer w = sc.nextInt();
		
		System.out.println("Su IMC es de " + (w/(h*h)));
		sc.close();

	}

}
