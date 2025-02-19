package UT2Practica4;

import java.util.Scanner;

public class Actividad18 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		int i = 0;
		int j = 0;
		int contador = 0;
		int suma = 0;
		int total;
		
		System.out.println("En este programa calcualremos el centro numerico y posteriormente, mostraremos la suma de todos los nueros a la derecha de ese numero");
		System.out.println("");
		System.out.println("Introduce el numero hasta donde quiere que se realice el programa");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		for (; i<=num; i++) {
			contador = contador + i;
		}
		
		
		total =(int)Math.sqrt(contador);
		
		
		for(; j<total; j++) {
			suma = suma + j;
		}
		
		
		System.out.println("El centro numerico es " + total);
		System.out.println("");
		System.out.println("La suma de los numeros a la izquierda y derecha de " + total + " es " + suma);
		
		leer.close();
		
	}

}