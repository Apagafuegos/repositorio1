package ej1;

public class Ej1 {

	public static void main(String[] args) {
		String frase = " hola me llamo carlos";
		String mayusculas = getMayusculas(frase);
		System.out.println(mayusculas);

	}
	
	public static String getMayusculas(String frase) {
		return frase.trim().toUpperCase();
	}

}
