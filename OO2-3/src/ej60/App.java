package ej60;

public class App {

	public static void main(String[] args) {

		Jugador j1 = new Jugador("Carlos", false, new Mano(), 1);
		Jugador j2 = new Jugador("Fernando", true, new Mano(), 2);
		Partida p = new Partida(j1, j2);

		p.iniciar();

	}

}
