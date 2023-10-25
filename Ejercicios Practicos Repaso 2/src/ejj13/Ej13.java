package ejj13;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String mensaje = "";
		String mensajeIgCase = "";
		String mensajeTotal = "";
		
		do {
			System.out.println("Introduzca una frase (escriba FIN para acabar)");
			mensaje = sc.nextLine();
			mensajeIgCase = mensaje.toLowerCase(); 
			if(!mensajeIgCase.equals("fin")) {
				mensajeTotal = mensajeTotal + " ," + mensaje;
			}
			
			
		}while(!(mensajeIgCase.equalsIgnoreCase("fin")));
		
		System.out.println(mensajeTotal);
		sc.close();

	}

}
