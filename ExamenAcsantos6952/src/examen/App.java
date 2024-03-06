package examen;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nombreEspecialista = "";
		do {
			System.out.println("Introduce el nombre del especialista");
			nombreEspecialista = sc.nextLine().trim().toUpperCase();
			if(nombreEspecialista.length() < 10)
				System.err.println("Nombre demasiado corto, introdúzcalo de nuevo");
		} while (nombreEspecialista.length() < 10);

		Agenda agenda = new Agenda(nombreEspecialista);
		Cita c1 = new Cita(LocalDate.of(2024, 5, 10), 16, "Blas de los Montes", false);
		CitaRevision c2 = new CitaRevision(LocalDate.of(2024, 10, 18), 17, "Laura Aguilar", false);
		c2.setNumRevision(3);
		Cita c3 = new Cita(LocalDate.of(2023, 5, 10), 16, "Blas de los Montes", false);//Implementación NO DE EXAMEN
		Cita c4 = new Cita(LocalDate.of(2023, 5, 10), 16, "Carlos Santos", false);//Implementación NO DE EXAMEN

		agenda.addCita(c1);
		agenda.addCita(c2);
		agenda.addCita(c3);//Implementación NO DE EXAMEN
		agenda.addCita(c4);//Implementación NO DE EXAMEN
		System.out.println(agenda.getCitasDias(LocalDate.of(2023, 5, 10)));//Implementación NO DE EXAMEN

		System.out.println(c1.getImporteFactura());
		System.out.println(c2.getImporteFactura());

		System.out.println(agenda.getCitasDias(LocalDate.of(2024, 5, 10)));
		System.out.println(agenda.getCitasDias(LocalDate.of(2024, 10, 18)));

		DecimalFormat formatin = new DecimalFormat("#,##0.00 €");
		BigDecimal pendienteFacturar = agenda.getImportePendienteFacturar();
		System.out.println(formatin.format(pendienteFacturar));
		/* Hasta aqui la implementacion del examen */

		System.out.println(agenda.tieneCitaProxima("Blas de los Montes"));
		System.out.println(agenda.tieneCitaProxima("Alberto"));
		c1.setFacturado(true);
		agenda.borrarCitasFacturadas();
		System.out.println(agenda.getCitasDias(LocalDate.of(2024, 5, 10)));
		
		System.out.println(c1.getDiasHastaCita());
		System.out.println(c3.getDiasHastaCita());
		
		sc.close();

	}

}
