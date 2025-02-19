package UT2Practica2;

import java.util.Scanner;

public class Actividad4 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		float a;
		float b;
		float c;
		
		System.out.println("En este programa mostraremos cual es el numero mayor entre los tres");
		System.out.println("");
		System.out.println("Ingrese el primer numero");
		System.out.println("");
		a = leer.nextFloat();
		System.out.println("");
		System.out.println("Ingrese el segundo numero");
		System.out.println("");
		b = leer.nextFloat();
		System.out.println("");
		System.out.println("Ingrese un tercer numero");
		System.out.println("");
		c = leer.nextFloat();
		System.out.println("");
		
		if (a>b && a>c) {
			System.out.println("El numero mayor de los tres es " + a );
		}else if (b>a && b>c) {
			System.out.println("El numero mayor de los tres es " + b);
		}else if (c>a && c>b) {
			System.out.println("El numero mayor de los tres es " + c);
		}
		System.out.println("");
		
		leer.close();
	}
}