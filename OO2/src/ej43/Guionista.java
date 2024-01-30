package ej43;

public class Guionista extends Persona {

	public Guionista(String nombre, String nacionalidad, Integer añoNacimiento) {
		super(nombre, nacionalidad, añoNacimiento);
	}

	@Override
	public Integer getSueldo() {
		return 50000;
	}

}
