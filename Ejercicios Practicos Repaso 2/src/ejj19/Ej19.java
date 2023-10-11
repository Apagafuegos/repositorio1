package ejj19;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer seleccion = 0;
		Double cantidad = 0.00;		
		System.out.println("1 - Pesetas a Euros");
		System.out.println("2 - Euros a Pesetas");
		System.out.println("3 - Salir");
		seleccion = sc.nextInt();
			
		do {
			switch (seleccion) {
			case 1:
				System.out.println("Introduce la cantidad de pesetas a convertir");
				cantidad = sc.nextDouble();
				System.out.println(cantidad + " pesetas son " + cantidad/166.386 + " euros.");
				break;
			case 2:
				System.out.println("Introduce la cantidad de euros a convertir");
				cantidad = sc.nextDouble();
				System.out.println(cantidad + " euros son " + cantidad*166.386 + " pesetas.");
				break;
			case 3:
				break;
			default:
				System.out.println("Seleccion INCORRECTA");
				break;
			}
			
			if(seleccion == 3) {
				System.out.println("Finalización de programa");
			}else {
				System.out.println("1 - Pesetas a Euros");
				System.out.println("2 - Euros a Pesetas");
				System.out.println("3 - Salir");
				seleccion = sc.nextInt();
				if(seleccion == 3) {
					System.out.println("Finalización de programa");
				}
			}
			
			
		}while(seleccion !=3);
		
	}

}
