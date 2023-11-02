package prueba;

import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {

		Map<String, Integer> mapa1 = new HashMap<String, Integer>();

		mapa1.put("hola", 33);
		mapa1.put("alonso", 14);
		mapa1.put("sainz", 55);
		mapa1.put("hamilton", 44);

		for (Map.Entry<String, Integer> entry : mapa1.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.print(key + ": ");
			System.out.println(val);
		}

	}

}
