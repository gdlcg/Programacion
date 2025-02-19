package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio013 {
	
	public static int cantidad (int a) {
		
		int digito=1;
		
		if (a==0) {
			return 0;
		}
		
		return cantidad (a/10) + digito;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa mostraremos la cantidad de digitos de un numero");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = cantidad(num);
		
		System.out.println("La cantidad de digitos que tiene el numero " + num + " es de " + z + " digitos");
		
		leer.close();
		
	}

}