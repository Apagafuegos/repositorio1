package ahorcado;

public class UserInterface {

	public void bienvenida(Partida part) {
		System.out.println("La palabra elegida tiene " + part.getPalabraAdivinar().length() + " letras.");
	}

	public void anunciar() {
		System.out.println("Introduce una letra");
	}

	public void acierto() {
		System.out.println("Acertaste!, esa letra si es contenida por la palabra");

	}

	public void fallo(Partida part) {
		if (part.getFallos() == 1)
			System.out.println("Fallo!!!!, llevas " + part.getFallos() + " fallo!");
		else
			System.out.println("Fallo!!!!, llevas " + part.getFallos() + " fallos!");
	}

	public void enseñarTablero(Tablero tab) {
		System.out.println(tab.getTableroJugador());
	}

	public void partidaFinalizada(Partida part) {
		if (part.getFallos() == 10) {
			System.err.println("GAME OVER! Tienes más de 10 fallos");
		} else if (part.getTableroJugador().equals(part.getTableroRespuesta())) {
			System.out.println("¡Enhorabuena! Has ganado :)");
		}
	}

	public void enseñarLetrasIntroducidas(Tablero tab) {
		System.out.println("Llevas introducidas las siguientes letras: " + tab.getLetrasIntroducidas());
	}

	public void letraYaIntroducida() {
		System.err.println("Ya has introducido esa letra");
	}
	
	public void errorInput() {
		System.err.println("El input introducido no es correcto. Inténtelo de nuevo");
	}

}
