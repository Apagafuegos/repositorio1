package prueba;

public class Arrays {

	
	public class Piloto{
		public String nombre;
		public Integer numero;
		public Integer victorias;
		
		Piloto(String nombre, Integer numero, Integer victorias) {
			this.nombre = nombre;
			this.numero = numero;
			this.victorias = victorias;
			}
		
	public static void main(String[] args) {
		
		String array[] = {"Fernando","Alonso","Díaz","Parera"};	
		String[] array2 = new String[10];
		
		//Integer n = 0;
		
//		while(n<array.length) {
//			System.out.print(array[n] + " ");
//			n++;
//		}
//		
//		for(Integer n = 0;n<array.length;n++) {
//			System.out.print(array[n] + " ");
//		}
		
		for(Integer n2 = 0 ; n2<array2.length;n2++) {
			
			array2[n2] = n2.toString(); 
		}
		
		for(Integer n3=0;n3<array2.length;n3++) {
			System.out.print(array2[n3] + " ");
		}
		
		Piloto[] Pilotos = new Piloto[3]; 
			
		}
		
		
		
	}

}
