package ej41;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Equipo eq1 = new Equipo("FCB");
		Jugador j1 = new Jugador("Gavi", 6);
		Jugador j2 = new Jugador("Fermín", 30);
		Jugador j3 = new Jugador("Araújo", 4);
		eq1.jugadores.add(j1);
		eq1.jugadores.add(j2);
		eq1.jugadores.add(j3);
		eq1.setCapitan(eq1.jugadores.get(0));
		
		
		Equipo eq2 = new Equipo("RMA");
		Jugador j4 = new Jugador("Vinicius", 7);
		Jugador j5 = new Jugador("Camavinga", 14);
		Jugador j6 = new Jugador("Courtois", 1);
		eq2.jugadores.add(j4);
		eq2.jugadores.add(j5);
		eq2.jugadores.add(j6);
		eq2.setCapitan(eq2.jugadores.get(0));
		
		System.out.println(eq1);
		System.out.println(eq2);
		
		Resultado resultado1 = new Resultado();
		System.out.println("¿Resultado del partido?");
		resultado1.setGolesLocales(sc.nextInt());
		resultado1.setGolesVisitantes(sc.nextInt());
		
		Partido clasico = new Partido();
		clasico.setEquipoLocal(eq1);
		clasico.setEquipoVisitante(eq2);		
		clasico.setResultado(resultado1);
		System.out.println(clasico);
		System.out.println(clasico.equipoGanador());
		
		Jugador negreira = new Jugador("Blas Infiltrado", 99);
		clasico.getEquipoVisitante().jugadores.add(negreira);
		System.out.println(eq2);
		
		eq1.setCapitan(eq1.jugadores.get(eq1.jugadores.size() - 1));
		System.out.println(eq1);
		
		eq1.setCompeticion("Liga Nacional");
		System.out.println(eq2.getCompeticion());
		
		eq2.setCompeticion("Copa Internacional");
		System.out.println(eq1.getCompeticion());
		
		sc.close();
		
		
		

	}

}
