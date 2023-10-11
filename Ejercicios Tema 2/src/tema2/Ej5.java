package tema2;

public class Ej5 {

	public static void main(String[] args) {

		Integer n = 1;
		Integer suma = 0;
		String sumaString="";

		while (n < 10001) {

			suma = suma + n;			
			sumaString = sumaString + " + " +  n.toString();
			n = n + 1;
		}
		System.out.println("La suma de los primeros 10000 números es " + sumaString + " = "+ suma);
	}

}
