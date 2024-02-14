package r2;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {

		Movil m1 = new Movil(654654654, BigDecimal.ZERO, BigDecimal.ZERO);
		Fijo f1 = new Fijo(954954954, "Avenida Europa 84, Montequinto 41089");
		System.out.println(m1);
		System.out.println(f1);
		
		System.out.println(m1.consultarNumero());
		System.out.println(f1.consultarNumero());
		m1.marcar(m1.consultarNumero());
		System.out.println(m1);
		m1.marcar(610610610);
		System.out.println(m1);
		m1.colgar();
		System.out.println(m1);
		m1.colgar();
		System.out.println(m1);

	}

}
