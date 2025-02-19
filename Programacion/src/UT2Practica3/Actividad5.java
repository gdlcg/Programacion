package UT2Practica3;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		double x;
		double fin;
		
		System.out.println("En este programa aignaremos un descuento en funcion del valor de la compra");
		System.out.println("");
		System.out.println("Inserte el valor de la compra");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		x = num>100?num*0.1:num*0.05;
		
		System.out.println("Se le ha aplicado un descuento de " + x);
		System.out.println("");
		fin = num-x;
		System.out.println("El valor final es de " + fin + " euros");
		
		leer.close();
	}
}