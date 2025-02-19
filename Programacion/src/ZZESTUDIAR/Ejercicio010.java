package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio010 {
	
	public static int suma (int a) {
		
		if (a==0) {
			return 0;
		}
		
		return a + suma(a-1);
		
	}
	
	

	public static void main(String[] args) {
		
		int num, z;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("En este programa calcularemos la suma de todos los numeros hasta el numero que diga el usuario");
		System.out.println("");
		System.out.println("Ingrese el numero hasta donde quiere que se haga la suma");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = suma(num);
		
		System.out.println("La suma de todos los numeros desde 1 hasta " + num + " es " + z);
		
		leer.close();
		
		
		
	}

}