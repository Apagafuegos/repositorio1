package ejjercicio15;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		
		System.out.println("Introduce el URL con el siguiente formato: PROTOCOLO://PARTE1.PARTE2.PARTE3");
		Scanner sc = new Scanner(System.in);
		String url = sc.nextLine();
		String urlDividido[] = url.split("//");
		String urlSinProt = urlDividido[1];
		String urlDivididoAux[] = urlSinProt.split("\\.");
		
		for (int i = 0; i < 1; i++) {
			System.out.println(urlDividido[i] + "//");
		}
		
		for (int i = 0; i < urlDivididoAux.length; i++) {
			System.out.println(urlDivididoAux[i]);
		} 
		

	}

}
