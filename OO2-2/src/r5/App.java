package r5;

public class App {

	public static void main(String[] args) {
		
		Biblioteca b1 = new Biblioteca();
		CD cd1 = new CD("4455313","Kanye West", "Graduation", 2007);
		Libro l1 = new Libro("86514653", "Adolf Hitler", "Mein Kampf", 1933);
		Revista r1 = new Revista("789654131", "Hola!", "Hola! Agosto", 2023);
		b1.addPublicacion(r1);
		b1.addPublicacion(cd1);
		b1.addPublicacion(l1);
		
		l1.prestar();
		cd1.prestar();
		l1.retirarParaConsulta();
		r1.retirarParaConsulta();
		
		System.out.println(cd1);
		System.out.println(r1);
		System.out.println(l1);
		
		l1.devolver();
		l1.retirarParaConsulta();
		l1.prestar();
		
		System.out.println(cd1);
		System.out.println(r1);
		System.out.println(l1);
		
		cd1.devolver();
		l1.terminarConsulta();
		r1.terminarConsulta();
		
		System.out.println("CD prestado : " + cd1.estaPrestado());
		System.out.println("Revista consultada: " + r1.estaConsultado());
		System.out.println("Libro consultado: " + l1.estaConsultado());
		System.out.println("Libro prestado: " + l1.estaPrestado());
	}

}
