package ej60;

import java.util.ArrayList;
import java.util.List;

public class Mano {

	private List<Naipe> mano;
	
	public Mano() {
		mano = new ArrayList<>();
	}
	
	protected List<Naipe> getMano() {
		return mano;
	}

	public void darCarta(Naipe carta) {
		mano.add(carta);
	}
	
	public void reiniciar() {
		mano.clear();
	}
	
	public Integer getPuntuacion() {
		return mano.stream().mapToInt(x -> x.getValor()).sum();
	}
	
	public Integer getPuntuacionAlt() {
		return mano.stream().mapToInt(x -> x.getValorAlt()).sum();
	}
	
}
