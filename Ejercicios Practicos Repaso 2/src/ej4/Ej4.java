package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Precio de la unidad");
		Double precio = sc.nextDouble();
		System.out.println("Nº de unidades");
		Integer unidades = sc.nextInt();
		Double precioTotal = 0.00;
		Double precioDescuento = 0.00;
		Double descuento = 0.00;

		if (unidades > 100) {
			descuento = 0.4;
			precioTotal = (unidades * precio);
			precioDescuento = precioTotal - precioTotal* descuento;
		} else if (unidades > 25 && unidades <= 100) {
			descuento = 0.2;
			precioTotal = (unidades * precio);
			precioDescuento = precioTotal - precioTotal* descuento;
		} else if (unidades >= 10 && unidades <= 24) {
			descuento = 0.1;
			precioTotal = (unidades * precio);
			precioDescuento = precioTotal - precioTotal* descuento;
		} else if (unidades < 10) {
			precioTotal = (unidades * precio);
			precioDescuento = precioTotal;
		}

		System.out.println("Subtotal = " + unidades + " x " + precio + " = " + precioTotal);
		System.out.println("Descuento = " + descuento*100 + "% de " + precioTotal + " = " + descuento*precioTotal);
		System.out.println("Total = " + precioTotal + " - " + descuento*precioTotal + " = " + precioDescuento);
	}

}
