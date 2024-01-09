package ej18;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int j = 0;
		
		// Ejercicio 25

		Alumno[] arrayAlumnos = new Alumno[3];
		Curso cursoTodos = new Curso();
		cursoTodos.setId(1);
		cursoTodos.setDescripcion("DAM-DAW");
		
		for (int i = 0; i < arrayAlumnos.length; i++) {
			System.out.println("Introduce el DNI del alumno " + (i+1));
			arrayAlumnos[i] = new Alumno(sc.nextLine());
		}
		
		for (Alumno alumno : arrayAlumnos) {
			j++;
			System.out.println("Introduce el nombre del alumno s" + j);
			alumno.setNombre(sc.nextLine());
			System.out.println("Introduce la edad del alumno " + j);
			alumno.setEdad(sc.nextInt());
			System.out.println("Introduce la nota del alumno " + j);
			alumno.setNota(sc.nextInt());
			sc.nextLine();
			alumno.setCurso(cursoTodos);
		}
		
		System.out.println(arrayAlumnos[0].equals(arrayAlumnos[1]));
		
		for (Alumno alumno : arrayAlumnos) {
			System.out.println(alumno);
		}
		
		

		sc.close();

	}

}
