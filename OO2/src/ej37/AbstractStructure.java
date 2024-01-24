package ej37;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStructure <E> {

	protected List<E> lista;

	public AbstractStructure() {
		lista = new ArrayList<E>();
	}

	public abstract Object sacarCadena();

	public void añadirCadena(E cadena) {
		lista.add(cadena);
	}

	public Integer getTamaño() {
		return lista.size();
	}

	@Override
	public String toString() {
		return lista.toString();
	}

}
