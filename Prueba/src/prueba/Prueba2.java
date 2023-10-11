package prueba;

public class Prueba2 {

	public static void main(String[] args) {
	
		Integer x = 25;
		Integer y = 20;
		Integer z = 30;
		
		Boolean menorQueAmbos = x<y && x<z;
		Boolean menorQueAlguno = x<y || x<z;
		
		if (x>y) {
			System.out.println("Que sepas que x es mayor que y");
		}
		else {
			System.out.println("Menudo primo");
		}
		
		System.out.println(menorQueAmbos);
		System.out.println(menorQueAlguno);
		
	}

}
