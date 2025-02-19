package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio008 {
	
	public static int Binario (int a) {
		
		if (a==0) {
			return 0;
		}
		
		int digito;
		
		digito = a%10;
		
		if (digito>1) {
			return 1;
		}
		
		return Binario (a/10);
		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa comprobaremos si un numero es binario o no");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z=Binario(num);
		
		if (z==0) {
			System.out.println("El numero es binario");
		}else {
			System.out.println("El numero no es binario");
		}
		
		leer.close();
		
	}

}