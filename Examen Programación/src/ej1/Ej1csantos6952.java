package ej1;

import java.util.Random;

public class Ej1csantos6952 {

	public static void main(String[] args) {
		Random rand = new Random();
		Integer tamanoArray = 0;
		Integer suma = 0;
		do {
			tamanoArray = rand.nextInt(10,21);
		}while(tamanoArray%2==0);
		
		Integer[] arrayNumeros = new Integer[tamanoArray];		
		
		for (int i = 0,num = 50; i < arrayNumeros.length; i++, num--) {
			arrayNumeros[i] = num;
		}
		
		System.out.println("Array inicial:");
		for (Integer numero : arrayNumeros) {
			System.out.print(numero + " ");
		}
		
		for (Integer posicion : arrayNumeros) {
			suma += posicion;
		}
		System.out.println();
		System.out.println("Suma = " + suma);
		
		for (int i = 0; i < arrayNumeros.length; i++) {
			if(i%2==1) {
				arrayNumeros[i] = suma;
			}
		}
		
		System.out.println("Array modificado:");
		for (Integer numero : arrayNumeros) {
			System.out.print(numero + " ");
		}
		

	}

}
