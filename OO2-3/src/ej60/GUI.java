package ej60;

import java.util.List;

public class GUI {

	public void primerSaque(Mano mano) {
		System.out.println("Estos son los valores de tus cartas\n" + "\t" + mano.getMano().get(0).getValor() + "\n\t"
				+ mano.getMano().get(1).getValor());
		seguirSacando();
	}

	public void bienvenida(Jugador j1, Jugador j2) {
		System.out.println("Sean bienvenidos a la partida; jugadores " + j1.getNombre() + " y " + j2.getNombre());
		System.out.println("Las normas son: \n " + "\t> Gana quien se quede más cerca de 21\n"
				+ "\t> Quien se pase de 21 pierde automáticamente\n"
				+ "\t> Victoria simple se paga 2:1, BlackJack 3:2\n" + "\t¡MUCHA SUERTE!");
	}

	public void mostrarCartas(List<Naipe> c, Mano m, Jugador j) {
		c.stream().forEach(e -> System.out.println(e.getValor() + " " + e.getPalo()));
		System.out.println("La puntuacion de " + j.getNombre() + " es " + m.getPuntuacion());

	}

	public void ganador(Jugador j) {
		System.out.println("¡Ha ganado " + j.getNombre() + "!");
	}

	public void empate() {
		System.out.println("Empatan ambos jugadores");
	}

	public void dobleDerrota() {
		System.out.println("Ambos pierden :(");
	}

	public void bust() {
		System.err.println("¡Fuera!, bust.");
	}

	public void carta(Naipe c) {
		System.out.println("La carta es un " + c.getNumero() + " de " + c.getPalo());
	}

	public void seguirSacando() {
		System.out.println("¿Quieres seguir sacando cartas? \n\t Y para si\n\t N para no");
	}
	public void turno(Jugador j) {
		System.out.println("Turno de " + j.getNombre());

	}
}
