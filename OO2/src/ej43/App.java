package ej43;

public class App {

	public static void main(String[] args) {

		Actor actor1 = new Actor("Blas Blau", "España", 1983);
		Actor actor2 = new Actor("Laura Pozo", "Italia", 1981);
		Actor actor3 = new Actor("Marcel Cade", "Suiza", 2001);
		Actor actor4 = new Actor("Violeta Vodo", "Rusia", 1999);

		Director director1 = new Director("Sara Marea", "Portugal", 1994);

		Guionista guionista1 = new Guionista("Marco Smith", "Reino Unido", 1988);
		Guionista guionista2 = new Guionista("Cheng Shu", "China", 1977);

		Pelicula peli1 = new Pelicula();
		peli1.setAñoEstreno(2027);
		peli1.setTitulo("Do you know Joe Blas?");
		peli1.getListaActores().add(actor1);
		peli1.getListaActores().add(actor2);
		peli1.setDirector(director1);
		peli1.setGuionista(guionista1);

		Pelicula peli2 = new Pelicula();
		peli2.setAñoEstreno(2027);
		peli2.setTitulo("Muerte en la sombra");
		peli2.setDirector(director1);
		peli1.setGuionista(guionista2);
		peli2.getListaActores().add(actor1);
		peli2.getListaActores().add(actor2);
		peli2.getListaActores().add(actor3);
		peli2.getListaActores().add(actor4);

		System.out.println(peli1.getListaActores());
		System.out.println(guionista1.getSueldo() + " " + guionista1.getNacionalidad());
		peli2.getListaActores().remove(actor3);
		peli1.getListaActores().add(actor3);

		System.out.println(peli1.getListaActores());
		System.out.println(peli2.getListaActores());

	}

}
