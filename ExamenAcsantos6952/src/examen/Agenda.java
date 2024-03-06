package examen;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Agenda {
	private String medicoEspecialista;
	private List<Cita> listaCitas;

	public Agenda(String especialista) {
		this.medicoEspecialista = especialista;
		this.listaCitas = new ArrayList<>();
	}

	public String getMedicoEspecialista() {
		return medicoEspecialista;
	}

	public void addCita(Cita cita) {
		if (!listaCitas.contains(cita))
			listaCitas.add(cita);
	}

	public List<Cita> getCitasDias(LocalDate fecha) {
		List<Cita> listaAux = new ArrayList<>();
		for (Cita cita : listaCitas) {
			if (cita.getFecha().equals(fecha)) {
				listaAux.add(cita);
			}
		}
		return listaAux;
	}

	public BigDecimal getImportePendienteFacturar() {
		BigDecimal total = BigDecimal.ZERO;
		for (Cita cita : listaCitas) {
			if (!cita.getFacturado()) {
				BigDecimal aux = cita.getImporteFactura();
				total = total.add(aux);
			}
		}
		return total.setScale(2, RoundingMode.HALF_DOWN);
	}

	public Boolean tieneCitaProxima(String paciente) {
		for (Cita cita : listaCitas) {
			if (cita.getFecha().isAfter(LocalDate.now())) {
				if (cita.getNombrePaciente().equals(paciente)) {
					return true;
				}
			}
		}
		return false;
	}

	public void borrarCitasFacturadas() {
		Iterator<Cita> it = listaCitas.iterator();
		while (it.hasNext()) {
			Cita cita = it.next();
			if (cita.getFacturado()) {
				it.remove();
			}
		}
	}

	public void facturarCitasPendientes(String paciente) {
		for (Cita cita : listaCitas) {
			if (cita.getNombrePaciente().equals(paciente) && cita.getFecha().isBefore(LocalDate.now())
					&& !cita.getFacturado()) {
				cita.setFacturado(true);
			}
		}
	}

}
