package ejjercicio11;

public class Ej11 {

	public static void main(String[] args) {
		
		Integer columnas = 10;
		Integer filas = 5;
		Integer num = 1;
		Integer[][] arrayM = new Integer[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas ; j++) {
				arrayM[i][j] = num;
				num++;
			}
			
		}
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas ; j++) {
				System.out.print(arrayM[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
