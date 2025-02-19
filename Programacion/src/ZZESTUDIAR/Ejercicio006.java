package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio006 {
	
	public static int factorial (int a) {
		
		if (a==0) {
			return 1;
		}
		
		return factorial(a-1)*a; // se multiplica 6 * factorial (a-1), que quiere decir eso, que como a-1 es 5, pues int a, tomara valor de 5

// da igual si se pone [a*factorial(a-1)] como si pongo [factorial(a-1)*a]
		
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa calcularemos el factorial de un numero");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = factorial(num);
		
		System.out.println("El factorial de " + num + " es " + z);
		
		leer.close();
		
	}

}