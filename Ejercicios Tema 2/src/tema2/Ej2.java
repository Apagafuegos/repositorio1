package tema2;

import java.util.Scanner;

public class Ej2 {
	
	public static void main(String[] args) {

		System.out.println("¿Cuál es su altura (en metros)?");
		Scanner sc = new Scanner(System.in);
		Double h = sc.nextDouble();
		
		System.out.println("¿Cuál es su peso (en kg)?");
		Integer w = sc.nextInt();
		//Abro scanner y pido la altura y el peso
		
		Double IMC = w/(h*h);
		//Calculo el IMC
		
		System.out.println("Su IMC es de " + IMC);//Print del IMC
		
		if (IMC<18.5) {
			System.out.println("Tiene un PESO INFERIOR AL NORMAL");
		}
		else if(IMC>=18.5 && IMC<25) {
			System.out.println("Tiene un PESO NORMAL");
		}
		else if(IMC>=25 && IMC<=30) {
			System.out.println("Tiene un PESO SUPERIOR A LO NORMAL");
		}
		else {
			System.out.println("Tiene OBESIDAD");
		}
		sc.close();
		
		//Bucle para determinar el rango en el que se encuentra

	}

	
	
	
	
	
}
