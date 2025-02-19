package UT2Practica4;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		int x = 0;
		int y = 0;
		
		System.out.println("En este programa calcularemos los dos numeros mas altos de entre todos los numeros enteros que haya ingresado el usuario");
		System.out.println("");
		System.out.println("El programa finalizara, cuando el usuario ingrese el numero 0");
		System.out.println("");
		
		do {
			System.out.println("Ingrese numero");
			System.out.println("");
			
			num = leer.nextInt();
			System.out.println("");
			 
			
			if (num>x) {
				
				y = x;
				
				x = num;
				
				
			}
			
		}while (num!=0);
		
		System.out.println("El numero mas alto es " + x);
		System.out.println("");
		System.out.println("El segundo numero mas alto es " + y);
		
		leer.close();
		
	}

}