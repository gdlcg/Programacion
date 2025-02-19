package UT2Practica1;

import java.util.Scanner;

public class Actividad8 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		double num;
		double arriba;
		double abajo;
		
		System.out.println("En este programa redondearemos el numero con parte decimal ingresado por el usuario por arriba y por abajo");
		System.out.println("");
		System.out.println("Ingrese un numero con decimales");
		System.out.println("");
		
		num = leer.nextDouble();
		System.out.println("");
		
		arriba = Math.ceil(num);
		
		abajo = Math.floor(num);
		
		System.out.println("El numero " + num + " redondeado por arriba es " + arriba);
		System.out.println("");
		System.out.println("El numero " + num + " redondeado por abajo es " + abajo);
		
		leer.close();
		
		
		
		
	}
}