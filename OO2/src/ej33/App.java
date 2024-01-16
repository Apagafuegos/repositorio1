package ej33;

public class App {

	public static void main(String[] args) {
		
		Semaforo semaforo1 = new Semaforo();
		semaforo1.setColor("Negro");
		semaforo1.setColor("Verde");
		semaforo1.setParpadeando(true);
		semaforo1.setColor("Ámbar");
		semaforo1.setParpadeando(true);
		
		for (int i = 0; i < 6; i++) {
			semaforo1.cambiarEstado();
			System.out.println(semaforo1);
		}
		
		Semaforo semaforo2 = semaforo1;
		System.out.println(semaforo1 + " " + semaforo2);



	}

}
