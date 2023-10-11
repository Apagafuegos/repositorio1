package tema2;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime en que año naciste.");
		Integer Año = sc.nextInt();
		//Abro sccanner
		
		if (Año > 1883 && Año < 2024) {
			
			if (Año >= 1883 && Año <= 1900) {
				System.out.println("Usted pertenece a la Generación Perdida");
				}
			else if (Año> 1900 && Año <= 1927) {
				System.out.println("Usted pertenece a la Generación Grandiosa");
			}
			else if (Año> 1927 && Año <= 1945) {
				System.out.println("Usted pertenece a la Generación Silenciosa");
			}
			else if (Año> 1945 && Año <= 1964) {
				System.out.println("Usted pertenece al Baby Boom");
			}
			else if (Año> 1964 && Año <= 1980) {
				System.out.println("Usted pertenece a la Generación X");
			}
			else if (Año> 1980 && Año <= 1996) {
				System.out.println("Usted pertenece a la Generación Millenial");
			}
			else if(Año> 1996 && Año <= 2012) {
				System.out.println("Perteneces a la Generación Z");									
			}
			else if (Año> 2012 && Año <= 2023) {
				System.out.println("Perteneces a Generación Alfa");
			}
			
		}
		
		else {
			System.out.println("Año incorrecto, o estas como una momia o eres un espermatozoide.");
		}
		
		sc.close();
		
	}

}
