package clase1;

public class Main {

	public static void main(String[] args) {
		Libro lib1 = new Libro();
		lib1.setTitulo("Diario de Greg 1");
		lib1.setNumPag(217);
		
		System.out.println(lib1.getTitulo() + " -- " +  lib1.getNumPag());
		
		Enciclopedias enc1 = new Enciclopedias();
		enc1.setTitulo("Enciclopedia de pitos");
		enc1.setNumPag(2222);
		enc1.setTema("Penes");
		
		System.out.println(enc1.getTitulo() + " -- " +  enc1.getNumPag() + " -- " + enc1.getTema());
	}

}
