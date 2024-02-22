package ahorcado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectorPalabra {

	private List<String> palabras;
	private static final Random RAND = new Random();

	@SuppressWarnings("serial")
	public SelectorPalabra() {
		palabras = new ArrayList<String>() {
			{
				add("azulejo");
				add("tenedor");
				add("terremoto");
				add("molinero");
				add("sofisticado");
				add("carretilla");
				add("saltamontes");
				add("teclado");
				add("primavera");
				add("culinario");
			}
		};
	}

	/**
	 * Randomly selects one of the Strings contained into List palabras.
	 * 
	 * @return a String containing the word to guess
	 */

	public String seleccionar() {
		return palabras.get(RAND.nextInt(0, palabras.size()));
	}
}
