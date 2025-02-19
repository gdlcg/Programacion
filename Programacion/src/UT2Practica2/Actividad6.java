package UT2Practica2;

import java.util.Scanner;

public class Actividad6 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		System.out.println("En este programa determinaremos si un numero es positivo o negativo y si es par o impar");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		num = leer.nextInt();
		System.out.println("");
		
		if (num>0) {
			System.out.println("El numero " + num + " es positivo");
			System.out.println("");
			if (num%2 == 0) {
				System.out.println("El numero es par");				
			}else {
				System.out.println("El numero es impar");
			}
		}
		
		if (num<0) {
			System.out.println("El numero " + num + " es negativo");
			System.out.println("");
			if (num%2 == 0) {
				System.out.println("El numero es par");
			}else {
				System.out.println("El numero es impar");
			}
		}
		
		if (num==0) {
			System.out.println("El numero es cero y por tanto es par");
		}
		
		leer.close();
		
	}
}