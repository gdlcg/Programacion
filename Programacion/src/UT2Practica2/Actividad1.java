package UT2Practica2;

import java.util.Scanner;

public class Actividad1 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		 System.out.println("En este programa comprobaremos si el numero ingresado por el usuario es par o impar");
		 System.out.println("");
		 System.out.println("Ingrese el numero");
		 System.out.println("");
		 
		 num = leer.nextInt();
		 System.out.println("");
		 
		 if (num%2==0) {
			 System.out.println("El numero " + num + " es par");
		 }else {
			 System.out.println("El numero " + num + " es impar");
		 }
		 
		 leer.close();
		
	}
}