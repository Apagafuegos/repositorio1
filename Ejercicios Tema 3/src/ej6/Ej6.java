package ej6;

import java.util.Random;
import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Integer manoMaquina = rand.nextInt(0, 4);
		Integer apuestaMaquina = 0;
		Integer apuestaUser = 0;
		Integer manoUser = 0;
		do {
			System.out.println("Evil CPU: ¿Cuantas chinas crees que tenemos entre los dos?");
			apuestaUser = sc.nextInt();
		} while (apuestaUser < 0 || apuestaUser > 6);

		do {
			apuestaMaquina = rand.nextInt(0, 7);// Para que no sea igual la apuesta del usuario ni la de la maquina
		} while (apuestaUser == apuestaMaquina && apuestaMaquina < manoMaquina);
		
		do {
			System.out.println("Ahora revela tu mano");
			manoUser = sc.nextInt();
		} while (manoUser < 0 || manoUser > 3);
		
		Integer totalMesa = manoMaquina + manoUser;
		
		System.out.println("Evil CPU: Yo apuesto que entre los dos tenemos " + apuestaMaquina + " chinas.");
		System.out.println("Evil CPU: Yo tengo " + manoMaquina + " chinas.");
		System.out.println("El total en la mesa es de " + totalMesa + " chinas.");		
		
		if (apuestaMaquina == totalMesa && apuestaUser == totalMesa) {
			System.out.println("Evil CPU: Empate :|");
		} else if (apuestaMaquina != totalMesa && apuestaUser == totalMesa) {
			System.out.println("Evil CPU: Ganas tú ᕕ༼ ͠ຈ Ĺ̯ ͠ຈ ༽┌∩┐");
		} else if (apuestaMaquina == totalMesa && apuestaUser != totalMesa) {
			System.out.println("Evil CPU: Gano yo MUAJAJAJAJ (づ｡◕‿‿◕｡)づ");
		} else if (apuestaMaquina != totalMesa && apuestaUser != totalMesa) {
			System.out.println("Evil CPU: Empate :|");
		}
		
		sc.close();
	}
	
}
