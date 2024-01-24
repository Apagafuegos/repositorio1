package ej37;

public class PilaColaCadenas<E> extends AbstractStructure<E> {

	protected Boolean modo;

	public PilaColaCadenas() {
		super();
		modo = true; // True para Cola, false para pila
		System.out.println("Activado modo cola");
	}

	public void setModoPila() {
		if (!modo) {
			System.out.println("El modo pila ya está activado");
			return;
		}
		this.modo = false;
		System.out.println("Activado modo pila");
	}

	public void setModoCola() {
		if (modo) {
			System.out.println("El modo cola ya está activado");
			return;
		}
		this.modo = true;
		System.out.println("Activado modo cola");
	}

	@Override
	public Object sacarCadena() {
		if (modo) {
			return lista.remove(0);
		}

		return lista.remove(lista.size() - 1);
	}

}
