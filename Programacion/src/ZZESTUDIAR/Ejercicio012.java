package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio012 {
	
	public static void mostrar (int a) {
		
		if (a>0) {
			mostrar(a-1);
			System.out.println(a);
		}else {
			System.out.println();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		System.out.println("En este programa mostraremos todos los numeros desde 1 hasta el numero que el usuario introduzca");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		mostrar(num);
		
		leer.close();
		
	}

}