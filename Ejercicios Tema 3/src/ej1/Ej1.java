package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un texto");
		String texto = sc.nextLine().toLowerCase().trim();
		String textoACamelCase = "";
		String aux = "";
		String aux2 = "";
		String aux3= "";
		Integer i = 0;
		Boolean check = true;
		
		while(check) {
			if (i == 0) {
				aux = texto.substring(0, texto.indexOf(" "));
				aux2 = texto.substring(texto.indexOf(" ")+1);
				textoACamelCase= textoACamelCase + aux;
				i++;
			}else {
				aux = aux2;
				if(aux.indexOf(" ")!=-1) {
					aux2 = aux.substring(aux.indexOf(" ")+1);
					aux3= aux.substring(0, 1).toUpperCase();
					aux = aux.substring(1, aux.indexOf(" "));
					textoACamelCase= textoACamelCase +aux3 + aux;
				}else {
					aux3= aux.substring(0, 1).toUpperCase();
					aux = aux.substring(1);
					textoACamelCase= textoACamelCase +aux3 + aux;
					check = false;
				}
				
				
			}
		}
		
		

		System.out.println(textoACamelCase);
		
		
		
		
		
		
		

	}

}
