package tema2;

public class Ejj16 {

	public static void main(String[] args) {

		Integer suma = 0;
		String sumaString = "";

		for (Integer n = 0; n < 10001; n++) {
			suma = suma + n;
			sumaString = sumaString + " + " + n.toString();
		}
		System.out.println("La suma de los primeros 10000 números es " + sumaString + " = " + suma);
	}

}
