package calculadora;

import java.util.Scanner;

public class Calculadora {
	
	static final String SUMAR = "ADD";
	static final String RESTAR = "SUB";
	static final String MULTIPLICAR = "MUL";
	static final String DIVIDIR = "DIV";
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String operacion = "";
		System.out.println("Introduce el num. 1");
		Integer n1 = sc.nextInt();
		System.out.println("Introduce el num. 2");
		Integer n2 = sc.nextInt();
		System.out.println("¿Qué operación quieres realizar?");
		System.out.println(SUMAR + " " + RESTAR + " " + MULTIPLICAR + " " + DIVIDIR );
		sc.nextLine();
		do {
			operacion = sc.nextLine().toUpperCase();
			if(!(operacion.contains(RESTAR)||operacion.contains(SUMAR) || operacion.contains(MULTIPLICAR)|| operacion.contains(DIVIDIR))) {
				System.err.println("OPCIÓN NO CONTEMPLADA");
			}
		}while(!(operacion.contains(RESTAR)||operacion.contains(SUMAR) || operacion.contains(MULTIPLICAR)|| operacion.contains(DIVIDIR)));

		Integer resultado = calcular(operacion, n1, n2);
		System.out.println("El resultado es " + resultado);
		sc.close();
	}
	
	private static Integer calcular(String operacion, Integer n1, Integer n2) {
		switch (operacion) {
		case SUMAR:
			return sumar(n1,n2);
		case RESTAR:
			return restar(n1,n2);
		case MULTIPLICAR:
			return multiplicar(n1,n2);
		case DIVIDIR:
			return dividir(n1,n2);
		default:
			return -1;
		}
	}

	public static Integer sumar(Integer n1, Integer n2) {
		return n1 + n2;
	}
	
	public static Integer restar(Integer n1, Integer n2) {
		return n1 - n2;
	}
	
	public static Integer multiplicar(Integer n1, Integer n2) {
		return n1 * n2;
	}
	
	public static Integer dividir(Integer n1, Integer n2) {
		return  (n1 / n2);
	}
	
	

}
