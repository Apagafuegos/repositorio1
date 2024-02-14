package bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PruebaBigDecimal {

	public static void main(String[] args) {

		BigDecimal x = new BigDecimal(12.654654); 
		System.out.println(x);
		System.out.println(x.setScale(2, RoundingMode.HALF_DOWN));
	}

}
