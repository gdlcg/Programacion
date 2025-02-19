package UT3Practica1;

import java.util.Scanner;

public class Actividad7 {
	
	public static int esBisiesto (int a) {
		
		int bisiesto;
		
		bisiesto = a%4;
		
		return bisiesto;
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa diremos si el año es Bisiesto o no");
		System.out.println("");
		System.out.println("Indique un año");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		
		z = esBisiesto(num);
		
		if (z==0) {
			System.out.println("El año " + num + " es Bisiesto");
		}else {
			System.out.println("El año " + num + " no es Bisiesto");
		}
		
		leer.close();
		
	}

}