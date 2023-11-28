package ej2;

public class Ej2 {

	public static void main(String[] args) {
		String frase = "HOLA ME LLAMO FRAN Y ME GUSTAN LAS POLLLAAQASSSW     ";
		String minusculas = getMinusculas(frase);
		System.out.println(minusculas);

	}
	
	public static String getMinusculas(String frase) {
		return frase.trim().toLowerCase();
	}
}
