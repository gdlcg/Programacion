package UT2Practica4;

import java.util.Scanner;

public class Actividad11 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int a;
		int b;
		int contadorA = 0;
		int contadorB = 0;
		int i = 1;
		int j = 1;
		
		System.out.println("En este programa veremos si los dos numeros ingresados por el usuario son amigos o no");
		System.out.println("");
		System.out.println("");
		System.out.println("NOTA: Los números amigos son dos números que, si sumamos los divisores de cada uno (sin contar el propio número), el resultado de uno es igual al otro");
		System.out.println("");
		System.out.println("");
		System.out.println("Ingrese dos numeros");
		System.out.println("");
		
		a = leer.nextInt();
		System.out.println("");
		b = leer.nextInt();
		System.out.println("");
		
		for (; i<a; i++) {
			if (a%i==0) {
				System.out.print(i + " + ");
				contadorA = contadorA + i;
			}
		}
		
		System.out.println("= " + contadorA);
		System.out.println("");
		
		for (; j<b; j++) {
			if (b%j==0) {
				System.out.print(j + " + ");
				contadorB = contadorB +j;
			}
		}
		
		System.out.println("= " + contadorB);
		System.out.println("");
		
		if (contadorA==b && contadorB==a) {
			System.out.println("Los numeros " + a + " y " + b + " son amigos" );
		}else {
			System.out.println("Los numeros " + a + " y " + b + " no son amigos" );
		}
		
		leer.close();
		
	}

}