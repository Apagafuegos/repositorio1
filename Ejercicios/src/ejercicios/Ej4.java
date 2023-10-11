package ejercicios;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		System.out.println("¿En qué año nació?");
		Scanner sc = new Scanner(System.in);
		Integer año = sc.nextInt();
		System.out.println("¿En que año vivimos?");
		Integer añoact = sc.nextInt();
		System.out.println("Su edad es de " + (añoact - año) + " años." );
		sc.close();
	}

}
