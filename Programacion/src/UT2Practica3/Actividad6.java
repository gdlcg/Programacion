package UT2Practica3;

import java.util.Scanner;

public class Actividad6 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		
		float num;
		String unidad1;
		String unidad2;
		double x;
		
		System.out.println("En este programa convertiremos las medidas que el usuario proporcione");
		System.out.println("");
		System.out.println("Indique una unidad de longitud");
		System.out.println("");
		
		unidad1 = leer.nextLine();
		System.out.println("");
		
		System.out.println("Indique el valor de la medida");
		System.out.println("");
		
		num = leer.nextFloat();
		leer.nextLine();
		System.out.println("");
		
		System.out.println("Indique a que unidad desea pasarlo: m, km,");
		System.out.println("");
		
		unidad2 = leer.nextLine();
		System.out.println("");
		
		switch (unidad1) {
		case "cm":
			x = unidad2.equals("m") ? num*0.01: num*0.00001;  
//.equals cuando utilizamos string, lo que hace es comparar entre dos objetos. No usar nunca == para cadenas de texto
			
//si la unidad2 es igual a m; "x" = multiplicar el valor de la medida por 0.01 para pasarlo a metros
//si la unidad2 no es igual a m; "x" = multiplicar el valor de la medida por 0.00001 para pasarlo a kilometro
			
			System.out.println(num + " " + unidad1 + " convertido a " + unidad2 + " es " + x + " " + unidad2);
			break;
		case "m":
			x = unidad2.equals("cm") ? num*100: num*0.001;
			System.out.println(num + " " + unidad1 + " convertido a " + unidad2 + " es " + x + " " + unidad2);
			break;
		case "km":
			x = unidad2.equals("m") ? num*1000: num*100000;
			System.out.println(num + " " + unidad1 + " convertido a " + unidad2 + " es " + x + " " + unidad2);
			break;
		}	
		
		leer.close();
		
	}
}