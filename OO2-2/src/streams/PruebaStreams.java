package streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PruebaStreams {

	public static void main(String[] args) {
		
		Map<String, String> prueba = new HashMap<>();
		prueba.put("Carlos","55");
		prueba.put("Alonso","14");
		prueba.put("Hamilton","44");
		prueba.put("Verstappen","33");
		
		Set<String> keys = prueba.keySet();
		for (String key : keys) {
			System.out.print(key);
			System.out.println(" ---> " + prueba.get(key));
		}
		
		for (Entry<String, String> dupla : prueba.entrySet()) {
			System.out.print(dupla.getKey());
			System.out.println(" " + dupla.getValue());
		}
		
		for (Iterator<String> iterator = prueba.keySet().iterator(); iterator.hasNext();) {
			String key = (String) iterator.next();
			if(key.startsWith("V")) {
				iterator.remove();
			}
			
		}
	}

}
