package ej37;

public class PilaCadenas<E> extends AbstractStructure<E> {

	public PilaCadenas() {
		super();
	}

	@Override
	public Object sacarCadena() {
		return lista.remove(lista.size() - 1);
	}
}
