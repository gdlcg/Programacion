package Repaso;

import java.util.Scanner;

public class Repaso002 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		double radio;
		double area;
		
		System.out.println("En este programa calcularemos el area de un circulo");
		System.out.println("");
		System.out.println("Ingrese el valor del radio");
		System.out.println("");
		
		radio = leer.nextDouble();
		System.out.println("");
		
		area = Math.PI*Math.pow(radio, 2);
		
		System.out.println("El area del circulo es " + area);
		
		leer.close();
		
	}

}