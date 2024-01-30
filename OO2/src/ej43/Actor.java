package ej43;

public class Actor extends Persona {

	public Actor(String nombre, String nacionalidad, Integer añoNacimiento) {
		super(nombre, nacionalidad, añoNacimiento);
	}

	@Override
	public Integer getSueldo() {
		return 100000;
	}

}
