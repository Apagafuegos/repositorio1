package repaso;
import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {

		System.out.println("¿Cuál es el radio de la circunferencia?");
		Scanner sc = new Scanner(System.in);
		Double r = sc.nextDouble();
		System.out.println("La longitud de la circunferencia es: " + 2 * Math.PI * r);
		System.out.println("El área de la circunferencia es: " + Math.PI * r * r);
		
		sc.close();
		
		
		
	}

}
