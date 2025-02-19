package UT6_Platadorma_Streaming;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner (System.in);
		
		int opcion;
		
		System.out.println("ELIGE UN TIPO DE CONTENIDO");
		System.out.println("1. Musica");
		System.out.println("2. Pelicula");
		System.out.println("3. Serie");
		System.out.println("4. Podcast");
		System.out.print("Elije una opcion: ");
		opcion = leer.nextInt();
		
		Reproducible contenido = null;
		
		switch(opcion) {
		case 1:
			contenido = new Musica();
			
			System.out.println();
			System.out.print("Reproducir o pausar: ");
			String eleccion1 = leer.next();
			
			if (eleccion1.equalsIgnoreCase("Reproducir")) {
				contenido.reproducir();
			}else {
				 contenido.pausar();
			}
			
			break;
			
		case 2:
			contenido = new Pelicula();
			
			System.out.println();
			System.out.print("Reproducir o pausar: ");
			String eleccion2 = leer.next();
			
			if (eleccion2.equalsIgnoreCase("Reproducir")) {
				contenido.reproducir();
			}else {
				 contenido.pausar();
			}
			
			break;
			
		case 3:
			contenido = new Serie();
			
			System.out.println();
			System.out.print("Reproducir o pausar: ");
			String eleccion3 = leer.next();
			
			if (eleccion3.equalsIgnoreCase("Reproducir")) {
				contenido.reproducir();
			}else {
				 contenido.pausar();
			}
			
			break;
			
		case 4:
			contenido = new Podcast();
			
			System.out.println();
			System.out.print("Reproducir o pausar: ");
			String eleccion4 = leer.next();
			
			if (eleccion4.equalsIgnoreCase("Reproducir")) {
				contenido.reproducir();
			}else {
				 contenido.pausar();
			}
			
			break;
		}
		
		leer.close();
		
	}

}