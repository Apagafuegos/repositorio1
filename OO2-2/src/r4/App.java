package r4;

import java.math.BigDecimal;
import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		
		Libreria lib1 = new Libreria("Avda. De Los Sueños Perdidos", 954696954);		
		LibroDigital ld1 = new LibroDigital("Diario de Greg 1", "Greg Heffley", LocalDate.now(), 217);
		LibroDigital ld2 = new LibroDigital("Diario de Greg 2", "Greg Heffley", LocalDate.of(2007, 9, 17), 217);
		LibroFisico lf1 = new LibroFisico("Diario de Greg 1", "Greg Heffley", LocalDate.now(), 217,new BigDecimal(20),new BigDecimal(30),533);
		LibroFisico lf2 = new LibroFisico("Diario de Greg 1", "Greg Heffley", LocalDate.of(2007,9,17), 217,new BigDecimal(20.3),new BigDecimal(25.6),889);
		
		lib1.getListaLibros().add(ld1);
		lib1.getListaLibros().add(ld2);
		lib1.getListaLibros().add(lf1);
		lib1.getListaLibros().add(lf2);
		System.out.println(lib1);
		
		System.out.println("El peso total de los libros es de "+lib1.obtenerPesoTotalLibros());
		System.out.println("Los libros de la librería tienen de media de paginas: " + lib1.obtenerNumPagMedio());
		
		

	}
}
