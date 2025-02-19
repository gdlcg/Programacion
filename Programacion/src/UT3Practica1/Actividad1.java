package UT3Practica1;

import java.util.Scanner;

public class Actividad1 {
	
	public static double calcularPromedio (double numero1, double numero2, double numero3) {
		
		double total;
		
		total = (numero1 + numero2 + numero3)/3;
		
		return (total);
		
	}

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		double a, b, c;
		double num;
		
		System.out.println("En este programa calcularemos el promedio de tres numeros");
		System.out.println("");
		System.out.println("Ingrese el primer numero");
		System.out.println("");
		
		a = leer.nextDouble();
		System.out.println("");
		System.out.println("Ingrese el segundo numero");
		System.out.println("");
		
		b = leer.nextDouble();
		System.out.println("");
		System.out.println("Ingrese el tercer numero");
		System.out.println("");
		
		c = leer.nextDouble();
		System.out.println("");
		
		
		num = calcularPromedio (a, b, c);
		
		System.out.println("El promedio de los tres numeros es " + num);
		
		leer.close();
		
	}

}