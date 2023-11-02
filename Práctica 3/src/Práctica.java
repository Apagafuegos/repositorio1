import java.util.Scanner;
//Código incorrecto AHORA MISMO 2/11/23
public class Práctica {

public static Integer[] fibonacci(Integer tamaño) {
		
		Integer[] sucesion = new Integer[tamaño]; //Este método genera un array con la sucesión de Fibonacci, con tantos términos como determine el usuario
		Integer fn1 = 0;
		Integer fn2 = 1;
		
		for (Integer i = 1; i < tamaño - 1; i++) { //Quito el = por lo que no llega al tamaño requerido e inicio i a 1, no a 0
			if (i == 0) {
				sucesion[i] = fn1; 
				//Quito el i++ por lo que no me imprime el primer 0
			}
				sucesion[i] = fn2;
			
			fn2 = fn2 + fn1;
			fn2 = fn2 - fn1; //Actualizo el fn2 mal

		}
		
		return sucesion;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		
		do {
			System.out.println("Introduce un número mayor que 2");
			num = sc.nextInt();
		} while (num < 2);//Aquí, sin el = permitiría meter 2 cuando no debería
		
		Integer[] arrayFibonacci = new Integer[num];
		arrayFibonacci = fibonacci(num);

		
		for (int k = 0; k <= arrayFibonacci.length; k++) { //OutOfBounds exception ya que debe ser estrictamente menor
			
			System.out.print(arrayFibonacci + " "); //No imprime cada posición
		} sc.close();
	}

}
