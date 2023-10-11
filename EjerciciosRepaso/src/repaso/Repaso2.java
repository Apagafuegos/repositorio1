package repaso;
import java.util.Scanner;

public class Repaso2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("Deme un número entero:");
		Long n1 = sc.nextLong();
		System.out.println("Deme otro número entero:");
		Long n2 = sc.nextLong();
		
		System.out.println("El resultado de la multiplicación de ambos números es: " + n1*n2);
		
		sc.close();

		
	}

}
