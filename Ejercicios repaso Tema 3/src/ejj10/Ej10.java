package ejj10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuántos alumnos hay?");
		Integer numAlumnos = sc.nextInt();
		sc.nextLine();
		Double[] notasMedias = new Double[numAlumnos];
		Double[] notasAlumno = new Double[3];
		String[] alumnos = new String[numAlumnos];
		Double notaMedia;
		Double notaExamen = 0.0;
		Integer contAlumnos = 0;
		Integer i;

		do {
			System.out.println("Introduce el nombre del alumno " + (contAlumnos + 1));
			String nombre = sc.nextLine();
			alumnos[contAlumnos] = nombre;
			for (i = 0; i < notasAlumno.length; i++) {
				do {
					System.out.println("Introduce la nota del examen " + (i + 1));
					notaExamen = sc.nextDouble();
				} while (notaExamen < 0 || notaExamen > 10);
				notasAlumno[i] = notaExamen;
			}
			sc.nextLine();
			notaMedia = 0.0;
			for (int j = 0; j < notasAlumno.length; j++) {
				notaMedia += notasAlumno[j];
			}
			notaMedia = notaMedia / 3;
			notasMedias[contAlumnos] = notaMedia;
			contAlumnos++;
		} while (contAlumnos < numAlumnos);

		System.out.println("LISTADO DE NOTAS");
		for (int j = 0; j < alumnos.length; j++) {
			System.out.println("Alumno: " + alumnos[j] + " - Nota media: " + notasMedias[j]);
		}
		notaMedia = 0.0;
		for (Double media : notasMedias) {
			notaMedia += media;
		}
		System.out.println("La media de los alumnos ha sido de " + notaMedia / numAlumnos);
	}
}