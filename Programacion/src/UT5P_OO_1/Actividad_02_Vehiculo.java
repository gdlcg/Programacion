package UT5P_OO_1;

import java.util.Scanner;

public class Actividad_02_Vehiculo {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Indique el modelo del vehiculo");
		System.out.println();
		String modelo = leer.nextLine();
		System.out.println();
		
		System.out.println("Indique la potencia del vehiculo");
		System.out.println();
		double potencia = leer.nextDouble();
		System.out.println();
		
		System.out.println("Indique si el vehiculo tiene cuatro traccion");
		System.out.println();
		boolean rueda = leer.nextBoolean();
		System.out.println();
		
		Vehiculo v = new Vehiculo (modelo);
		v.setPotencia(potencia);
		v.setcRuedas(rueda);
		
		System.out.println("Datos del vehiculo");
		System.out.println();
		System.out.println(v);
		
		leer.close();
		
		
	}

}
