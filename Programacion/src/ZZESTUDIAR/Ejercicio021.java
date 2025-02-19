package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio021 {
	
	// Método recursivo único para calcular el factorial
	public static int factorial(int num) {
		if (num == 0) { // Caso base
			return 1;
		}
		return num * factorial(num - 1); // Llamada recursiva
	}
	
	// Método para calcular el número de combinaciones
	public static int formula(int i, int j, int m) {
		return i / (j * m);
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		System.out.println("En este programa calcularemos el número de combinaciones posibles para formar un equipo.");
		System.out.println();
		
		System.out.println("Ingrese el número total de personas:");
		int num1 = leer.nextInt();
		
		System.out.println();
		System.out.println("¿Cuántas personas desea seleccionar para formar el equipo?");
		int num2 = leer.nextInt();
		
		System.out.println();
		
		// Cálculo de los factoriales usando el método único
		int n = factorial(num1);               // Factorial del número total de personas
		int r = factorial(num2);               // Factorial del número de personas seleccionadas
		int z = factorial(num1 - num2);        // Factorial de la diferencia entre ambos
		
		// Validación y cálculo del número de combinaciones
		if (n >= r) { 
			int c = formula(n, r, z);
			System.out.println("El número de posibles combinaciones es de " + c + " grupos.");
		} else {
			System.out.println("No es posible formar equipos con los valores ingresados.");
		}
		
		leer.close();
	}
}