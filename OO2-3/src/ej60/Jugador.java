package ej60;

import java.util.Scanner;

public class Jugador {

	private String nombre;
	private Boolean automatico;
	private Mano mano;
	private Integer turno;
	private GUI gui;
	private static final Scanner SC = new Scanner(System.in);

	public Jugador(String nombre, Boolean auto, Mano mano, Integer turno) {
		this.nombre = nombre;
		this.automatico = auto;
		this.mano = mano;
		this.turno = turno;
		gui = new GUI();
	}

	public Integer getTurno() {
		return turno;
	}

	public Mano getMano() {
		return mano;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void jugarManoPrimero(Baraja baraja) {
		if (!this.automatico) {
			String eleccion;
			Boolean seguirSacando = true;
			for (Integer i = 0; i < 2; i++) {
				Naipe c1 = baraja.obtenerCarta();
				mano.darCarta(c1);
			}
			gui.primerSaque(mano);
			eleccion = SC.nextLine().substring(0, 1).toUpperCase();
			if (eleccion.equalsIgnoreCase("y")) {
				do {
					Naipe c2 = baraja.obtenerCarta();
					mano.darCarta(c2);
					gui.mostrarCartas(mano.getMano(), mano, this);
					if (mano.getPuntuacion() > 21) {
						gui.bust();
						break;
					}
					gui.seguirSacando();
					eleccion = SC.nextLine().substring(0, 1).toUpperCase();
					if (!eleccion.equalsIgnoreCase("y"))
						seguirSacando = false;
				} while (seguirSacando);
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
				gui.carta(c);
				if (mano.getPuntuacion() > 21) {
					gui.bust();
					break;
				}

			} while (mano.getPuntuacion() <= 16);

		}

	}

	public void jugarManoSegundo(Baraja baraja, Jugador other) {
		if (!this.automatico) {
			String eleccion;
			Boolean seguirSacando = true;
			for (Integer i = 0; i < 2; i++) {
				Naipe c1 = baraja.obtenerCarta();
				mano.darCarta(c1);
			}
			gui.primerSaque(mano);
			eleccion = SC.nextLine().substring(0, 1).toUpperCase();
			if (eleccion.equalsIgnoreCase("y")) {
				do {
					Naipe c2 = baraja.obtenerCarta();
					mano.darCarta(c2);
					gui.carta(c2);
					if (mano.getPuntuacion() > 21) {
						gui.bust();
						mano.getMano().clear();
						break;
					}
					gui.mostrarCartas(mano.getMano(), mano, this);
					eleccion = SC.nextLine().substring(0, 1).toUpperCase();
					if (!eleccion.equalsIgnoreCase("y"))
						seguirSacando = false;
				} while (mano.getPuntuacion() <= 21 && seguirSacando);
			}
		} else {
			Integer n = 0;
			Boolean check = true;
			do {
				Naipe c = baraja.obtenerCarta();
				mano.darCarta(c);
				n++;

			} while (n < 2); // Aqui para
			gui.mostrarCartas(mano.getMano(), mano, this);

			do {
				Naipe c = baraja.obtenerCarta();
				mano.darCarta(c);
				gui.carta(c);
				if (mano.getPuntuacion() > 21) {
					mano.getMano().clear();
					gui.bust();
					break;
				}
				gui.mostrarCartas(mano.getMano(), mano, this);
				if ((mano.getPuntuacion() >= other.getMano().getPuntuacion()) && mano.getPuntuacion() > 16
						&& mano.getPuntuacion() <= 21)
					break;

			} while (check);

		}
	}

}
