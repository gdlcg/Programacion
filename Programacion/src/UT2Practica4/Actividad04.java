package UT2Practica4;

import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		String[] opuesta = {"seis", "cinco", "cuatro", "tres", "dos", "uno"};
//la letra seis ocupa el puesto cero, el cinco ocupa el puesto uno, y asi sucesivamente
		
		int num;
		
		System.out.println("En este programa se le pedira al usuario que ingrese el numero de una cara de un dado, y se le mostrara la cara opuesta de dicho");
		System.out.println("");
		System.out.println("Ingrese un numero");
		System.out.println("");
		
		num = leer.nextInt();
		System.out.println("");
		
		
		
		if (num==1) {
			System.out.println(opuesta[num-1]);  //seis
//lo que esta entre [] es para indicar la posicion por ejemplo, si ponemos un 4 mostrara la palbra dos, porque dos ocupa la posicion 4
		}else if (num==2) {
			System.out.println(opuesta[num-1]);  //cinco
		}else if (num==3) {
			System.out.println(opuesta[num-1]);  //cuatro
		}else if (num==4) {
			System.out.println(opuesta[num-1]);  //tres
		}else if (num==5) {
			System.out.println(opuesta[num-1]);  //dos
		}else if (num==6) {
			System.out.println(opuesta[num-1]);  //uno
		}else {
			System.out.println("ERROR: numero incorrecto");
		}
		
		leer.close();
	}

}