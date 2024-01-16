package ej32;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Reloj reloj1 = new Reloj();
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce las horas:");
		Integer horas = sc.nextInt();
		System.out.println("Introduce los minutos:");
		Integer minutos = sc.nextInt();
		System.out.println("Introduce los segundos:");
		Integer segundos = sc.nextInt();

		reloj1.ponerEnHora(horas, minutos, segundos);
		System.out.println(reloj1);
		reloj1.setFormato24Horas(false);
		System.out.println(reloj1);

		reloj1.ponerEnHora(24, 17);
		System.out.println(reloj1);
		reloj1.ponerEnHora(21, 82);
		System.out.println(reloj1);
		reloj1.ponerEnHora(17, 16, 15);
		System.out.println(reloj1);

		Reloj reloj2 = new Reloj(17, 16, 15);

		System.out.println(reloj1.equals(reloj2));

		sc.close();

	}
}