package Repaso;

import java.util.Scanner;

public class Repaso008 {
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		int min, max;
		int contador = 0;
		
		System.out.println("Ingrese numero min ");
		min = leer.nextInt();
		
		System.out.println("Ingrese numero max ");
		max = leer.nextInt();
		
		while (contador<10) {
			int aleatorio = (int) (Math.random() * (max - min )) + min;
			System.out.println(aleatorio);
			
			contador++;
		}
		
		leer.close();
		
	}
}
// como Math.random genera numeros decimales y apartir del cero

// pongamos un ejemplo a ver como funciona

// si ponemo como min=2 y como max=6, restara 6-2 y generara numeros desde 0 incluido hasta 4 sin incluir [0, 4) o lo que es lo mismo, desde [0, 3]

// que es como poner desde un principio Math.random()*4

// que pasa que como queremos que genere numeros entre 2 y 6, al final del todo pondremos +min

// para que se sume esa cantidad a cero, que es desde donde empieza a generar numeros aleatorios el random

// por tanto si ponemos (max - min) + min generara numeros desde [2, 6) o lo que es lo mismo, desde [2, 5]

// pero si ponemos (max - min + 1) + min si generara numeros desde [2, 6] 