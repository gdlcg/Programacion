package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio020 {
	
	public static int suma (int a) {
		
		if (a == 0) {
			return 0;
		}
		
		return a + suma (a-1);
		
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa mostraremos la suma de todos los numeros desde 1 hasta el numero que ingrese el usuario");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		
		z = suma (num);
		
		System.out.println("La suma de todos los numeros es " + z);
		
		leer.close();
		
		
	}

}