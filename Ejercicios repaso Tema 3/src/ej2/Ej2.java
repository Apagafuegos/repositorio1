package ej2;

public class Ej2 {

	public static void main(String[] args) {

		Integer[] listaNotas = new Integer[] { 7, 9, 8, 4, 0, 6, 3, 4, 1, 7, 3, 1, 9, 10 };
		Double notaTotalAprobados = 0.00;
		Integer aprobados = 0;

		for (int i = 0; i < listaNotas.length; i++) {
			if (listaNotas[i] >= 5) {
				notaTotalAprobados = notaTotalAprobados + listaNotas[i];
				aprobados++;
			}
		}

		Double notaMedia = notaTotalAprobados / aprobados;

		System.out.println("La nota media de los aprobados es " + notaMedia);

	}
}
