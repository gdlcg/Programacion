package UT5P_OO_1;

import java.util.Scanner;

import ZZPOO_CASA.DVDCine;

public class Actividad_01_DVDCine {

	public static void main(String[] args) { // pelicula
		
		Scanner leer = new Scanner (System.in);
		
		System.out.print("Introduce el título de la película: ");
	    String titulo = leer.nextLine();
	    
	    //System.out.print("Introduce el título original (puede estar vacío): ");
	    //String tituloOriginal = leer.nextLine();

	    System.out.print("Introduce el director de la película: ");
	    String director = leer.nextLine();

	    System.out.print("Introduce los actores principales (separados por comas): ");
	    String repartoInput = leer.nextLine();
	    String reparto = String.join(", ", repartoInput.split(",\\s*"));

	    System.out.print("Introduce el género de la película: ");
	    String genero = leer.nextLine();

	    System.out.print("Introduce la duración de la película (en minutos): ");
	    int duracion = leer.nextInt();
	    leer.nextLine(); // Consumir el salto de línea restante

	    System.out.print("Introduce un resumen de la película: ");
	    String resumen = leer.nextLine();

	    DVDCine pelicula = new DVDCine(titulo, director, reparto, args, genero, duracion, resumen);


        System.out.println("\nFicha de la película:");
        System.out.println(pelicula.muestraDVDCine());

        // Probar métodos adicionales
        System.out.println("\n¿Es un Thriller? " + pelicula.esThriller());
        System.out.println("¿Tiene resumen? " + pelicula.tieneResumen());
        System.out.println("Duración: " + pelicula.muestraDuracion());

        leer.close();
	}

	
	
	
}