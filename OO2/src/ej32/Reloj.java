package ej32;

import java.util.Objects;

public class Reloj {
	protected Integer horas, minutos, segundos;
	protected Boolean formato24Horas;

	public Reloj(Integer horas, Integer minutos, Integer segundos) {
		// Constructor con parámetros
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
		formato24Horas = true;
	}

	public Reloj() {
		// Constructor sin parámetros
		super();
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
		formato24Horas = true;
	}

	public Integer getHoras() {
		return horas;
	}

	public Integer getMinutos() {
		return minutos;
	}

	public Integer getSegundos() {
		return segundos;
	}

	public Boolean getFormato24Horas() {
		return formato24Horas;
	}

	public void setFormato24Horas(Boolean formato24Horas) {
		this.formato24Horas = formato24Horas;
	}

	public void ponerEnHora(Integer hora, Integer minuto) {
		this.horas = hora;
		this.minutos = minuto;
	}

	public void ponerEnHora(Integer hora, Integer minuto, Integer segundo) {
		this.horas = hora;
		this.minutos = minuto;
		this.segundos = segundo;
	}

	public Boolean check() {
		return (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59);
	}

	@Override
	public String toString() {

		if (!check()) {
			return "¡Hora incorrecta!";
		}

		if (formato24Horas) {
			return formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos);
		} else {
			if (horas > 12) {
				return formatNumber(horas - 12) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos) + " PM";
			}

			return formatNumber(horas) + ":" + formatNumber(minutos) + ":" + formatNumber(segundos)+ " AM";
		}

	}
	
	private String formatNumber(Integer x) {
		if(x >= 10) {
			return x.toString();
		}
		
		return "0" + x;
	}

	@Override
	public int hashCode() {
		return Objects.hash(horas, minutos, segundos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reloj other = (Reloj) obj;
		return Objects.equals(horas, other.horas) && Objects.equals(minutos, other.minutos)
				&& Objects.equals(segundos, other.segundos);
	}

}