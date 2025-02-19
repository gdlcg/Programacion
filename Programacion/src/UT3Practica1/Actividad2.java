package UT3Practica1;

import java.util.Scanner;

public class Actividad2 {
	
	public static String concatenar (String a, String b) {
		
		String suma;
		
		suma = a+b;

		return suma;
		
	}
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String a, b, c;
		
		System.out.println("En este programa concatenaremos dos parametros");
		System.out.println("");
		System.out.println("Introduzca un elemento");
		System.out.println("");
		
		a = leer.nextLine();
		System.out.println("");
		System.out.println("Introduzca otro elemento");
		System.out.println("");
		
		b = leer.nextLine();
		System.out.println("");
		
		
		c = concatenar (a,b);
		
		System.out.println("El concatenado entre los dos elementos es " + c);
		
		leer.close();
		
		
		
	}

}