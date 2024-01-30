package ej44;

public class Asesino extends Personaje {

	public Asesino(String nombre, String codigo) {
		super(nombre, codigo);
		this.puntosVida = 100;
		this.daño = 10;
		this.tiempoDaño = 5;
	}

}
