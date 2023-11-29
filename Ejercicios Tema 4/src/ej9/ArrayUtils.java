package ej9;

public class ArrayUtils {

	public static void main(String[] args) {

		String[] array = new String[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = "hola";
		}

		imprimirArray(array);

	}

	public static void imprimirArray(String[] array) {
		for (String elemento : array) {
			System.out.print(elemento + " ");
		}
	}

	public static String obtenerPalabra(String[] array, Integer posicion) {
		return array[posicion];
	}
}
