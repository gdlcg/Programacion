package UT2Practica1;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		double celsius;
		double fah;
		System.out.print("Ingrese una temperatura en grados Celsius");
		celsius = leer.nextDouble();
		fah = (celsius * 1.8) + 32;
		System.out.println("La temperatura en Fahrenheit es: " + fah + "grados");
		leer.close();
	}
}