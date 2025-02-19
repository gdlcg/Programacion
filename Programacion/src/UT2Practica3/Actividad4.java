package UT2Practica3;

import java.util.Scanner;

public class Actividad4 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		
		int num;
		
		System.out.println("En este programa veremos si usted es mayor de edad o no para votar");
		System.out.println("");
		System.out.println("Ingrese su edad");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		if (num>=18) {
			System.out.println("Eres mayor de edad, puedes votar");
		}else {
			System.out.println("Eres menor de edad, no puedes votar aun");
		}
		
		leer.close();
		
	}
}