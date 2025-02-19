package UT2Practica1;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		double cateto1;
		double cateto2;
		double suma;
		double hipo;
		
		System.out.println("En este programa se calculara la hipotenusa de un triangulo rectangulo");
		System.out.println("");
		System.out.println("Ingrese la medida de un cateto");
		System.out.println("");
		cateto1 = leer.nextDouble();
		System.out.println("");
		System.out.println("Ingrese la medida del otro cateto");
		System.out.println("");
		cateto2 = leer.nextDouble();
		System.out.println("");
		
		cateto1 = Math.pow(cateto1, 2);
		cateto2 = Math.pow(cateto2, 2);
		
		suma= cateto1+cateto2;
		
		System.out.println("La suma de los cuadrados de los catetos es: " + suma);
		System.out.println("");
		
		hipo = Math.sqrt(suma);  //math.sqrt es para la raiz cuadrada
		
		System.out.println("El lado de la hipotenusa es: " + hipo);
		
		leer.close();
		
	}

}