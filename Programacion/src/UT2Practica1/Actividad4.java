package UT2Practica1;

import java.util.Scanner;

public class Actividad4 {
	
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		
		int a;
		int b;
		int suma;
		int resta;
		int mult;
		double div;
		System.out.println("En este programa hara operaciones con los numeros ingresados por el usuario");
		System.out.println("");
		System.out.println("Ingrese un primer numero para a");
		System.out.println("");
		a = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese un segundo numero para b");
		System.out.println("");
		b = leer.nextInt();
		System.out.println("");
		
		suma = a+b;
		System.out.println("La suma de " + a + " + " + b + " = " + suma);
		resta = a-b;
		System.out.println("La resta de " + a + " - " + b + " = " + resta);
		mult=a*b;
		System.out.println("La multiplicacion de " + a + " * " + b + " = " + mult);
		div = (double) a/b;
//para que salgan los decimales en la division devemos poner double antes de la opercion y tanto arriba como abajo tiene que estar double
		System.out.println("La division de " + a + " / " + b + " = " + div);
		
		leer.close();
	}
	
}