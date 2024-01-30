package ej43;

public class Director extends Persona {

	public Director(String nombre, String nacionalidad, Integer añoNacimiento) {
		super(nombre, nacionalidad, añoNacimiento);
	}

	@Override
	public Integer getSueldo() {
		return 200000;
	}

}
