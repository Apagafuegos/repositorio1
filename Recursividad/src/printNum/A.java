package printNum;

public class A {

	public static void main(String[] args) {
		Integer a  = sumar(100);
		System.out.println(a);
	}

	private static Integer sumar(Integer num) {
		if (num > 1) {
			return num + sumar(num - 1);
		} else {
			return 1;
		}
	}

}
