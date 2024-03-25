package ej60;

public class Partida {

	private Jugador j1;
	private Jugador j2;
	private Baraja b;
	private GUI gui;

	public Partida(Jugador j1, Jugador j2) {
		b = new Baraja();
		gui = new GUI();
		this.j1 = j1;
		this.j2 = j2;
	}

	public void iniciar() {
		gui.bienvenida(j1, j2);
		do {
			if (j1.getTurno() == 1) {
				gui.turno(j1);
				j1.jugarManoPrimero(b);
				gui.turno(j2);
				j2.jugarManoSegundo(b, j2);
			} else {
				gui.turno(j2);
				j2.jugarManoPrimero(b);
				gui.turno(j1);
				j1.jugarManoSegundo(b, j2);
			}
			
			determinarGanador();
			break;

		} while (true);
	}

	public Jugador determinarGanador() {
		if((j1.getMano().getPuntuacion() > j2.getMano().getPuntuacion()) && j1.getMano().getPuntuacion() <= 21) {
			gui.ganador(j1);
			return j1;
		}else if((j2.getMano().getPuntuacion() > j1.getMano().getPuntuacion()) && j2.getMano().getPuntuacion() <= 21){
			gui.ganador(j2);
			return j2;
		} else if((j1.getMano().getPuntuacion() == j2.getMano().getPuntuacion()) && j1.getMano().getPuntuacion() <= 21) {
			gui.empate();
			return null;
		}else {
			gui.dobleDerrota();
			return null;
		}
	}

}
