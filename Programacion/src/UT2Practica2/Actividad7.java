package UT2Practica2;

import java.util.Scanner;

public class Actividad7 {
	
	public static void main(String[] args) {
		
		
		Scanner leer = new Scanner (System.in);
		
		char letra;
		float num;
		float desc;
		float total;
		
		System.out.println("En este programa realizaremos descuentos dependiendo de la membresia que elija");
		System.out.println("");
		
		
		System.out.println("Indique su tipo de membresia");
		System.out.println("");
		letra = leer.next().charAt(0);  //charAt es porque lee un caracter el 0 es la posicion 1
		
		System.out.println("");
		System.out.println("Indique cual es el total de su compra");
		System.out.println("");
		num = leer.nextFloat();
		System.out.println("");
		
		switch (letra) {
		
		case 'A':
		case 'a':
			desc = (float) (num * 0.3);
			System.out.println("Se le ha descontado " + desc + " euros");
			total=num-desc;
			System.out.println("El total de su compra es " + total);
			break;
			
		case 'B':
		case 'b':
			desc = (float) (num*0.2);
			System.out.println("Se le ha descontado " + desc + " euros");
			total=num-desc;
			System.out.println("El total de su compra es " + total);
			break;
			
		case 'C':
		case 'c':
			desc = (float) (num*0.1);
			System.out.println("Se le ha descontado " + desc + " euros");
			total=num-desc;
			System.out.println("El total de su compra es " + total);
			break;
			
		default:
			System.out.println("Membresia invalida, por favor ingrese A, B, o C");
		}
		
		leer.close();
		
	}
}