package ej44;

public class Parasito extends Personaje{

	public Parasito(String nombre, String codigo) {
		super(nombre, codigo);
		this.puntosVida = 200;
		this.daño = 2;
		this.tiempoDaño = 1;
	}

}
