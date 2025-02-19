package UT2Practica4;

import java.util.Scanner;

public class Actividad17 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int baliza;
		int cantidad;
		int num;
		int contador = 0;
		int mayor = 0;
		int menor = 0;
		int suma  = 0;
		
		System.out.println("En este programa compararemos la cantidad de numeros que ingrese el usuario, previamente señalizado, con el numero baliza");
		System.out.println("");
		System.out.println("Ingrese el numero baliza");
		System.out.println("");
		
		baliza = leer.nextInt();
		System.out.println("");
		System.out.println("Introduzca la cantidad de numero a comparar con la baliza");
		System.out.println("");
		
		cantidad = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese los numero a comparar");
		System.out.println("");
		
		while(contador<cantidad) {
			
			num = leer.nextInt();
			System.out.println("");
			
			if (num>baliza) {
				suma = suma + num;
				mayor++;
			}else {
				menor++;
			}
			
			contador++;
		}
		
		System.out.println("Hay " + mayor + " numeros mayores que la baliza");
		System.out.println("");
		System.out.println("Hay " + menor + " numero menores que la baliza");
		System.out.println("");
		System.out.println("La suma de los numero mayores a la baliza es " + suma);
		
		leer.close();
		
	}

}