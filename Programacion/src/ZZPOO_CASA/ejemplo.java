package ZZPOO_CASA;

import java.util.Scanner;

public class ejemplo {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la película
        System.out.print("Introduce el título de la película: ");
        String titulo = scanner.nextLine();

        System.out.print("Introduce el título original (puede estar vacío): ");
        String tituloOriginal = scanner.nextLine();

        System.out.print("Introduce el director de la película: ");
        String director = scanner.nextLine();

        System.out.print("Introduce los actores principales (separados por comas): ");
        String repartoInput = scanner.nextLine();
        String[] reparto = repartoInput.split(",\\s*");

        System.out.print("Introduce el género de la película: ");
        String genero = scanner.nextLine();

        System.out.print("Introduce la duración de la película (en minutos): ");
        int duracion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Introduce un resumen de la película: ");
        String resumen = scanner.nextLine();

        // Crear un objeto DVDCine
        DVDCine pelicula = new DVDCine(titulo, tituloOriginal, director, reparto, genero, duracion, resumen);

        // Mostrar la ficha de la película
        System.out.println("\nFicha de la película:");
        System.out.println(pelicula.muestraDVDCine());

        // Probar métodos adicionales
        System.out.println("\n¿Es un Thriller? " + pelicula.esThriller());
        System.out.println("¿Tiene resumen? " + pelicula.tieneResumen());
        System.out.println("Duración: " + pelicula.muestraDuracion());

        scanner.close();
    }
}
