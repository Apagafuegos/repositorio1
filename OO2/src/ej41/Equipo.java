package ej41;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Equipo {

	protected String nombre;
	protected Jugador capitan;
	protected List<Jugador> jugadores;
	protected static String competicion;

	public Equipo(String nombre) {
		this.nombre = nombre;
		jugadores = new ArrayList<>();
	}

	public String getCompeticion() {
		return competicion;
	}

	public void setCompeticion(String competicion) {
		Equipo.competicion = competicion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Jugador getCapitan() {
		return capitan;
	}

	public void setCapitan(Jugador capitan) {
		this.capitan = capitan;
	}

	public List<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(List<Jugador> jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipo other = (Equipo) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return nombre + "-Capitán:" + capitan + "-Jugadores:" + jugadores;
	}

}
