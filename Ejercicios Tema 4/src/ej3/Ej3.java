package ej3;

import ej1.Ej1;
import ej2.Ej2;

public class Ej3 {

	public static void main(String[] args) {
		String frase = "viva el BETIS manquepierda";
		String maymin = getMayMin(1, frase);
		System.out.println(maymin);
		
	}
	
	public static String getMayMin(Integer n, String frase) {
		if (n == 1){
			return Ej1.getMayusculas(frase);
		}else {
			return Ej2.getMinusculas(frase);
		}
	}
		
}
