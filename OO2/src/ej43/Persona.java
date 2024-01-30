package ej43;

public abstract class Persona {

	protected String nombre;
	protected Integer añoNacimiento;
	protected String nacionalidad;

	public Persona(String nombre, String nacionalidad, Integer añoNacimiento) {
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract Integer getSueldo();

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getAñoNacimiento() {
		return añoNacimiento;
	}

	public void setAñoNacimiento(Integer añoNacimiento) {
		this.añoNacimiento = añoNacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return nombre + " de " + nacionalidad + " nacido en " + añoNacimiento;
	}

}
