package ejjercicio21;

public class Ej21 {

	public static void main(String[] args) {
		
		Double[] numeros = new Double[] {5.4 ,3.1, 9.0, 4.7};
		Double suma = 0.0;
		
		for (Double numero : numeros) {
			System.out.println(numero);
		}
		
		for (Double numero : numeros) {
			suma = suma + numero; 
		}
		System.out.println();
		System.out.println("La suma es " + suma);
	}

}
