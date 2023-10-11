package ejercicios;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		System.out.println("¿Cuánto te gustaría ganar al año?");
		Scanner sc = new Scanner(System.in);
		Integer sueldo = sc.nextInt();
		System.out.println("Tu sueldo sería de " + sueldo/12 + "$ mensuales.");
		sc.close();
	}

}
