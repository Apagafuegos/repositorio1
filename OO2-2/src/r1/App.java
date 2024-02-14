package r1;

import java.math.BigDecimal;

public class App {

	public static void main(String[] args) {
		
		Smartphone s1 = new Smartphone("4952343654", "Samsung", "S33");
		System.out.println(s1);
		s1.desactivar();
		System.out.println(s1);
		s1.cambiarMarcaModelo("Apple", "iPhone 33");
		System.out.println(s1);
		s1.setPrecio(new BigDecimal(1000));
		System.out.println(s1.getPrecioIva());
		s1.rebajar();
		System.out.println(s1.getPrecioIva());
		s1.establecerFabricacion(2020);
		System.out.println(s1.getEdad());
	

	}

}
