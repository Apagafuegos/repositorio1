package ejercicios;
import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		System.out.println("¿Cuál es su edad?");
		Scanner sc = new Scanner(System.in);
		Integer edad = sc.nextInt();
		System.out.println("Su edad es de " + edad + " años.");
		sc.close();

	}

}
