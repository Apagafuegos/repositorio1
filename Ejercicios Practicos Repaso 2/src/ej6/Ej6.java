package ej6;

public class Ej6 {

	public static void main(String[] args) {
		
		Integer suma = 0;
		for (Integer n2 = 1; n2 <= 10; n2++) {
			if(n2 == 10) {
			suma = suma + n2*3;
			System.out.print(n2*3 + " = " + suma );	
			}else {
			suma = suma + n2*3;
			System.out.print(n2*3 + " + ");
			}
		}

	}

}
