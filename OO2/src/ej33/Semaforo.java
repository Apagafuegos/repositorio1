package ej33;

public class Semaforo {

	public static final String ROJO = "Rojo";
	public static final String AMBAR = "Ámbar";
	public static final String VERDE = "Verde";
	protected String color;
	protected Boolean parpadeando;

	protected Semaforo() {
		super();
		this.color = ROJO;
		this.parpadeando = false;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if (color.equals(ROJO) || color.equals(AMBAR) || color.equals(VERDE)) {
			this.color = color;
		} else {
			System.out.println("Color no modificado, el color no es correcto");
		}
	}

	public Boolean getParpadeando() {
		return parpadeando;
	}

	public void setParpadeando(Boolean parpadeando) {
		if (parpadeando == true && color == AMBAR) {
			this.parpadeando = parpadeando;
		} else {
			System.out.println("El semáforo no puede parpadear con el color actual");
		}

	}

	public void cambiarEstado() {
		if (this.color.equals(VERDE)) {
			this.color = AMBAR;
			parpadeando = true;
		} else if (this.color.equals(ROJO)) {
			this.color = VERDE;
		} else {
			if (parpadeando) {
				parpadeando = false;
			} else {
				color = ROJO;
			}
		}
	}

	@Override
	public String toString() {
		if(!parpadeando) {
			return "Semáforo en " + this.color;
		}
		
		return "Semáforo en " + this.color + " parpadeando";
	}

}
