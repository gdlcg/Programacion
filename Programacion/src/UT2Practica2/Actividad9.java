package UT2Practica2;

import java.util.Scanner;

public class Actividad9 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in); 
		
		float num;
		float imp;
		
		System.out.println("En este programa se calculara el impuesto a pagar segun el ingreso anual de una persona");
		System.out.println("");
		System.out.println("Indique su ingreso anual");
		System.out.println("");
		num=leer.nextFloat();
		System.out.println("");
		
		if (num<10000) {
			System.out.println("Como tu ingreso es menor de 10000 euros, no pagaras impuesto");
		}else if(num>=10000 && num<=19999) {
			imp = (float)(num*0.1);
			System.out.println("Tendras que pagar un 10%, que seria " + imp + " euros");
		}else if(num>=20000 && num<=29999) {
			imp = (float)(num*0.15);
			System.out.println("Tendras que pagar un 15%, que seria " + imp + " euros");
		}else {
			imp = (float)(num*0.15);
			System.out.println("Tendras que pagar un 20%, que seria " + imp + " euros");
		}
		
		leer.close();
		
	}
}