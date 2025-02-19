package UT3Practica1;

import java.util.Scanner;

public class Actividad5 {
	
	public static double calcularRaizSuma(int a, int b) {
		
		double suma, raiz;
		
		suma = a+b;
		
		raiz = (Math.sqrt(suma));
		
		return  raiz;
		
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num1, num2;
		double z;
		
		System.out.println("En este programa calcularemos la raiz cuadrada de la suma de dos numeros");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num1 = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese otro numero");
		System.out.println("");
		
		num2 = leer.nextInt();
		System.out.println("");
		
		
		z = calcularRaizSuma(num1, num2);
		
		System.out.println("La raiz de la suma de " + num1 + " + " + num2 + " es de " + z);
		
		leer.close();
		
		
	}

}