package ej58;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Diccionario d1 = new Diccionario();
		List<String> listaPalabras = new ArrayList<>(List.of("Zapato","Cenicero", "Ciguarro", "Alonso", "Fernando", "Carlos", "Formula Uno", "tetas"));
		d1.cargarDiccionario(listaPalabras);
		d1.imprimirPalabras("z");
		d1.imprimirPalabras("c");
		d1.imprimirPalabras("a");
		d1.imprimirPalabras("f");
		d1.imprimirPalabras("t");
	}

}
