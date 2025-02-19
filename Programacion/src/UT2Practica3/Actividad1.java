package UT2Practica3;

import java.util.Scanner;

public class Actividad1 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		System.out.println("En este programa indicaremos el dia que es dependiendo del numero que ingrese el usuario");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		switch (num) {
		case 1:
			System.out.println("Estamos a Lunes");
			break;
		case 2:
			System.out.println("Estamos a Martes");
			break;
		case 3:
			System.out.println("Estamos a Miercoles");
			break;
		case 4:
			System.out.println("Estamos a Jueves");
			break;
		case 5:
			System.out.println("Estamos a Viernes");
			break;
		case 6:
			System.out.println("Estamos a Sabado");
			break;
		case 7:
			System.out.println("Estamos a Domingo");
			break;
		default:
			System.out.println("Es numero no corresponde a ningun dia de la semana");
		}
		
		leer.close();
		
	}
}