package UT2Practica4;

import java.util.Scanner;

public class Actividad07 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		int contador = 0;
		
		System.out.println("En este programa mostraremos todos los numeros multiplos de tres hasta el numero que el usuario indique");
		System.out.println("");
		System.out.println("Indique el numero hasta donde se va a mostrar los numeros multiplos de tres");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		if (num<0) {
			do {
				System.out.println("Ingrese un numero mayor que cero");
				System.out.println("");
				
				num = leer.nextInt();
				System.out.println("");
			}while (num<=0);
		}
		
		
		
		for (int i = 0; i<=num; i++) {
			
			int a;
			a = i%3;
			
			
			if (a==0) {
				System.out.println(i);
				contador++;
			}
			
		}
		System.out.println("");
		System.out.println("Se han mostrado " + contador + " numeros");
		
		leer.close();
		
	}

}