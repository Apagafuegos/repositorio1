package ej51;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej51 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<BigDecimal> lista = new ArrayList<>();
		Integer cantNum = 0;
		
		do {
			System.out.println("Introduce un decimal");
			BigDecimal num = sc.nextBigDecimal();
			if(cantNum == 0 || num.compareTo(lista.get(cantNum - 1)) > 0) {
				lista.add(num);
				cantNum++;
			}else {
				System.err.println("Tiene que ser mayor que el anterior");
			}
		}while(cantNum < 5);
		
		BigDecimal suma = BigDecimal.ZERO;
		
		for (BigDecimal bigDecimal : lista) {
			suma = suma.add(bigDecimal);
		}
		
		suma = suma.setScale(1, RoundingMode.HALF_DOWN);
		System.out.println(suma);
		
		BigDecimal division = lista.get(0).divide(lista.get(1),3, RoundingMode.HALF_UP);
		System.out.println(division);
		
		sc.close();
	}

}
