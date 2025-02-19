package UT3Practica3;

import java.util.Scanner;

public class ActividadClase {
	
	public static int ronda1(int a) {
		
		int digito, suma = 0;
		
		while(a>0) {
			
			digito = a%10;
			
			suma += digito;
			
			a /= 10;
			}
		return suma;
		
	}
	
	public static int ronda2 (int a, int b) {
		
		if (b==0) return a;
		
		return ronda2 (b, a%b);
		
	}
	
	public static int ronda3 (int a) {
		
		int num=0;
		
		for (int i = 0; i<a; i++) {
			
			if (a%i==0) {
				num+=1;
			}
			
		}
		
		
		return num;
	}
	

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num, z; // ronda1
		int a, b, y; // ronda2
		int entero, t;
		
		System.out.println("Bienvenidos al Torneo Virtual Stand");
		System.out.println("");
		System.out.println("- - - Ronda 1 - - -");
		System.out.println("");
		
		do {
			System.out.println("Ingrese un numero entero positivo");
			System.out.println("");
			
			num = leer.nextInt();
			System.out.println("");
			
			z = ronda1 (num);
			
			if (z%2==0) {
				System.out.println("La suma de los digitos es " + z + ". Es un número par. ¡Has superado la ronda!");
				System.out.println("");
			}else {
				System.out.println("Para obtener la energia suficiente deberas de intentar con otro numero");
				System.out.println("");
			}
		}while (z%2==1);
		
		
		System.out.println("- - - Ronda 2 - - -");
		System.out.println("");
		
		do {
			System.out.println("Ingrese un numero entero positivo");
			System.out.println("");
			
			a = leer.nextInt();
			System.out.println("");
			System.out.println("Ingrese otro numero entero positivo");
			System.out.println("");
			
			b = leer.nextInt();
			System.out.println("");
			
			y = ronda2 (a, b);
			
			if (y>1) {
				System.out.println("El MCD de " + a + " y " + b + " es " + y + ". El puente se abre");
				System.out.println("");
			}else {
				System.out.println("Para que el puente se abra, deberas de intentarlo con otros numeros");
				System.out.println("");
			}
		}while (y<1);
		
		
		System.out.println("- - - Ronda 3 - - -");
		System.out.println("");
		
		do {
			System.out.println("Ingrese un numero entero positivo");
			System.out.println("");
			
			entero = leer.nextInt();
			System.out.println("");
			
			t = ronda3 (entero);
			
			if (t==3) {
				System.out.println("¡Correcto! " + entero + " es un número mágico");
			}else {
				System.out.println("El numero no es Mágico, deberas de probar con otro número");
				System.out.println("");
			}
		}while(t!=3);
		
		System.out.println("¡FELICIDADES! Has anado el Torneo de la Arena Virtual");
		System.out.println("");
		System.out.println("FINAL DEL JUEGO");
		
		
		leer.close();
		
	}

}