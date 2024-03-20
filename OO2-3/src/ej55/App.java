package ej55;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		Evaluacion ev1 = new Evaluacion();
		
		ev1.addNota("49523436C", BigDecimal.TEN);
		ev1.addNota("78845123H", new BigDecimal(-4));
		ev1.addNota("78451236G", new BigDecimal(6.6));
		ev1.addNota("54657689J", BigDecimal.TEN);
		ev1.addNota("12345678A", new BigDecimal(4.95));
		
		System.out.println(ev1.obtenerCantidadAprobados());
		System.out.println(ev1.corregirNota("49523436C", new BigDecimal(11)));
		System.out.println(ev1.obtenerNotaAlumno("11111111T"));
		System.out.println(ev1.obtenerNotaMedia());
		System.out.println(ev1.obtenerSuspensos());
		System.out.println(ev1);
		ev1.borrarAprobados();
		System.out.println(ev1);

	}

}
