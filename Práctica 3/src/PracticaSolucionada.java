import java.util.Scanner;

public class PracticaSolucionada {

public static Integer[] fibonacci(Integer tamaño) {
		
		Integer[] sucesion = new Integer[tamaño]; //Este método genera un array con la sucesión de Fibonacci, con tantos términos como determine el usuario
		Integer fn1 = 0;
		Integer fn2 = 1;
		
		for (Integer i = 0; i <= tamaño - 1; i++) { 
			if (i == 0) {
				sucesion[i] = fn1; 
				i++;
			}
				sucesion[i] = fn2;
			
			fn2 = fn2 + fn1;
			fn1 = fn2 - fn1; 

		}
		
		return sucesion;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer num = 0;
		
		do {
			System.out.println("Introduce un número mayor que 2");
			num = sc.nextInt();
		} while (num <= 2);
		
		Integer[] arrayFibonacci = new Integer[num];
		arrayFibonacci = fibonacci(num);

		
		for (int k = 0; k < arrayFibonacci.length; k++) { 
			
			System.out.print(arrayFibonacci[k] + " "); 
		} sc.close();
	}
	
}
