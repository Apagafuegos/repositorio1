package ej44;

public class Jugador {

	protected EquipoCombate equipo;
	protected String nombre;
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.equipo = new EquipoCombate();
	}

	public EquipoCombate getEquipo() {
		return equipo;
	}

	public void setEquipo(EquipoCombate equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "El jugador " + nombre + " tiene el siguiente equipo: " + equipo;
	}
	
}
