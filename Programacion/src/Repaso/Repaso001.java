package Repaso;

import java.util.Scanner;

public class Repaso001 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		double a, b, c, d;
		double total1, total2;
		
		System.out.println("En este programa calcularemos la ecuacion de segundo grado de los datos que introduzca el usuario");
		System.out.println("");
		System.out.println("Ingrese los datos");
		System.out.println("");
		
		a = leer.nextDouble();
		b = leer.nextDouble();
		c = leer.nextDouble();
		System.out.println("");
		

		d = ((b*b)-4*a*c);
		
		if (d<0) {
			
			System.out.println("La operacion no se puede calcular puesto que el resultado no es real");
			
		}else {
			
			total1 = (-b+Math.sqrt(d))/2*a;
			
			total2 = (-b-Math.sqrt(d))/2*a;
			
			System.out.println("La primera solucion es " + total1);
			System.out.println("");
			System.out.println("La segunda solucion es " + total2);
			
		}
		
		
		leer.close();
		
		
	}

}