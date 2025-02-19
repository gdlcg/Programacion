package UT2Practica4;

import java.util.Scanner;

public class Actividad05 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String[] posicion = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto", "septimo", "octavo", "noveno", "decimo"};
		
		int num;
		int contador = 0;
		int pos = 0;
		int contpos = 0;
		double mediapos;
		int neg = 0;
		int contneg = 0;
		double medianeg;
		int cero = 0;
		
		
		System.out.println("En este programa realizaremos la media de los numeros positivos, la media de los nuemeros negativos y contaremos la cantidad de ceros que hay");
		System.out.println("");
		
		while (contador<10) {
			
			System.out.println("Ingrese el " + posicion[contador] + " numero");
			System.out.println("");
			
			num = leer.nextInt();
			System.out.println("");
			
			if (num>0) {
				pos = pos + num;
				contpos++;
			}else if(num<0) {
				neg = neg + num;
				contneg++;
			}else {
				cero++;
			}
			
			
			contador++;
			
		}
		
		
		mediapos = (double) pos / contpos;
		
		medianeg  = (double) neg / contneg;
		
		
		System.out.println("La media de los numero positivos es " + mediapos);
		System.out.println("");
		System.out.println("La media de los numero negativos es " + medianeg);
		System.out.println("");
		System.out.println("La cantidad de ceros ingresados es de " + cero);
		
		
		leer.close();
		
		
	}

}