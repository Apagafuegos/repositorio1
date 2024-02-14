package r2;

public abstract class Telefono {

	protected Integer numero;
	protected Boolean enLlamada;

	public Telefono(Integer numero) {
		this.numero = numero;
		this.enLlamada = false;
	}

	public Integer consultarNumero() {
		return numero;
	}

	public void marcar(Integer numero) {
		System.out.println("LLAMANDO A " + numero);
		if (numero == this.numero) {
			System.out.println("COMUNICANDO");
			return;
		}
		System.out.println("EN COMUNICACIÓN");
		enLlamada = true;
		return;
	}

	public void colgar() {
		if (enLlamada) {
			System.out.println("COMUNICACIÓN CORTADA");
			enLlamada = false;
			return;
		}
		return;

	}

	@Override
	public String toString() {
		if(enLlamada)
		return "El numero " + numero + " está en llamada";
		
		return "El numero " + numero + " no está en llamada";
	}
	
	
}
