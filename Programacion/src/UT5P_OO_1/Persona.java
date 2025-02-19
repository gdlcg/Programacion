package UT5P_OO_1;

import java.util.Scanner;

public class Persona {
	
	Scanner leer = new Scanner (System.in);
	
	private String nombre;
	private int edad;
	
	
	public void datos() {
		System.out.print("Ingrese su nombre: ");
		nombre = leer.nextLine();
		System.out.println("Ingrese su edad: ");
		edad = leer.nextInt();
	}
	
	
	public String mostrar() {
		return nombre + ", " + edad + " años"; 
	}
	
}