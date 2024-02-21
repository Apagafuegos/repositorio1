package r4;

import java.util.ArrayList;
import java.util.List;

public class Libreria {

	private List<Libro> listaLibros;
	private String direccion;
	private Integer numTel;

	public Libreria(String direccion, Integer numTel) {
		listaLibros = new ArrayList<Libro>();
		this.direccion = direccion;
		this.numTel = numTel;
	}

	public Libro obtenerLibroMasAntiguo() {
		Libro aux = null;
		for (Libro libro : listaLibros) {
			if (aux == null)
				aux = listaLibros.get(0);
			else {
				if (libro.getFechaEdicion().isBefore(aux.getFechaEdicion())) {
					aux = libro;
				}
			}
		}
		return aux;
	}

	public Integer obtenerPesoTotalLibros() {
		Integer pesoTotal = 0;
		for (Libro libro : listaLibros) {
			pesoTotal += libro.getPeso();
		}
		return pesoTotal;
	}

	public Integer obtenerNumPagMedio() {
		Integer pagTotal = 0;
		for (Libro libro : listaLibros) {
			pagTotal += libro.getPaginas();
		}
		return (pagTotal / listaLibros.size());
	}

	public List<Libro> getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(List<Libro> listaLibros) {
		this.listaLibros = listaLibros;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getNumTel() {
		return numTel;
	}

	public void setNumTel(Integer numTel) {
		this.numTel = numTel;
	}

	@Override
	public String toString() {
		return "Libreria [Libros=" + listaLibros + "]";
	}
	
	
}
