package Clase;

import java.util.Scanner;

public class Recursivo {
	
	public static void hastaN (int a) {
		
		if (a == 1) {
			
			System.out.println(1);
		}else {
			
			hastaN(a-1);
			
			System.out.println(a);
		}
		

	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int num;
		
		System.out.println("En este programa mostraremos los numeros desde 1 hasta N");
		System.out.println("");
		System.out.println("Ingrese numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		hastaN (num);
		
		leer.close();
		
	}

}