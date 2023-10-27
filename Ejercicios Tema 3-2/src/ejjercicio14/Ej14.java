package ejjercicio14;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = sc.nextLine();
		
		String[] nombreSeparado = nombre.split(" ");
		
		for (int i = 0; i < nombreSeparado.length; i++) {
			System.out.println(nombreSeparado[i]);
		}
		
		sc.close();
	}

}
