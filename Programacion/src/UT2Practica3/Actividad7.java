package UT2Practica3;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		
		
		int cat;
		double num;
		String x;
		
		System.out.println("En este programa calificaremos su impuesto en funcion de la categoria");
		System.out.println("");
		System.out.println("Indique su categoria");
		System.out.println("");
		
		cat = leer.nextInt();
		System.out.println("");
		
		switch (cat) {
		case 1:
			num = 1000;
			System.out.println("La tasa del impuesto correspondiente es " + num + " €");
			break;
		case 2:
			num = 750;
			System.out.println("La tasa del impuesto correspondiente es " + num + " €");
			break;
		case 3:
			num = 500;
			System.out.println("La tasa del impuesto correspondiente es " + num + " €");
			break;
		case 4:
			num = 250;
			System.out.println("La tasa del impuesto correspondiente es " + num + " €");
			break;
		}
		
		x = (cat>=4) ? "Alto" : (cat >=2 && cat <=3 ? "Medio" : "Bajo");
//si la categoria es mayor igual que 4 escribe Alto, si no, Si la categoria es mayor igual que 2 y menor igual que 3 escribe Medio, si no, escribe Bajo
		System.out.println("Esta es la calificacion segun tu categoria: " + x);
		
		leer.close();
	}
}