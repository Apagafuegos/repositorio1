package ej45;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ej45 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaNacimiento = null;
		String fecha = null;
		
		do {
			System.out.println("Introduce tu fecha de nacimiento con el formato DD/MM/YYYY");
			fecha = sc.nextLine();
			if(formatinCorrecto(fecha)) {
				fechaNacimiento = LocalDate.parse(fecha,formateador);
			}else {
				System.err.println("Fecha con formato incorrecto");
			}
		}while(!formatinCorrecto(fecha));
		
		
		if(fechaNacimiento.isLeapYear()) {
			System.out.println("Naciste en un año bisiesto!");
		}
		Period edad = fechaNacimiento.until(LocalDate.now());
		System.out.println("Tienes " + edad.getYears() + " años!" );
		LocalDate fechaMuerte = fechaNacimiento.plusYears(100);
		Period vida = LocalDate.now().until(fechaMuerte);
		System.out.println("Te quedan " + vida.getYears() + " años, " + vida.getDays() + " meses y " + vida.getDays() + " días de vida." );
		System.out.println("You were born in a " + fechaNacimiento.getDayOfWeek());
		LocalTime hora = LocalTime.now();
		System.out.println("Son las " + hora.getHour() + ":" + hora.getMinute() + ":" + hora.getSecond());
		
		

	}
	
	public static Boolean formatinCorrecto(String fecha) {
		if(fecha.isEmpty()) 
			return false;
		else if(fecha.indexOf("/") == 2 && fecha.lastIndexOf("/") == 5 && fecha.substring(5,9).length() == 4) 
			return true;
		
		return false;
		
	}

}
