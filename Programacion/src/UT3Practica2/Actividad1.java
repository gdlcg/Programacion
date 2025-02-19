package UT3Practica2;

import java.util.Scanner;

public class Actividad1 {
	
	public static int elevado (int a, int b) {
		
		if (b==0) {
			return 1;
		}else {
			return  a * elevado(a, b - 1);
		}
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num1, num2, z;
		
		System.out.println("En este programa mostraremos el resultado de elevar un numero a otro");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num1 = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese otro numero");
		System.out.println("");
		
		num2 = leer.nextInt();
		System.out.println("");
		
		z = elevado(num1, num2);
		
		System.out.println("El resultado de elevar " + num1 + " a " + num2 + " es " + z);
		
		leer.close();
		
		
	}

}