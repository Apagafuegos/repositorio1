package ej60;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baraja {

	private List<Naipe> listaCartas;

	public Baraja() {
		listaCartas = new ArrayList<>();
		this.rellenarBaraja();
	}

	private List<Naipe> rellenarBarajaPalo(String palo) {
		List<Naipe> aux = new ArrayList<>();
		Naipe naipe = null;
		for (Integer i = 1; i <= 13; i++) {
			if (i == 1) {
				naipe = new Naipe("ace", palo);
			} else if (i == 11 || i == 12 || i == 13) {
				if (i == 11) {
					naipe = new Naipe("jack", palo);
				} else if (i == 12) {
					naipe = new Naipe("queen", palo);
				} else {
					naipe = new Naipe("king", palo);
				}

			} else {
				naipe = new Naipe(i.toString(), palo);
			}

			aux.add(naipe);

		}

		return aux;
	}

	private void rellenarBaraja() {
		listaCartas.addAll(this.rellenarBarajaPalo("Picas"));
		listaCartas.addAll(this.rellenarBarajaPalo("Corazones"));
		listaCartas.addAll(this.rellenarBarajaPalo("Diamantes"));
		listaCartas.addAll(this.rellenarBarajaPalo("Tréboles"));
	}

	@SuppressWarnings("unlikely-arg-type")
	public Naipe obtenerCarta() {
		Random rand = new Random();
		Integer num = rand.nextInt(1, 53);
		Naipe aux = listaCartas.get(num);
		this.listaCartas.remove(num);
		return aux;
	}

	public void reiniciar() {
		listaCartas.clear();
		this.rellenarBaraja();
	}

}
