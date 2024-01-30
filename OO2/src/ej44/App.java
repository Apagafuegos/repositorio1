package ej44;

public class App {

	public static void main(String[] args) {

		Jugador j1 = new Jugador("Carlos");
		Asesino as1 = new Asesino("Berbiquí", "B33");
		Asesino as2 = new Asesino("Berbiquí2", "B34");
		Asesino as3 = new Asesino("Berbiquí3", "B35");
		j1.getEquipo().addPersonaje(as1);
		j1.getEquipo().addPersonaje(as2);
		j1.getEquipo().addPersonaje(as3);

		Parasito p1 = new Parasito("Blas", "B69");
		System.out.println(p1.getDaño());
		j1.getEquipo().addPersonaje(p1);

		System.out.println(j1.getEquipo().getPuntosVida());
		j1.getEquipo().addPersonaje(p1);
		System.out.println(j1.getEquipo());

		Parasito p2 = new Parasito("Pepe", "P69");
		Parasito p3 = new Parasito("Estopa", "E69");
		j1.getEquipo().addPersonaje(p2);
		j1.getEquipo().addPersonaje(p3);
		System.out.println(j1.getEquipo());
		System.out.println(j1.getEquipo().getPuntosVida());

	}

}
