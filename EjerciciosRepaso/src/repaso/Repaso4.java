package repaso;
import java.util.Scanner;

public class Repaso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer select = 1;
				
		
		if (select==0) {
	
		
		
		System.out.println("¿Cuál es tu número favorito?");	
		Integer n = sc.nextInt();
		
		sc.nextLine(); //Si se pide un str despues de un int, ignora el request, usar esta linea para evitarlo
		
		if (n == 33) {
		System.out.println("Eing?");
		}
			
		System.out.println("¿Cual es tu ciudad favorita?");
		String ciudad = sc.nextLine();
		
		if (ciudad == "Córdoba"){
			System.out.println("Ole tus huevos");
		}
		System.out.println(ciudad + " " + n);
		System.out.println("Modelo 1");
		}

		
		//Otra forma, solamente parseando el número a integer así no teniendo que meter el método
		else {
		System.out.println("¿Cuál es tu número favorito?");	
		Integer n=0;
		n = Integer.parseInt(sc.nextLine());

		if (n == 33) {
		System.out.println("Eing?");
		}
			
		System.out.println("¿Cual es tu ciudad favorita?");
		String ciudad = sc.nextLine();
		
		if (ciudad == "Córdoba"){
			System.out.println("Ole tus huevos");
		}
		System.out.println(ciudad + " " + n);
		System.out.println("Modelo 2");
		
		}
		sc.close();

		
	}

}
