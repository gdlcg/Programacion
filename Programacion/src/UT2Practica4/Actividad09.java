package UT2Practica4;

import java.util.Scanner;

public class Actividad09 {

	public static void main(String[] args) {
		
		
		String[]opciones = {"1- Sumar los dos numero", "2- Restar los dos numeros", "3- Multiplicar los dos numeros", "4- Dividir los dos numero", "5- Salir del menu"};
		
		Scanner leer = new Scanner (System.in);
		
		double a;
		double b;
		int num;
		double t = 0;
		int posicion = 0;
		
		
		
		System.out.println("Ingrese dos numeros");
		System.out.println("");
		
		a = leer.nextDouble();
		System.out.println("");
		b = leer.nextDouble();
		System.out.println("");
		
		
		do {
			
			System.out.println("Elija una opcion del menu");
			System.out.println("");
			System.out.println("");
			
			
			while(posicion<5) {
				System.out.println(opciones[posicion]);
				System.out.println("");
				
				posicion++;
			}
			
			num = leer.nextInt();
			System.out.println("");
			
			
			
			/*System.out.println("1- Sumar los numeros");
			System.out.println("");
			System.out.println("2- Restar los numeros");
			System.out.println("");
			System.out.println("3- Multiplizar los numero");
			System.out.println("");
			System.out.println("4- Dividir los numero");
			System.out.println("");
			System.out.println("5- Salir del programa");
			System.out.println("");
			
			num = leer.nextInt();
			System.out.println("");*/
			
			
			switch (num) {
			case 1:
				t = a+b;
				System.out.println("La suma de " + a + " + " + b + " es " + t);
				break;
			case 2:
				t = a-b;
				System.out.println("La resta de " + a + " - " + b + " es " + t);
				break;
			case 3:
				t = a*b;
				System.out.println("La multiplicacion de " + a + " x " + b + " es " + t);
				break;
			case 4:
				
				if (b==0) {
					while (b==0) {
						System.out.println("Ingrese otro numero para b distinto de cero, puesto que ningun numero puede ser dividido entre cero");
						System.out.println("");
						
						b = leer.nextDouble();
						System.out.println("");
						
					}
					t = a/b;
					System.out.println("La division de " + a + " / " + b + " es " + t);
				}else {
					t = a/b;
					System.out.println("La division de " + a + " / " + b + " es " + t);

				}
				break;
			case 5:
				System.out.println("Ha salido del programa");
				break;
			}
			
			System.out.println("");
			
		}while (num!=5);
		
		leer.close();
	}

}