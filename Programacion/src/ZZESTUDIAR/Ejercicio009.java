package ZZESTUDIAR;

import java.util.Scanner;

public class Ejercicio009 {
	
	public static int Binario (int a) {
		
		int digito;
		
		if (a==0) {
			return 0;
		}
		
		digito = a%2;
		
		
		return Binario (a/2)*10+digito;
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa transformaremos un numero decimal en binario");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = Binario(num);
		
		System.out.println("EL numero " + num + " en binario es " + z);
		
		leer.close();
		
	}

}