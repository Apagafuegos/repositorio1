package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("*** MENU ***");
		System.out.println("1.Abrir");
		System.out.println("2.Guardar");
		System.out.println("3.Modificar");
		System.out.println("4.Salir");

		Integer seleccion = sc.nextInt();

			do{			
			
			switch (seleccion) {
			case 1:
				System.out.println("Selección: ABRIR");
				break;
			case 2:
				System.out.println("Selección: GUARDAR");
				break;
			case 3:
				System.out.println("Selección: MODIFICAR");
				break;
			case 4:
				break;
			default:
				System.out.println("Seleccion INCORRECTA");
				break;
			}if (seleccion == 4) {
				System.out.println("Bye bye");
			}else {
				System.out.println("*** MENU ***");
			System.out.println("1.Abrir");
			System.out.println("2.Guardar");
			System.out.println("3.Modificar");
			System.out.println("4.Salir");
			seleccion = sc.nextInt();
			}
			
			
			}while (seleccion != 4);
		}
	}

