package UT2Practica1;

import java.util.Scanner;

public class Actividad6 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		int num;
		int abs;
		int rest;
		
		System.out.println("En este programa mostraremos el valor absoluto de un numero");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		num = leer.nextInt();
		System.out.println("");
		
		abs = Math.abs(num);
		
		System.out.println("El valor absoluto del numero es " + abs );
		System.out.println("");
		
		rest = abs%2;  //el simbolo % para calcular el resto
		
		System.out.println("El resto de " + abs + " entre 2 es " + rest);
		
		leer.close();
		
	}
}