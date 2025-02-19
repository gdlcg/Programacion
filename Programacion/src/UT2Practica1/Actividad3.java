package UT2Practica1;

import java.util.Scanner;

public class Actividad3 {
	
	public static void main(String[] args) {
	
	Scanner leer = new Scanner (System.in);
	
	double radio;
	double area;
	System.out.println("Introduzca el radio (en centimetros) de un circulo para calcular el area");
	radio=leer.nextDouble();
	area = Math.PI * Math.pow(radio, 2);
	System.out.println("El area del circulo es de " + area +" centimetros");
	leer.close();
	}
}