package ejj24;

import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer suma = 0;
		Integer n = 0;
		
		do {
			System.out.println("Introduzca un numero mayor que 0");
			n = sc.nextInt();
		}while(n<=0);
		
		for(Integer i = 1; i<=n; i++) {
			if(i%2==1) {
				suma = suma + i;
			}
		}
		System.out.println(suma);
	}

}
