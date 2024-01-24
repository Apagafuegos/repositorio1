package ej37;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ColaCadenas cola = new ColaCadenas();
		cola.añadirCadena("primero");
		cola.añadirCadena("segundo");
		System.out.println(cola.sacarCadena());
		cola.añadirCadena("tercero");

		for (int i = 0; i <= cola.getTamaño(); i++) {
			System.out.println(cola.sacarCadena());
		}
		
		cola.añadirCadena("cuarto");
		
		PilaCadenas pila = new PilaCadenas();
		pila.añadirCadena("primero");
		pila.añadirCadena("segundo");
		System.out.println(pila.sacarCadena());
		pila.añadirCadena("tercero");
		
		while(pila.getTamaño() > 0) {
			System.out.println(pila.sacarCadena());
		}
		
		pila.añadirCadena("cuarto");
		System.out.println(pila);*/
		Scanner sc = new Scanner(System.in);
		PilaColaCadenas<String> var = new PilaColaCadenas<>();	
		var.setModoCola();
		
		for (int i = 0; i < 5; i++) {
			var.añadirCadena(sc.nextLine());
		}
		//var.setModoPila();
		System.out.println(var.sacarCadena());
		
		sc.close();

	}

}
