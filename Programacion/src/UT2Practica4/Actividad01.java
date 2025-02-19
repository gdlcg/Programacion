package UT2Practica4;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		
		
		String [] asignatura = {"Programacion", "Lenguaje de Marca", "Base de Datos", "Entorno de Desarrollo", "Sistema Informatico", "FOL"};	
		
		Scanner leer = new Scanner(System.in);
		
		
		int num;
		int suma=0;
		double total;
		int contador = 0;
		
		System.out.println("En este programa calcularemos su nota media del curso");
		System.out.println("");
		
		
		while (contador<6) {
			
			System.out.println("Ingrese la nota de " +asignatura[contador]);
//cada vez que "contador" se sume, pasa un lugar en el string, por eso se pone contador entre [], porque es lo que hace que cambie de posicion el string
			System.out.println("");
			
			num=leer.nextInt();
			System.out.println("");
			
			suma=suma+num;
			
			contador++;
			
		}
		
		
		total=(double)suma/6;
		System.out.println("La nota media del curso es " + total);
		
		leer.close();
		
	}

}