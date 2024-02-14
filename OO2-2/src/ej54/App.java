package ej54;

import java.math.BigDecimal;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {

		CuentaAhorros c1 = new CuentaAhorros("012345");
		System.out.println(c1.getTotal());

		Cargo ca1 = new Cargo(LocalDate.now(), new BigDecimal("200.21"), "49523436C");
		Cargo ca2 = new Cargo(LocalDate.now(), new BigDecimal("33.33"), "49523433C");
		Ingreso i1 = new Ingreso(LocalDate.now(), new BigDecimal("3333"), "Sueldo");
		Ingreso i2 = new Ingreso(LocalDate.now(), new BigDecimal("69.55"), "Prostitución");
		Retirada r1 = new Retirada(LocalDate.now(), new BigDecimal("55"));
		
		c1.addMovimiento(ca1);
		c1.addMovimiento(ca2);
		c1.addMovimiento(i1);
		c1.addMovimiento(i2);
		c1.addMovimiento(r1);
		
		System.out.println(c1.getTotal());
		
		System.out.println(c1.movimientosTotales());
		System.out.println(c1.cargosTotales());
		System.out.println(c1.ingresosTotales());
		System.out.println(c1.retiradasTotales());
		
		

	}

}
