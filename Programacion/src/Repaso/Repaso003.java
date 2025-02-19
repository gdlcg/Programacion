package Repaso;

import java.util.Scanner;

public class Repaso003 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		double radio;
		double perimetro;
		
		System.out.println("En este programa calcularemos el perimetro de una circunferencia, dependiendo del radio que introduzca el usuario");
		System.out.println("");
		System.out.println("Introduzca la medida del radio");
		System.out.println("");
		
		radio = leer.nextFloat();
		System.out.println("");
		
		perimetro = (2 * Math.PI * radio);
		
		System.out.println("El perimetro de la circunferencia es " + perimetro);
		
		leer.close();
		
	}

}