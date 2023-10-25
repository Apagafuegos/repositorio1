package ejercicio2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		Integer numero = sc.nextInt();
		Integer j = 1;
		
		Integer[] arrayNum = new Integer[6];
		
		for (int i = 0; i < arrayNum.length; i++) {
			if(i==0) {
				arrayNum[i] = numero*numero;
			}else {
				arrayNum[i] = (numero + j)*(numero + j);
				j++;
			}
		}
		
		for (int i = 0; i < arrayNum.length; i++) {
			
			System.out.println(arrayNum[i]);
		}

		sc.close();
	}

}
