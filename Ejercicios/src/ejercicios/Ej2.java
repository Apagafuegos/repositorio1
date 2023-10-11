package ejercicios;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		System.out.println("Cuál es tu nombre?");
		Scanner sc = new Scanner(System.in);
		String nomb = sc.nextLine();
		System.out.println("Bienvenido, " + nomb);
		System.out.println("De dónde eres?");
		String local = sc.nextLine();
		System.out.println("¿Cómo se vive en " + local + "?");
		String vida = sc.nextLine();
		System.out.println("Gracias, un saludo.");
		sc.close();
	}

}
