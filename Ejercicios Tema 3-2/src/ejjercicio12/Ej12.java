package ejjercicio12;

public class Ej12 {

	public static void main(String[] args) {
		
		Integer[][] arrayM = new Integer[10][10];
		Integer num = 0;
		
		for (int i = 0; i < 10; i++) {
			
			for (int j = 0; j < 10; j++) {
				num = i;
				arrayM[i][j] = num*j;
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
