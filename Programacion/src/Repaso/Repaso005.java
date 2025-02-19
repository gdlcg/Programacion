package Repaso;

import java.util.Scanner;

public class Repaso005 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		String letra;
		
		
		System.out.println("En este programa diremos las cifras que tiene un numero");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		letra = Integer.toString(num); //aqui el numero se transforma a String, osea, a letra.  Funciona solo con int
		
		int como = letra.length();
		
		System.out.println("El numero tiene " + como + " cifras");
		
		
		leer.close();
		
		
	}

}