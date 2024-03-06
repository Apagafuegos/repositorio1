package examen;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Cita implements InterfazFactura {

	private LocalDate fecha;
	private Integer hora;
	private String nombrePaciente;
	private Boolean conSeguroMedico;
	private Boolean facturado;

	public Cita(String nombre) {
		this.nombrePaciente = nombre;
		conSeguroMedico = false;
		facturado = false;
	}

	public Cita(LocalDate fecha, Integer hora, String nombre, Boolean seguroMedico) {

		this(nombre);
		this.fecha = fecha;
		this.hora = hora;
		this.conSeguroMedico = seguroMedico;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Integer getHora() {
		return hora;
	}

	public void setHora(Integer hora) {
		this.hora = hora;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public Boolean getConSeguroMedico() {
		return conSeguroMedico;
	}

	public void setConSeguroMedico(Boolean conSeguroMedico) {
		this.conSeguroMedico = conSeguroMedico;
	}

	public Boolean getFacturado() {
		return facturado;
	}

	public void setFacturado(Boolean facturado) {
		this.facturado = facturado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fecha, hora);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cita other = (Cita) obj;
		return Objects.equals(fecha, other.fecha) && Objects.equals(hora, other.hora);
	}

	@Override
	public BigDecimal getImporteFactura() {
		if (this.conSeguroMedico)
			return new BigDecimal(100);
		else
			return new BigDecimal(150);

	}

	@Override
	public String toString() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		if (conSeguroMedico)
			return nombrePaciente + " - " + fecha.format(formato) + " - " + hora + " horas - CON SEGURO";
		else
			return nombrePaciente + " - " + fecha.format(formato) + " - " + hora + " horas - SIN SEGURO";
	}

	public Integer getDiasHastaCita() {
		if (fecha.isBefore(LocalDate.now()))
			return -1;
		else {
			return LocalDate.now().until(fecha).getDays() + LocalDate.now().until(fecha).getMonths() * 30;
		}
	}

}
