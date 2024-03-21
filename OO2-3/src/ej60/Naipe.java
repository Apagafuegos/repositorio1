package ej60;

public class Naipe {

	private String numero;
	@SuppressWarnings("unused")
	private String palo;
	
	public Naipe(String numero, String palo) {
		this.palo = palo;
		this.numero = numero;
	}

	public Integer getValor() {
		if (numero.equalsIgnoreCase("sota") || numero.equalsIgnoreCase("reina") || numero.equalsIgnoreCase("rey")) {
			return 10;
		}
		return Integer.parseInt(numero);
	}

	public Integer getValorAlt() {
		if (!numero.equalsIgnoreCase("as"))
			return this.getValor();

		return 11;
	}

}
