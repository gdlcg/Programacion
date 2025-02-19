package UT2Practica3;

import java.util.Scanner;

public class Actividad3 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		System.out.println("En este programa asignaremos una clasificacion al usuario dependiendo del numero que ingrese");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		switch(num) {
		case 1:
			System.out.println("Eres Novato");
			break;
		case 2:
			System.out.println("Eres Intermedio");
			break;
		case 3:
			System.out.println("Eres Avanzado");
			break;
		case 4:
			System.out.println("eres Experto");
			break;
			default:
				System.out.println("Este numero no se corresponde con ninguna calificacion");
		}
		
		leer.close();
		
	}
}