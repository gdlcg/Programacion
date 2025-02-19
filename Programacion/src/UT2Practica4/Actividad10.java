package UT2Practica4;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int aleatorio = (int)(Math.random()*100+1); 
// se pone +1, porque el 100 no esta incluido en Math.randdom()*100  [0,100), o se podria poner  "*101"
		int num;
		int contador = 0;
		
		System.out.println("En este programa le pediremos al usuario que ingrese un numero entre el 0 y el 100 hasta que adivine el numero aleatorio");
		System.out.println("");
		
		do {
			System.out.println("Ingrese un numero");
			System.out.println("");
			
			num = leer.nextInt();
			System.out.println("");
			
			if (num<aleatorio) {
				System.out.println("Es mayor");
			}else if (num>aleatorio){
				System.out.println("Es menor");
			}else {
				System.out.println("Enhorabuena, has adivinado el numero");
			}
			System.out.println("");
			contador++;
			
			if (num<0 || num>100) {
				contador--;
				System.out.println("Este numero no esta dentro del rango, se te descontara un intento");
				System.out.println("");
			}
			
		}while (num!=aleatorio);
		
		System.out.println("Has intentado adivinar el numero " + contador + " veces");
		
		leer.close();
		
	}

}