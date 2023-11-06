package ejjercicio11;

public class Ej11 {

	public static void main(String[] args) {

		Integer columnas = 10;
		Integer filas = 5;
		Integer num = 1;
		Integer contador = 0;
		Integer[][] arrayM = new Integer[filas][columnas];
		Integer[][] arrayM2 = new Integer[filas][columnas];

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				arrayM[i][j] = num;
				num++;
			}

		}

//		for (int i = 0; i < arrayM2.length; i++) {
//			Integer[] arrayInterior = arrayM2[i];
//			for (int j = 0; j < arrayInterior.length; j++) {
//				arrayInterior[j] = j + 1 + contador;
//			}
//			contador += 10;
//		}

		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(arrayM[i][j] + " ");

			}
			System.out.println();

		}
//		System.out.println("-------------------");	
//		for (int j = 0; j < filas; j++) {
//			for (int j2 = 0; j2 < columnas; j2++) {
//				System.out.print(arrayM2[j][j2] + " ");
//			}
//			System.out.println();
//		}

	}
}
