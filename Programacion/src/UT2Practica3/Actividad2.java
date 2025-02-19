package UT2Practica3;

import java.util.Scanner;

public class Actividad2 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		System.out.println("En este programa indicaremos en la estacion del año que es dependiendo del numero que ingrese el usuario");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		switch(num) {
		case 1:
			System.out.println("Estamos en verano");
			break;
		case 2:
			System.out.println("Estamos en otoño");
			break;
		case 3:
			System.out.println("Estamoe en invierno");
			break;
		case 4:
			System.out.println("Estamos en primavera");
			break;
			default:
				System.out.println("Este numero no correspondo a ninguna estacion del año");
		}
		
		leer.close();
		
	}
}