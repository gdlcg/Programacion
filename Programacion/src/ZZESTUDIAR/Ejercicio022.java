package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio022 {
	
	public static StringBuilder pasos = new StringBuilder(); // Para acumular los pasos

	public static int exponente(int a, int b) {
		if (b == 0) { // Caso base
			return 1;
		}
		
		if (b == 1) { // Último paso, no agregar el símbolo "*"
			pasos.append(a);
		} else { // Agregar el número seguido del símbolo "*"
			pasos.append(a).append(" * ");
		}

		return a * exponente(a, b - 1); // Llamada recursiva
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);

		System.out.println("En este programa mostraremos el resultado de elevar un número a otro (RECURSIVIDAD)");
		System.out.println();
		System.out.println("Introduzca el número que quieres elevar, es decir el número base:");
		int num1 = leer.nextInt();

		System.out.println();
		System.out.println("Introduce el número del exponente:");
		int num2 = leer.nextInt();

		System.out.println();
		int resultado = exponente(num1, num2);

		System.out.println("Cálculo: " + pasos.toString());
		System.out.println("El resultado es " + resultado);

		leer.close();
	}
}