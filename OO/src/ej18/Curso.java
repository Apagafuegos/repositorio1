package ej18;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	protected Integer id;
	protected String descripcion;
	protected List<Alumno> alumnos;

	public Curso() {
		super();
		this.alumnos = new ArrayList<Alumno>();
	}

	public Integer getId() {
		return id;
	}

	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	public void addAlumno(Alumno alumno) {
		for (int i = 0; i < 3; i++) {
			this.alumnos.add(alumno);
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
		return id + " " + descripcion + " " + alumnos;
	}

}
