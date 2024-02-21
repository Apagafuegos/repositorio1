package ahorcado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablero {

	private List<String> tableroJugador;
	private List<String> tableroRespuesta;
	private List<String> letrasIntroducidas;

	public Tablero(String palabra) {
		tableroRespuesta = Arrays.asList(palabra.split(""));
		tableroJugador = new ArrayList<>();
		letrasIntroducidas = new ArrayList<>();
		for (int i = 0; i < tableroRespuesta.size(); i++) {
			if (i != 0 && i != tableroRespuesta.size() - 1)
				tableroJugador.add("-");
			else {
				tableroJugador.add(tableroRespuesta.get(i));
			}
		}
	}

	public List<String> getTableroJugador() {
		return tableroJugador;
	}

	public List<String> getTableroRespuesta() {
		return tableroRespuesta;
	}

	public List<String> getLetrasIntroducidas() {
		return letrasIntroducidas;
	}

	public void añadirLetraALista(String s) {
		letrasIntroducidas.add(s);
	}

	public void ponerLetra(String s, Partida part) {
		for (int i = 0; i < part.getPalabraAdivinar().length(); i++) {
			if (tableroRespuesta.get(i).equals(s))
				tableroJugador.set(i, s);
		}
	}

	public void añadirLetra(String s, Partida part, UserInterface ui) {
		if (!this.letrasIntroducidas.contains(s)) {
			this.añadirLetraALista(s);
			if (this.tableroRespuesta.contains(s)) {
				this.ponerLetra(s, part);
				ui.acierto();
			} else {
				part.setFallos(part.getFallos() + 1);
				ui.fallo(part);
			}
			ui.enseñarTablero(this);
			ui.enseñarLetrasIntroducidas(this);
		} else {
			ui.letraYaIntroducida();
		}
	}
}
