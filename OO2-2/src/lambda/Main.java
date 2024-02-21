package lambda;

public class Main {

	public static void main(String[] args) {
		Printable lambda = (s) -> System.out.println("Eustaquio" + s);		
		imprimir(lambda);
	}

	static void imprimir(Printable rand) {
		rand.print(" pito");
	}

}
