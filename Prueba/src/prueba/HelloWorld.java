package prueba;

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args) {
		//Prints
//		System.out.println("Hello Mr. Worldwide");
//		System.out.println("Pito jeje 33 " + 33);
		
		//Variables y definición de ellas
//		String lonsezTreintaTres;
//		lonsezTreintaTres = "Pito";
//		System.out.println(lonsezTreintaTres);
//				
//		String alonso33 = lonsezTreintaTres;;
//		Integer añoDeLa33 = 2023;
//		Double noSe = 544.44;
//		lonsezTreintaTres = "La 33 vendrá en Japón.";
//		System.out.println(lonsezTreintaTres);
//		System.out.println(alonso33);
//		System.out.println("La 33 vendrá en el año " + añoDeLa33 + " y " + lonsezTreintaTres);
//		System.out.println(noSe + añoDeLa33);
//		System.out.println(noSe - añoDeLa33);
//		System.out.println(noSe * añoDeLa33);
//		System.out.println(noSe / añoDeLa33);
//		
		//1.Pedir nombre
		//2.Leer input
		//3.Escribir el mensaje con el input
		//1
		System.out.println("¿Cuál es tu nombre?");
		//2
		Scanner sc = new Scanner(System.in);		
		String nombre = sc.nextLine();
		//3
		System.out.println("Hola," + nombre);
		//cerrado del escaner
		
		System.out.println("Dime tu edad:");
		Integer edad= sc.nextInt();
		
		if (edad>= 18) {
			
			System.out.println("Eres mayor de edad");
		}
		
		else if (edad >= 12) {
			
			System.out.println("¿COMO?, QUE TIENES " + edad + " NA NA YO A TI TE TENGO QUE CONOCER EN PERSONA");
		}
		else {
			System.out.println("Que coño haces aqui, mocoso");
		}
		sc.close();
		
		
		
		
		
	}
	 
	
}

