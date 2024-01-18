package ej31;

public class Fecha {

	protected Integer dia, mes, ano;
	private Integer[] diasMeses = {null,31,28,31,30,31,30,31,31,30,31,30,31};

	public Integer getDia() {
		return dia;
	}

	protected Fecha() {
		super();
		this.dia = 1;
		this.mes = 1;
		this.ano = 2024;
	}

	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}

	public void setDia(Integer dia) {
		if(dia > 0 && dia <= 31 && (tieneMas30(mes) && dia > 30)) {
			this.dia = dia;
		}else {
			System.out.println("DIA INTRODUCIDO NO VÁLIDO");
		}
		
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		if(mes > 0 && mes <= 12) {
			this.mes = mes;
		}else {
			System.out.println("MES INTRODUCIDO NO VÁLIDO");
		}
		
	}
	
	public Boolean tieneMas30(Integer mes) {
		return (diasMeses[mes] > 30);
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	
	
}
