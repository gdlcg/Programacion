package UT3Practica2;

import java.util.Scanner;

public class Actividad3 {
	
	public static int esBinario (int a) {
		
		if ( a == 0) {
			return 0;
		}
		
		int digito;
		
		digito = a%10;
		
		if (digito>1) {
			return 1;
		}
		
		return esBinario (a/10);
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa diremos si un numero es Binario o no");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = esBinario (num);
		
		
		if (z == 0) {
			System.out.println("Es binario " + num);
		}else {
			System.out.println("No es binario " + num);
		}
		
		leer.close();
		
		
		
	}

}