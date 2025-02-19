package UT2Practica1;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int hora;
		double min;
		double seg;
		
		System.out.println("En este programa convertiremos las horas en minutos y en segundos");
		System.out.println("");
		System.out.println("Ingrese el numero de horas");
		System.out.println("");
		
		hora = leer.nextInt();
		System.out.println("");
		
		min = hora*60;
		
		seg = min*60;
		
		System.out.println(hora +" horas son " + min + "minutos");
		System.out.println("");
		System.out.println(hora + " horas son " + seg + " segundos");
		
		leer.close();
		
	}
}