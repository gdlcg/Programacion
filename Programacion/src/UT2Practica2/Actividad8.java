package UT2Practica2;

import java.util.Scanner;

public class Actividad8 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		float nota;
		
		System.out.println("En este programa clasificaremos la notal ingresada por el usuario");
		System.out.println("");
		System.out.println("Ingrese la nota");
		System.out.println("");
		
		nota = leer.nextFloat();
		System.out.println("");
		
		if (nota>=0 && nota<=100) {
			if (nota >=90) {
				System.out.println("Excelente");
			}else if (nota>=70 && nota<=89) {
				System.out.println("Bueno");
			}else if (nota>=50 && nota<=69) {
				System.out.println("Regular");
			}else {
				System.out.println("Repobrado");
			}
		}else if (nota<0) {
			System.out.println("Este proceso no se puede efectuar puesto que la nota es inferior a cero");
		}else {
			System.out.println("Este proceso no se puede efectuar puesto que la nota es superior a cien");
		}
		
		
		leer.close();
		
	}
}