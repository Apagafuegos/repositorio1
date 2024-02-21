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

	public void start() {
		ui.bienvenida(this);
		ui.enseñarTablero(tablero);
		do {
			ui.anunciar();
			tablero.añadirLetra(SC.nextLine(), this, ui);
		} while (partidaTerminada());
		ui.partidaFinalizada(this);
	}

	public void setFallos(Integer fallos) {
		this.fallos = fallos;
	}

	public Boolean partidaTerminada() {
		return !(fallos == 10 || tablero.getTableroJugador().equals(tablero.getTableroRespuesta()));
	}
}
