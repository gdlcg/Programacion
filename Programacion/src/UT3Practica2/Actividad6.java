package UT3Practica2;

import java.util.Scanner;

public class Actividad6 {
	
	public static int Suma (int a, int b) {
		
		if (b>a) {
			return 0;
		}
		
		return b + Suma(a, b+1); 
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa se mostrata la suma de todos los numero de un parametro establecido por el usuario");
		System.out.println("");
		System.out.println("Introduzca hasta donde quiere que se muestre la suma de todos los numeros del parametro");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = Suma (num, 1);
		
		System.out.println("La suma de los números de 1 a " + num + " es: " + z);
		
		leer.close();
		
	}

}