package UT3Practica1;

import java.util.Scanner;

public class Actividad4 {
	
	public static String generarEstrella (int a) {
		
		String j = "";
		
		for (int i = 1; i<=a; i++ ) { 
			
			j+="* ";  //se le van sumando los caracteres
			
		}
		
		return j;
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		String z;
		
		System.out.println("En este programa mostraremos en cantidad de estrellas el numero que indique el usuario");
		System.out.println("");
		System.out.println("Indique un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		
		z = generarEstrella(num);
		
		System.out.print(z);
		
		leer.close();
		
	}

}