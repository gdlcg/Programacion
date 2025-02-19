package UT2Practica1;

import java.util.Scanner;

public class Actividad9 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int año;
		int actual;
		int edad;
		
		System.out.println("En este programa calcularemos tu edad");
		System.out.println("");
		System.out.println("Ingrese su año de nacimiento");
		System.out.println("");
		año = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese el año actual");
		System.out.println("");
		actual = leer.nextInt();
		System.out.println("");
		
		edad = actual-año;
		
		System.out.println("Su edad es de " + edad);
		
		leer.close();
		
	}
}