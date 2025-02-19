package Repaso;

import java.util.Scanner;

public class Repaso004 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("En este programa diremos si dos numeros son multiplos o no");
		System.out.println("");
		System.out.println("Ingrese dos numero");
		System.out.println("");
		
		num1 = leer.nextInt();
		System.out.println("");
		num2 = leer.nextInt();
		System.out.println("");
		
		if (num1%num2==0 || num2%num1==0) {
			System.out.println("Los numero son multiplos");
		}else {
			System.out.println("Los numeros no son multiplos");
		}
		
		leer.close();
		
	}

}