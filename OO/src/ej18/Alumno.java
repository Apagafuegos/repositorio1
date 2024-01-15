package ej18;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno extends Persona {
	private String dni;
	private Integer nota;
	private Curso curso;

	// Constructor

	public Alumno(String dni) {
		super();
		if (dni != null) {
			this.dni = dni.toUpperCase();
		}
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
		if (dni != null) {
			dni = dni.toUpperCase();
		}
		this.dni = dni;
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
		Pattern patron = Pattern.compile("[0-9]{7,8}[A-Z a-z]");
		Matcher match = patron.matcher(dni);
		if (match.matches()) {
			return true;
		}
		return false;
	}

	public Boolean validar() {
		if (validarDni() && curso != null && nombre != null & nombre.length() >= 10 && edad != null && edad >= 12
				&& edad <= 65) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return nombre + " " + edad + " " + dni + " " + nota;
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
