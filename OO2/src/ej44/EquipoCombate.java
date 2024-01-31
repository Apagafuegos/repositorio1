package ej44;

import java.util.ArrayList;
import java.util.List;

public class EquipoCombate {
	private List<Personaje> listaPersonajes;

	public EquipoCombate() {
		listaPersonajes = new ArrayList<>();
	}

	public void addPersonaje(Personaje pers) {
		if (listaPersonajes.size() == 5) {
			System.err.println("Ya hay 5 personajes");
			return;
		} else if (listaPersonajes.contains(pers)) {
			System.err.println("Ese personaje ya está introducido");
			return;
		}
		listaPersonajes.add(pers);
	}
	
	public Integer getPuntosVida() {
		Integer puntosVida = 0;
		for (Personaje personaje : listaPersonajes) {
			puntosVida += personaje.puntosVida;
		}
		return puntosVida;
	}

	@Override
	public String toString() {
		return listaPersonajes.toString();
	}
	
	
}
