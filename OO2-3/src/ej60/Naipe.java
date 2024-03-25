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
		if (numero.equalsIgnoreCase("jack") || numero.equalsIgnoreCase("queen") || numero.equalsIgnoreCase("king") || numero.equalsIgnoreCase("ace"))			
			return 10;
		return Integer.parseInt(numero);
	}

	public Integer getValorAlt() {
		if (!numero.equalsIgnoreCase("ace"))
			return this.getValor();

		return 11;
	}

	public String getNumero() {
		return numero;
	}

	public String getPalo() {
		return palo;
	}
	
	

}
