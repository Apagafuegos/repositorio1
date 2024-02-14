package ej53;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		Hucha hucha1 = new Hucha();
		System.out.println(hucha1);
		hucha1.meterDinero(new BigDecimal("100"));
		System.out.println(hucha1);
		hucha1.meterDinero(new BigDecimal("50.501"));
		System.out.println(hucha1);
		hucha1.sacarDinero(new BigDecimal("20.5"));
		System.out.println(hucha1);
		BigDecimal aux = hucha1.sacarDinero(new BigDecimal("200"));
		System.out.println(hucha1);
		hucha1.meterDinero(aux);
		System.out.println(hucha1);
		hucha1.meterDinero(hucha1.contarDinero());
		System.out.println(hucha1);
		hucha1.meterDinero(hucha1.romperHucha());
		System.out.println(hucha1);
	}

}
