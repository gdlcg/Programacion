package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio019 {
	
	public static int reves (int a, int b) {
		
		int digito;
		
		if (a==0) {
			return b;
		}
		
		digito = a%10;
		
		return reves (a/10, b * 10 + digito);
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa mostraremos un numero al reves");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = reves(num, 0);
		
		System.out.println("El numero " + num + " al reves es " + z);
		
		leer.close();
		
		
	}

}