package UT3Practica2;

import java.util.Scanner;

public class Actividad4 {
	
	public static int Binario (int a) {
		
		if (a == 0) {
			return 0;
		}
		
		int digito ;
		
		digito = a%2;
		
		
		return Binario (a/2)*10 + digito;
		
		
	}

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa convertiremos el numero decimal a binario");
		System.out.println("");
		System.out.println("Introduzca un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		z = Binario (num);
		
		System.out.println("El numero " + num + " en Binario es " + z);
		
		leer.close();
		
		
		
	}

}