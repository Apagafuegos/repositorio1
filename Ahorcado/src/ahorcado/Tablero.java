package ahorcado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tablero {

	private List<String> tableroJugador;
	private List<String> tableroRespuesta;
	private List<String> letrasIntroducidas;

	/**
	 * Constructor for Tablero class. <br>
	 * Initialises 3 lists, 2 default ArrayLists and another ArrayList containing
	 * the splitted String parameter.
	 * 
	 * @param palabra String containing the word-to-guess that will be used to build
	 *                both the list to fill and the list that contains the solution.
	 */

	public Tablero(String palabra) {
		tableroRespuesta = Arrays.asList(palabra.split(""));
		tableroJugador = new ArrayList<>();
		letrasIntroducidas = new ArrayList<>();
		rellenarTableroJugador();
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

	/**
	 * Introduces String s into the used-inputs list.
	 * 
	 * @param s String containing the letter introduced by the user
	 */

	public void añadirLetraALista(String s) {
		letrasIntroducidas.add(s);
	}

	/**
	 * Method that places the introduced String s onto its position in the list
	 * according to its position in the word-to-guess list.
	 * 
	 * @param s    String containing the letter introduced by the user
	 * @param part instance of class Partida
	 */

	public void ponerLetra(String s, Partida part) {
		for (int i = 0; i < part.getPalabraAdivinar().length(); i++) {
			if (tableroRespuesta.get(i).equals(s))
				tableroJugador.set(i, s);
		}
	}

	/**
	 * Method that if the input s is correct [established in inputCorrecto()] and if
	 * it has not been introduced before introduces s in the list of used inputs.
	 * Also whether the word-to-guess list contains said input, it adds it or
	 * displays the failure.
	 * 
	 * @param s    String containing the letter introduced by the user
	 * @param part instance of class Partida
	 * @param ui   instance of class UserInterface
	 */

	public void añadirLetra(String s, Partida part, UserInterface ui) {
		if (inputCorrecto(s)) {
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
		} else {
			ui.errorInput();
		}
	}

	/**
	 * Method that fills the user-displayed list with hyphens except for the first
	 * and last character.
	 */

	public void rellenarTableroJugador() {
		for (int i = 0; i < tableroRespuesta.size(); i++) {
			if (i != 0 && i != tableroRespuesta.size() - 1)
				tableroJugador.add("-");
			else {
				tableroJugador.add(tableroRespuesta.get(i));
			}
		}
	}

	/**
	 * Returns a Boolean whether the String provided by the user is usable by the
	 * program or not. For the input to be correct it should be a 1 character long
	 * String that is not a blank character and NOT a number.
	 * 
	 * @param s String containing the letter introduced by the user
	 * @return true if the specified input s is correct, false otherwise
	 */

	public Boolean inputCorrecto(String s) {
		Boolean check = false;
		@SuppressWarnings("unused")
		Integer aux = null;
		try {
			aux = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			check = true;
		}
		return (s.length() == 1 && check && !s.isBlank());
	}
}
