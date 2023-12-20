package printNum;

public class PrintNum {

	public static void main(String[] args) {
		imprimir(1);
	}

	public static void imprimir(Integer num) {
		if (num <= 100) {
			System.out.print(num + " ");
			num++;
			imprimir(num);
		}
	}

}
