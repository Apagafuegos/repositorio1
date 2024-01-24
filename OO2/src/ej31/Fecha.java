package ej31;

public interface Fecha {
	
	public void cambiar(Integer dia,Integer mes,Integer año);
	public void fechaActual();
	public String toString(String patron);
	public Boolean validar();
	public void cambiarFormato(String patron);
	public boolean equals(Object obj);
	public Integer getDiaMes();
	public Integer getMes();
	public Integer getAño();
	public Integer getDiaSemana();
	public void sumarDias(Integer dias);
	public void sumarMeses(Integer meses);
	public void sumarAños(Integer años);
	public Boolean isFestivo();
	public Fecha restar(Fecha fecha);
	public Integer getDiasRestantesAño();
	public Boolean isBisiesto();
	public Integer getDiferencia(Fecha fecha);
}
