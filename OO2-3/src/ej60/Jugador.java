package ej60;

import java.util.Scanner;

public class Jugador {

	@SuppressWarnings("unused")
	private String nombre;
	private Boolean automatico;
	private Mano mano;
	private Integer turno;
	private static final Scanner SC = new Scanner(System.in);

	public Jugador(String nombre, Boolean auto, Mano mano, Integer turno) {
		this.nombre = nombre;
		this.automatico = auto;
		this.mano = mano;
		this.turno = turno;
	}

	public Integer getTurno() {
		return turno;
	}

	public Mano getMano() {
		return mano;
	}

	public void jugarManoPrimero(Integer ref, Baraja baraja) {
		if (this.automatico) {
			String eleccion;
			Boolean seguirSacando = true;
			for (Integer i = 0; i < 2; i++) {
				Naipe c1 = baraja.obtenerCarta();
				mano.darCarta(c1);
			}
			System.out.println("Estos son los valores de tus dos cartas\n" + "\t" + mano.getMano().get(0).getValor()
					+ "\n\t" + mano.getMano().get(0).getValor());
			System.out.println("¿Quieres seguir sacando cartas? \n\t Y para si\n\t N para no");
			eleccion = SC.nextLine().substring(0, 1).toUpperCase();
			if (eleccion.equalsIgnoreCase("y")) {
				do {
					Naipe c2 = baraja.obtenerCarta();
					mano.darCarta(c2);
					System.out.println("Esta es tu puntuación actual, " + mano.getPuntuacion());
					System.out.println("¿Seguir sacando? (Y para si, N para no)");
					eleccion = SC.nextLine().substring(0, 1).toUpperCase();
					if (eleccion.equalsIgnoreCase("y"))
						seguirSacando = false;
				} while (mano.getPuntuacion() > 21 && seguirSacando);
			}
		} else {
			Integer n = 0;
			do {
				Naipe c = baraja.obtenerCarta();
				mano.darCarta(c);
				n++;

			} while (n < 2);

			do {
				Naipe c = baraja.obtenerCarta();
				mano.darCarta(c);
			} while (mano.getPuntuacion() <= 16);

		}

	}

	public void jugarManoSegundo(Integer ref, Baraja baraja, Jugador other) {
		if (this.automatico) {
			String eleccion;
			Boolean seguirSacando = true;
			for (Integer i = 0; i < 2; i++) {
				Naipe c1 = baraja.obtenerCarta();
				mano.darCarta(c1);
			}
			System.out.println("Estos son los valores de tus dos cartas\n" + "\t" + mano.getMano().get(0).getValor()
					+ "\n\t" + mano.getMano().get(0).getValor());
			System.out.println("¿Quieres seguir sacando cartas? \n\t Y para si\n\t N para no");
			eleccion = SC.nextLine().substring(0, 1).toUpperCase();
			if (eleccion.equalsIgnoreCase("y")) {
				do {
					Naipe c2 = baraja.obtenerCarta();
					mano.darCarta(c2);
					System.out.println("Esta es tu puntuación actual, " + mano.getPuntuacion());
					System.out.println("¿Seguir sacando? (Y para si, N para no)");
					eleccion = SC.nextLine().substring(0, 1).toUpperCase();
					if (eleccion.equalsIgnoreCase("y"))
						seguirSacando = false;
				} while (mano.getPuntuacion() > 21 && seguirSacando);
			}
		} else {
			Integer n = 0;
			do {
				Naipe c = baraja.obtenerCarta();
				mano.darCarta(c);
				n++;

			} while (n < 2);

			do {
				Naipe c = baraja.obtenerCarta();
				mano.darCarta(c);
			} while (mano.getPuntuacion() > other.getMano().getPuntuacion() || mano.getPuntuacion() > 21);

		}
	}
}
