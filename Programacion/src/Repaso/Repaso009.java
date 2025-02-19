package Repaso;

import java.util.Scanner;

public class Repaso009 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		double num;
		double velo;
		
		System.out.println("En este programa convertiremos una velocidad expresada en km/h a m/s");
		System.out.println("");
		System.out.println("Ingrese una velocidad expresada en km/h");
		System.out.println("");
		
		num = leer.nextDouble();
		System.out.println("");
		
		velo = (num*1000)/3600;
		
		System.out.println(num + "km/h son " + velo + "m/s");
		
		leer.close();
		
	}

}