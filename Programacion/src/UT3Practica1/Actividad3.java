package UT3Practica1;

import java.util.Scanner;

public class Actividad3 {
	
	public static double convertirACelsius (double a) {
		
		double cambio;
		
		cambio = (a*9/5)+32;
		
		return cambio;
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		double num, grado;
		
		System.out.println("En este programa convertiremos los grados que introduzca el usuario, expresados en celsius a fahrenheit");
		System.out.println("");
		System.out.println("Introzuca un valor para los grados");
		System.out.println("");
		
		num = leer.nextDouble();
		System.out.println();
		
		grado = convertirACelsius(num);
		
		System.out.println(num + "ºC expresados en fahrenheit son " + grado + "ºF");
		
		leer.close();
		
	}

}