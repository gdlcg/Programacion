package Repaso;

import java.util.Scanner;

public class Repaso010 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		String texto;
		//int contador;
		
		System.out.println("En este programa cambiaremos el orden del numero ingresado por el usuario");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		texto = Integer.toString(num);
		
/*		contador = texto.length();
		
		System.out.println(contador + " ncsejhfijkerngergnejrgeurghe");*/
		
		for (int i = texto.length()-1; i>=0; i--) { //i = la cantidad de cifras que tenga el numero
			
// al length se le resta -1 porque el char empiza por el valor 0
			
			System.out.print(texto.charAt(i));
			
		}
		
		
		leer.close();
	}

}