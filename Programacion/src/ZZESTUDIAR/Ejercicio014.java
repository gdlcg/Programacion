package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio014 {
	
	public static int fibonacci (int a) {
		
		
		if (a<2) {
			return a;
		}else {
			return fibonacci(a-1) + fibonacci(a-2);
		}
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa crearemos la serie de Fibonacci desde 1 hasta el numero que ingrese el usuario");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = fibonacci(num);
		
		System.out.println("Suma es " + z);
		
		leer.close();
		
		
		
	}

}