package ej18;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Alumno[] arrayAlumnos = new Alumno[3];
		List<Alumno> arrayAlumnos = new ArrayList<>();
		Curso cursoTodos = new Curso();
		cursoTodos.setId(1);
		cursoTodos.setDescripcion("DAM-DAW");

//		for (int i = 0; i < 3; i++) {
//			do {
//				System.out.println("Introduce el DNI del alumno " + (i + 1));
//				if (i == 0) {
//					arrayAlumnos.add(new Alumno(sc.nextLine()));
//				} else {
//					do {
//						arrayAlumnos.add(new Alumno(sc.nextLine()));
//						if (arrayAlumnos.get(i).equals(arrayAlumnos.get(i-1))) {
//							System.err.println("Alumno repetido, introduzca el DNI de nuevo");
//						} else if (arrayAlumnos.get(i).equals(arrayAlumnos.get(0)) && i == 2) {
//							System.err.println("Alumno repetido, introduzca el DNI de nuevo");
//						}
//					} while (arrayAlumnos.get(i).equals(arrayAlumnos.get(i-1)) || arrayAlumnos.get(i).equals(arrayAlumnos.get(0)));
//				}
//				System.out.println("Introduce el nombre del alumno " + (i + 1));
//				arrayAlumnos.get(i).setNombre(sc.nextLine());
//				System.out.println("Introduce la edad del alumno " + (i + 1));
//				arrayAlumnos.get(i).setEdad(sc.nextInt());
//				System.out.println("Introduce la nota del alumno " + (i + 1));
//				arrayAlumnos.get(i).setNota(sc.nextInt());
//				sc.nextLine();
//				arrayAlumnos.get(i).setCurso(cursoTodos);
//				if (arrayAlumnos.get(i).validar()) {
//					System.err.println("Datos no válidos, introduzcalos de nuevo.");
//				}
//			} while (!arrayAlumnos.get(i).validar());
//
//		}

		for (int i = 0; i < 3; i++) {
			Boolean check = true;
			do {
				do {
					System.out.println("Introduce el DNI del alumno " + (i + 1));
					Alumno aux = new Alumno(sc.nextLine());
					if (arrayAlumnos.contains(aux)) {
						System.err.println("Alumno repetido, introduzcalo de nuevo");
					} else {
						arrayAlumnos.add(aux);
						check = false;
					}
				} while (check);
				
				System.out.println("Introduce el nombre del alumno " + (i + 1));
				arrayAlumnos.get(i).setNombre(sc.nextLine());
				System.out.println("Introduce la edad del alumno " + (i + 1));
				arrayAlumnos.get(i).setEdad(sc.nextInt());
				System.out.println("Introduce la nota del alumno " + (i + 1));
				arrayAlumnos.get(i).setNota(sc.nextInt());
				sc.nextLine();
				arrayAlumnos.get(i).setCurso(cursoTodos);
				if (!arrayAlumnos.get(i).validar()) {
					System.err.println("Alguno(s) de los datos no es válido, introduzcalos de nuevo.");
				}

			} while (!arrayAlumnos.get(i).validar());
		}

		for (int i = 0; i < arrayAlumnos.size(); i++) {
			cursoTodos.addAlumno(arrayAlumnos.get(i));
		}

		System.out.println(cursoTodos);

		sc.close();

	}

}
