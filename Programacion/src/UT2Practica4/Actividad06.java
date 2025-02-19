package UT2Practica4;

import java.util.Scanner;

public class Actividad06 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		
		int a;
		int b;
		int c = 0;
		int d = 0;
		int num;
		int suma = 0;
		
		
		System.out.println("Intervalo");
		System.out.println("");
		System.out.println("Ingrese con numero, el limite inferior de un intervalo");
		System.out.println("");
		
		a = leer.nextInt();
		System.out.println("");
		System.out.println("Ingrese con numero, el limite superior del intervalo");
		System.out.println("");
		
		b = leer.nextInt();
		System.out.println("");
		
		if (a>b) {
			do {
				System.out.println("Ingrese de nuevo el limite inferior del intervalo, puesto que el numero anterior era mayor al limite superior del intervalo");
				System.out.println("");
					
				a = leer.nextInt();
				System.out.println("");
			}while (a>b);
			
		}
		
		System.out.println("Los numeros que vaya a ingresar ahora, deberan de estar entre los nieveles del intervalo");
		System.out.println("");
		
		do {
			System.out.println("Ingrese numero");
			System.out.println("");
			
			num = leer.nextInt();
			System.out.println("");
			
			
			suma = suma + num;   //va sumando todos los numeros que el usuario ingrese
			
			if (num<a && num!=0 || num>b) {      //si num es mayor a "a" y numero es distinto de 0 o si num es menor a b
				
				System.out.println("Este numero no vale, puesto que el numero no se encuentra el el intervalo");
				System.out.println("");
				suma = suma - num;    
//si el usuario ingresa un numero que no esta dentro del intervalo establecido por el, se tiene que restar a la suma, para que no afecte 
			}
			
			if (num==a) {
				c=num;
			}else if (num==b){
				d=num;
			}
				
				
		}while (num!=0);
		
		System.out.println("La suma de todos los numeros ingresados y que estaban dentro del intevalo es de " + suma );
		System.out.println("");
		System.out.println("Usted ha ingresado el numero " + c + " el cual coincide con el limite inferior del intervalo");
		System.out.println("");
		System.out.println("Usted ha ingresado el numero " + d + " el cual coincide con el limite superior del intervalo");
		
		leer.close();
		
	}

}