package ej18;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Ejercicio 25

		Alumno[] arrayAlumnos = new Alumno[3];
		Curso cursoTodos = new Curso(3);
		cursoTodos.setId(1);
		cursoTodos.setDescripcion("DAM-DAW");

		for (int i = 0; i < arrayAlumnos.length; i++) {
			do {
				System.out.println("Introduce el DNI del alumno " + (i + 1));
				if (i == 0) {
					arrayAlumnos[i] = new Alumno(sc.nextLine());
				} else {
					do {
						arrayAlumnos[i] = new Alumno(sc.nextLine());
						if (arrayAlumnos[i].equals(arrayAlumnos[i - 1])) {
							System.err.println("Alumno repetido, introduzca el DNI de nuevo");
						} else if (arrayAlumnos[i].equals(arrayAlumnos[0]) && i == 2) {
							System.err.println("Alumno repetido, introduzca el DNI de nuevo");
						}
					} while (arrayAlumnos[i].equals(arrayAlumnos[i - 1])
							|| arrayAlumnos[i].equals(arrayAlumnos[0]));
				}
				System.out.println("Introduce el nombre del alumno " + (i + 1));
				arrayAlumnos[i].setNombre(sc.nextLine());
				System.out.println("Introduce la edad del alumno " + (i + 1));
				arrayAlumnos[i].setEdad(sc.nextInt());
				System.out.println("Introduce la nota del alumno " + (i + 1));
				arrayAlumnos[i].setNota(sc.nextInt());
				sc.nextLine();
				arrayAlumnos[i].setCurso(cursoTodos);
				if (!arrayAlumnos[i].validar()) {
					System.err.println("Datos no válidos, introduzcalos de nuevo.");
				}
			} while (!arrayAlumnos[i].validar());

		}

		for (int i = 0; i < arrayAlumnos.length; i++) {
			cursoTodos.addAlumno(arrayAlumnos[i]);
		}

		sc.close();

	}

}
