package ej18;

import java.util.Arrays;

public class Curso {
	protected Integer id;
	protected String descripcion;
	protected Alumno[] alumnos;

	public Curso(Integer numeroAlumnos) {
		super();
		this.alumnos = new Alumno[numeroAlumnos];
	}

	public Integer getId() {
		return id;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void addAlumno(Alumno alumno) {
		for (int i = 0; i < this.alumnos.length; i++) {
			if (this.alumnos[i] == null) {
				this.alumnos[i] = alumno;
				return;
			}
		}
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return id + " " + descripcion + " " + Arrays.toString(alumnos);
	}

}
