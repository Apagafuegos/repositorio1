package r5;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	protected List<Publicacion> listaPublicaciones;

	public Biblioteca() {
		listaPublicaciones = new ArrayList<Publicacion>();
	}

	public List<Publicacion> getListaPublicaciones() {
		return listaPublicaciones;
	}

	public void addPublicacion(Publicacion p) {
		listaPublicaciones.add(p);
	}

}
