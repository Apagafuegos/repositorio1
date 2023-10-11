package ejercicios;
import java.util.Scanner;
public class Ej6 {

	
	public final static Double IVA = 1.21;
	public static void main(String[] args) {
		
		System.out.println("¿Cuál es el precio del producto sin IVA?");
		Scanner sc = new Scanner(System.in);
		Double  precio = sc.nextDouble();
		System.out.println("El precio con IVA es de " + precio*IVA);
		sc.close();
	}

}
