package ej47;

public class App {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("12345678X", "Blas De Los Montes");
		CarritoCompra carrito1 = new CarritoCompra(cliente1);
		System.out.println(carrito1);
		Ropa poncho = new Ropa(20, "XL", "Poncho", "Azul");
		carrito1.addArticulo(poncho);
		carrito1.addArticulo(poncho);
		System.out.println(carrito1);
		Libro libro1 = new Libro(15, "Así habló Zaratrusta", "Nieztche");
		carrito1.addArticulo(libro1);
		carrito1.borrarArticulo(poncho);
		Integer precioMedio = carrito1.getPrecioMedio();
		System.out.println(precioMedio);
		carrito1.vaciarCesta();
		System.out.println(carrito1);
		precioMedio = carrito1.getPrecioMedio();
		System.out.println(precioMedio);

	}

}
