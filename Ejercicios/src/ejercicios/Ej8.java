package ejercicios;
import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {

		System.out.println("Introduzca un número");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		System.out.println("Introduzca otro número, en este caso, decimal");		
		Double b = sc.nextDouble();
		
		Float c = 58.44F;
		
		Long x1 = Long.parseLong(a);
		String x2 = Double.toString(b);
		Integer x3 = b.intValue();
		Long x4 = c.longValue() ;
		
		System.out.println("Los valores son:");
		System.out.println("x1:" + x1);
		System.out.println("x2:" + x2);
		System.out.println("x3:" + x3);
		System.out.println("x4:" + x4);
		
				
		
		
		
		sc.close();

	}

}
