package UT2Practica2;

import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		
		System.out.println("En este programa clasificaremos a la persona que ingrese su edad");
		System.out.println("");
		System.out.println("Ingrese su edad");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		if (num<12) {
			System.out.println("Como usted tiene " + num + " años, es un niño");
		}else if (num>=13 && num<=17){
			System.out.println("Como usted tiene " + num + " años, es un adolescente");
		}else if (num>=18 && num<=64) {
			System.out.println("Como usted tiene " + num + " años, es un adulto");
		}else {
			System.out.println("como ustede tiene " + num + " años, es un adulto mayor");
		}
		
		
		leer.close();
		
	}
}