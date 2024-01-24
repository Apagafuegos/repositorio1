package ej41;

import java.util.Objects;

public class Resultado {

	protected Integer golesLocales;
	protected Integer golesVisitantes;

	public Resultado() {
		this.golesLocales = 0;
		this.golesVisitantes = 0;
	}

	public Integer getGolesLocales() {
		return golesLocales;
	}

	public void setGolesLocales(Integer golesLocales) {
		this.golesLocales = golesLocales;
	}

	public Integer getGolesVisitantes() {
		return golesVisitantes;
	}

	public void setGolesVisitantes(Integer golesVisitantes) {
		this.golesVisitantes = golesVisitantes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(golesLocales, golesVisitantes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Resultado other = (Resultado) obj;
		return Objects.equals(golesLocales, other.golesLocales)
				&& Objects.equals(golesVisitantes, other.golesVisitantes);
	}

	@Override
	public String toString() {
		return golesLocales + "-" + golesVisitantes;
	}

	public Boolean isVictoriaLocal() {
		return (golesLocales > golesVisitantes);
	}

	public Boolean isVictoriaVisitante() {
		return (golesLocales < golesVisitantes);
	}

	public Boolean isEmpate() {
		return (golesLocales == golesVisitantes);
	}

}
