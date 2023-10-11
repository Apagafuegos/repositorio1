package tema2;
import java.util.Scanner;

public class Ejj12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String login;
		
		do {
			System.out.println("Introduzca su usuario");
			login = sc.nextLine().trim().toUpperCase();
			Boolean aux = login.length() < 10;
			Boolean aux2 =login.contains(" ");
		}while(login.length() < 10 || login.contains(" "));
		
		System.out.println("Bienvenido, " + login);
	}

}
