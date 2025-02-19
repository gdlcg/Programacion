package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio005 {
	
	public static void serie (int a) {
		
		for (int i = 1; i<=a;i++) {
			System.out.println(i);
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		System.out.println("En este programa mostraremos una cantidad de numero hasta el numero que el usuario diga");
		System.out.println("");
		System.out.println("Ingrese el numero hasta donde quiere que se genere la serie");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		serie(num);
		
		leer.close();
		
		
	}

}