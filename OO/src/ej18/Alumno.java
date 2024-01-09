package ej18;

import java.util.Objects;

public class Alumno extends Persona {
	private String dni;
	private Integer nota;
	private Curso curso;

	// Constructor

	public Alumno(String dni) {
		super();
		this.dni = dni.toUpperCase();
	}

	public String getDni() {
		return dni;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public void setDni(String dni) {
		this.dni = dni.toUpperCase();
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public void aprobar() {
		if (this.nota < 5) {
			this.nota = 5;
		}
	}
	
	public Boolean validarDni() {
		if(this.dni.length() == 9 && this.dni != null) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return nombre + " " + edad + " " + dni + " " + nota + " " + curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(curso, dni, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}
	
	
	
}
