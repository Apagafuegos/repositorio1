package ejercicios;
import java.util.Scanner;

public class Ej1 {
	
	public static void main(String[] args) {
		
		System.out.println("Cuál es tu nombre?");
		Scanner sc = new Scanner(System.in);
		String nomb = sc.nextLine();
		System.out.println("¿Cual es su apellido?");
		String apll = sc.nextLine();
		System.out.println("Su nombre completo es " + nomb + " " + apll);
		sc.close();
		
		
	}
}
