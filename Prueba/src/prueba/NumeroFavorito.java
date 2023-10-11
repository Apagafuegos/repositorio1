package prueba;

import java.util.Scanner;
public class NumeroFavorito {

	public static void main(String[] args) {
		
		System.out.println("¿Cuál es tu número favorito?");
		Scanner lector = new Scanner(System.in);
		Integer numero = lector.nextInt();
		System.out.println("Tu numero favorito es el " + numero + ", el cuadrado del mismo es " + numero*numero + "." );
		lector.close();
		

	}

}
