package UT3Practica2;

import java.util.Scanner;

public class Actividad2 {
	
	public static int invertir (int a, int cambio) {
		
		int digito;
		
		if (a == 0) {
			return cambio;
		}
		 
//ejemplo con 6543
		
		digito = a%10;      //al dividir 6543/10, el resto de la division es "3"
		
		cambio = cambio*10+digito;     //cambio = 0, entonces.... 0*10+3 = 3, cambio = 3
		
		return invertir(a/10, cambio);   //devolvemos el valor pa que se siga efectuando, a/10, se va a almacenar en "int a" y cambio en "int cambio"
		
//por tanto (a/10 = 654,3, pero como es de tipo entero se alamcena 654, y en cambio pues el valor "3")		
		
	}
	
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z;
		
		System.out.println("En este programa invertiremos un numero");
		System.out.println("");
		System.out.println("Introduce un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		
		z = invertir (num, 0);
		
		System.out.println("El numero invertido es " + z);
		
		leer.close();
				
	}

}