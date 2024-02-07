package sets;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Hola");
		conjunto.add("Hola");
		System.out.println(conjunto);
		
		for (String string : conjunto) {
			System.out.println(string);
		}
		

	}

}
