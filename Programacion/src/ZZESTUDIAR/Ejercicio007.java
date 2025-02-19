package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio007 {
	
	
	public static int exponente (int a, int b) {
		
		if (b==0) {
			return 1;
		}
		
		
		return a*exponente(a, b-1);
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num1, num2, z;
		
		System.out.println("En este programa mostraremos el resultado de elevar un numero a otro (RECURSIVIDAD)");
		System.out.println("");
		System.out.println("Introduzca el numero que quieres elevar, es decir el numero base");
		System.out.println("");
		
		num1 = leer.nextInt();
		System.out.println("");
		System.out.println("Introduce el numero del exponente");
		System.out.println("");
		
		num2 = leer.nextInt();
		System.out.println("");
		
		z = exponente(num1, num2);
		
		System.out.println("El resultado es " + z);
		
		leer.close();
		
	}

}