package ej33;

public class App {

	public static void main(String[] args) {
		
		Semaforo semaforo1 = new Semaforo();
		semaforo1.setColor("Negro");
		semaforo1.setColor(Semaforo.VERDE);
		semaforo1.setParpadeando(true);
		semaforo1.setColor(Semaforo.AMBAR);
		semaforo1.setParpadeando(true);
		
		for (int i = 0; i < 5; i++) {
			semaforo1.cambiarEstado();
			System.out.println(semaforo1);
		}
		
		Semaforo semaforo2 = semaforo1;
		System.out.println(semaforo1 + "\n" + semaforo2);



	}

}
