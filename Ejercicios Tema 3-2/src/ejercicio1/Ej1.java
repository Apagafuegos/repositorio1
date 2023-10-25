package ejercicio1;

public class Ej1 {

	public static void main(String[] args) {
		
		Integer posicion = 0;		
		Integer arrayNum[] = new Integer[15];
		
		for (int numero = 1; numero <= 30; numero++) {
			if(numero%2==0) {
				arrayNum[posicion] = numero;				
				posicion++;
			}
			
		}
		
		for(Integer i = 0; i < arrayNum.length; i++) {
			System.out.println(arrayNum[i]);
			
		}

	}

}
