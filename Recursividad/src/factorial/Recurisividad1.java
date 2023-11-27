package factorial;

import java.util.Scanner;

public class Recurisividad1 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial");
		Integer num = sc.nextInt();
		System.out.println("El factorial de " + num + " es " + factorial(num));
		sc.close();

	}

	public static Integer factorial(Integer numero) throws Exception {
		if (numero < 0) {
			throw new Exception("No puede ser menor que 0");
		} else if (numero == 0) {
			return 1;
		} else {
			return numero * factorial(numero - 1);
		}
	}

}
