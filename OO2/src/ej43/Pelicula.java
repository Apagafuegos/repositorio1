package ej43;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {

	protected Integer añoEstreno;
	protected String titulo;
	protected List<Actor> listaActores;
	protected Guionista guionista;
	protected Director director;

	public Pelicula() {
		listaActores = new ArrayList<>();
	}

	public Integer getAñoEstreno() {
		return añoEstreno;
	}

	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(List<Actor> listaActores) {
		this.listaActores = listaActores;
	}

	public Guionista getGuionista() {
		return guionista;
	}

	public void setGuionista(Guionista guionista) {
		this.guionista = guionista;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
}
