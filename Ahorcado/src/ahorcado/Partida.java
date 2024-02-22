package ahorcado;

import java.util.List;
import java.util.Scanner;

public class Partida {

	private static final Scanner SC = new Scanner(System.in);
	private Integer fallos;
	private String palabraAdivinar;
	private Tablero tablero;
	private UserInterface ui;

	public Partida() {
		fallos = 0;
		palabraAdivinar = new SelectorPalabra().seleccionar(); // Creo objeto selector y uso el método que devuelve una
																// palabra
		tablero = new Tablero(palabraAdivinar); // Tablero de la partida con dos tableros, el que se enseña y la
												// solución
		ui = new UserInterface();
	}

	public Integer getFallos() {
		return fallos;
	}

	public String getPalabraAdivinar() {
		return palabraAdivinar;
	}

	public List<String> getTableroJugador() {
		return tablero.getTableroJugador();
	}

	public List<String> getTableroRespuesta() {
		return tablero.getTableroRespuesta();
	}

	public List<String> getLetrasIntroducidas() {
		return tablero.getLetrasIntroducidas();
	}

	/**
	 * Initialises the game and initiates the loop that does not finish until 10
	 * mistakes are made or the word is guessed.
	 */

	public void start() {
		ui.bienvenida(this);
		ui.enseñarTablero(tablero);
		buclePartida();
		ui.partidaFinalizada(this);
	}

	public void setFallos(Integer fallos) {
		this.fallos = fallos;
	}

	/**
	 * If one of the two requirements (more than 10 errors or word is guessed) for
	 * the game to finish are met, false is returned.
	 * 
	 * @return Boolean, false if game is finished, true otherwise
	 */

	public Boolean partidaTerminada() {
		return !(fallos == 10 || tablero.getTableroJugador().equals(tablero.getTableroRespuesta()));
	}

	/**
	 * Shows a message in console and calls añadirLetra() method from Tablero class
	 * until partidaTerminada() returns false.
	 */

	public void buclePartida() {
		do {
			ui.anunciar();
			tablero.añadirLetra(SC.nextLine().trim().toLowerCase(), this, ui);
		} while (partidaTerminada());
	}
}
