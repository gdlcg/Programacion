package UT2Practica4;

import java.util.Scanner;

public class Actividad02 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int num;
		int cifra1;
		int contador = 1000;
		int posicion = 0;
		
		String[] posiciones = {"primera", "segunda", "tercera", "cuarta"};
//El string es una cadena, se escribe las palabras que queremos que se muestren
		
		int a;
		
		System.out.println("En este programa mostraremos por separado cada cifra que componga un numero ingresado por el usuario");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		while (contador>0) {
			
				
				
				cifra1 = num/contador;
				
				System.out.println("La " + posiciones[posicion] + " cifra es " + cifra1);
				
//creamos un contado llamado posicion, para que cada vez que se incremente se cambie el nombre de la cadena
				
				
				a = cifra1 * contador;
				
				num = num-a;
				
				contador = contador/10;
				
				posicion++;
				
			}
			
		leer.close();
	}

}