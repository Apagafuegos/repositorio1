package ejercicio9;

	import java.util.Scanner;

	public class Ej9V2 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.println("¿Cuantos números vas a meter?");
			Integer longitudArray = sc.nextInt();
			Integer contador = 0;
			Integer arrayNum[] = new Integer[longitudArray];
			Integer arrayNumAux[] = new Integer[longitudArray];

			for (int i = 0; i < arrayNum.length; i++) {
				System.out.println("Introduce el número " + (i + 1));
				Integer numero = sc.nextInt();
				arrayNum[i] = numero;
				arrayNumAux[i] = numero;
			}
			for (int i = 1; i < arrayNumAux.length; i++) {

				for (int j = 0; j < i; j++) {

					if (arrayNumAux[i] < arrayNum[j]) {
						arrayNum[j] = arrayNumAux[i];
						arrayNum[j+1] = arrayNumAux[i-1];
						
						contador++;
					} else if (j < arrayNum.length - 1) {
						Integer previo =  arrayNum[i-1];
						arrayNum[j + 1] = arrayNumAux[i];
						arrayNum[j + 2] = previo;
						
						
						
					}

				}
			}

			for (int i = 0; i < arrayNum.length; i++) {
				System.out.print(arrayNum[i] + " ");
			}
			sc.close();
		}

	}

