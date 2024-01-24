package ej37;

public class ColaCadenas<E> extends AbstractStructure<E> {

	public ColaCadenas() {
		super();
	}
	
	@Override
	public E sacarCadena() {
		return lista.remove(0);
	}

}
