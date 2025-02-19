package UT2Practica2;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int lado1;
		int lado2;
		int lado3;
		
		System.out.println("En este programa veremos si con las longitudes de los lados se puede formar un triangulo o no y que tipo de triangulo es");
		System.out.println("");
		System.out.println("Ingrese la medida de un primer lado");
		System.out.println("");
		lado1 = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese la medida del segundo lado");
		System.out.println("");
		lado2 = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese la medida del ultimo lado");
		System.out.println("");
		lado3 = leer.nextInt();
		System.out.println("");
		
		if (lado1 >= (lado2 + lado3) || lado2 >= (lado1 + lado3) || lado3 >= (lado1 + lado2)) {
		    System.out.println("No se puede formar un triángulo");
		} else {
		    System.out.println("Se puede formar un triángulo");
		    if (lado1 == lado2 && lado1 == lado3) {
		        System.out.println("El triángulo es equilátero");
		    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
		        System.out.println("El triángulo es isósceles");
		    } else {
		        System.out.println("El triángulo es escaleno");
		    }
		}

		
		leer.close();
		
	}
	
}