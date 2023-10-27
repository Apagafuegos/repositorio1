package ejjercicio13;

public class Ej13 {

	public static void main(String[] args) {
		
		Integer filas = 10;
		Integer columnas = 10;
		
		Integer[][] arrayM = new Integer[filas][columnas];
		Integer num = 0;
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				num = i+1;
				arrayM[i][j] = num*(j + 1);
				num++;
			} 
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10 ; j++) {
				System.out.print(arrayM[i][j] + " ");
				
			}
			System.out.println();
		}

	}

}
