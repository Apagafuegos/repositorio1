package ej50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {

	public static void main(String[] args) {

		Set<Pais> setPaises = new HashSet<>();
		System.out.println(setPaises);
		Pais p1 = new Pais("ES","España");
		Pais p2 = new Pais("CK","Islas Cook");
		Pais p3 = new Pais("CK","Islas Caimán");
		
		setPaises.add(p1);
		setPaises.add(p2);
		setPaises.add(p3);
		
		System.out.println(setPaises);
		
		Pais p4 = new Pais("es","España");
		System.out.println(p1.hashCode());
		System.out.println(p4.hashCode());
		setPaises.add(p4);
		System.out.println(setPaises);
		
		Iterator<Pais> it1 = setPaises.iterator();
		while(it1.hasNext()) {
			Pais aux = (Pais) it1.next();
			if(!aux.getCodigo().equals("ES"))
				it1.remove();
		}
		
		System.out.println(setPaises);
		setPaises.clear();
		System.out.println(setPaises);
		

	}

}
