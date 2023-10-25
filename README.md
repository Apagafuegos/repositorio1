# Repository 1
Different scripts I got to do for my Java programming class. Uploaded here for convenience.

## Ejercicios 1
Scripts for the introduction of the language, getting to know the different kind of data types and methods we can use in Java. <br>
Example:

```
System.out.println("Say a number");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine(); //Converting string into long

    Long x1 = Long.parseLong(a);
    System.out.println("x1:" + x1);
```
## Repaso
Going over everything used in the first topic of the course. <br>
Example:
```
import java.util.Scanner;

public class Repaso3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		
		System.out.println("Deme un número entero:");
		String n1 = sc.nextLine();
		System.out.println("Deme otro número entero:");
		String n2 = sc.nextLine();
		
		Double x = Double.parseDouble(n1);
		Double y = Double.parseDouble(n2);
		
		System.out.println("El resultado de la multiplicación de ambos números es: " + x*y);
		
		sc.close();
	}

}
```
## Ejercicios Tema 2, Ejercicios Practicos Repaso 2, Ejercicios Tema 3 (aka advanced exercices, just badly named)
Starting to use the control structures and the different kinds of loops, as well as the modifying and manipulation of strings and generation of random numbers. <br>
Example: 
```
import java.util.Random;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		Integer manoMaquina = rand.nextInt(0, 4);
		Integer apuestaMaquina = 0;
		Integer apuestaUser = 0;
		Integer manoUser = 0;
		Integer victoriasUser = 0;
		Integer victoriasCPU = 0;
		Integer empates = 0;
		String seleccion = "";
		
		do {
			do {
				System.out.println("Evil CPU: ¿Cuantas chinas crees que tenemos entre los dos?");
				apuestaUser = sc.nextInt();
			} while (apuestaUser < 0 || apuestaUser > 6);
	
			do {
				apuestaMaquina = rand.nextInt(0, 7);// Para que no sea igual la apuesta del usuario ni la de la maquina
			} while (apuestaUser == apuestaMaquina);
			
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
				empates++;
			} else if (apuestaMaquina != totalMesa && apuestaUser == totalMesa) {
				System.out.println("Evil CPU: Ganas tú ᕕ༼ ͠ຈ Ĺ̯ ͠ຈ ༽┌∩┐");
				victoriasUser++;
			} else if (apuestaMaquina == totalMesa && apuestaUser != totalMesa) {
				System.out.println("Evil CPU: Gano yo MUAJAJAJAJ (づ｡◕‿‿◕｡)づ");
				victoriasCPU++;
			} else if (apuestaMaquina != totalMesa && apuestaUser != totalMesa) {
				System.out.println("Evil CPU: Empate :|");
				empates++;
			}
			System.out.println("Evil CPU: ¿Quieres seguir jugando?");
			sc.nextLine();
			seleccion = sc.nextLine().toLowerCase();
			
		}while(seleccion.equals("si"));
		
		System.out.println("El marcador final ha sido: " + victoriasUser + " victoria(s) para tí, " + victoriasCPU + " victoria(s) para EvilCPU y " + empates + " empate(s).");
		
		sc.close();
	}

}
```
