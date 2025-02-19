package UT2Practica2;

import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		float num;   //float ocupa menos que double
		
		System.out.println("En este programa calificaremos tu calificacion en formato de letra");
		System.out.println("");
		System.out.println("Ingrese su calificacion");
		System.out.println("");
		
		num = leer.nextFloat();
		System.out.println("");
		
		if (num>=0 && num<=100) {
			if (num>=90 && num<=100) {
				System.out.println("Como su calificacion es de " + num + " = A");
			}else if (num>=80 && num<=89) {
				System.out.println("Como su calificacion es de " + num + " = B");
			}else if (num>=70 && num<=79) {
				System.out.println("Como su calificacion es de " + num + " = C");
			}else if (num>=60 && num<=69) {
				System.out.println("Como su calificacion es de " + num + " = D");
			}else if (num>=0 && num<60) {
				System.out.println("Como su calificacion es de " + num + " = F");
			}
		}else if (num<0){
			System.out.println("No se puede realizar el programa puesto que ha ingresado un numero inferio a cero");
		}else if (num>100) {
			System.out.println("No se puede realizar el programa puesto que ha ingresado un numero mayor a 100");
		}
		
		leer.close();
	}
}