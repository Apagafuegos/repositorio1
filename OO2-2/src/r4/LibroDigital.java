package r4;

import java.time.LocalDate;

public class LibroDigital extends Libro{

	public LibroDigital(String titulo, String autor, LocalDate fecha, Integer paginas) {
		super(titulo, autor, fecha, paginas);
	}
	
	public Integer getPeso() {
		return 0;
	}
	
	@Override
	public String getTipo() {
		return "Digital";
	}
}
