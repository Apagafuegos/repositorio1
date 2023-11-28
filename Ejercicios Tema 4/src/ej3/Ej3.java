package ej3;

public class Ej3 {

	public static void main(String[] args) {
		String frase = "viva el BETIS manquepierda";
		String maymin = getMayMin(1, frase);
		System.out.println(maymin);
		
	}
	
	public static String getMayMin(Integer n, String frase) {
		if (n == 1){
			return getMayusculas(frase);
		}else {
			return getMinusculas(frase);
		}
	}
	
	//Ej 4
	public static String getMayusculas(String frase) {
		return frase.trim().toUpperCase();
	}

	public static String getMinusculas(String frase) {
		return frase.trim().toLowerCase();
	}
		
}
