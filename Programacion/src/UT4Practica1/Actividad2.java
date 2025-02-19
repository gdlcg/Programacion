package UT4Practica1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		
		
		//creo la lista
		
				ArrayList<String>lista1=new ArrayList<>();
				lista1.add("hola");
				lista1.add("casco");
				lista1.add("casa");
				
				ArrayList <String>lista2=new ArrayList <>();
				lista2.add("ordenador");
				lista2.add("mano");
				lista2.add("raton");
				
				
				//acoplar las dos listas
				
				lista1.addAll(lista2);
				
				Collections.sort(lista1);
				
				System.out.println("La lista acoplada es " + lista1);
				
				//sacar la palabra mas larga
				
				String palabraMasLarga = "";
		        for (String palabra : lista1) {
		            if (palabra.length() > palabraMasLarga.length()) {
		                palabraMasLarga = palabra;
		            }
		        }
		        System.out.println();
		        System.out.println("La palabra más larga de la lista es: " + palabraMasLarga);
		
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		System.out.println("En este programa, ordeanaremos alfabeticamente los nombres de los archivos. Escriba 'fin' para terminar");
		System.out.println();
		
		String archivo;
		
		ArrayList <String> archivos = new ArrayList<>();
		
		Scanner leer = new Scanner (System.in);
		
		while (true) {
			System.out.println("Nombre del archivo: ");
			System.out.println();
			
			archivo = leer.nextLine();
			System.out.println();
			
			if (archivo.equalsIgnoreCase("fin")) {
				break;
			}
			archivos.add(archivo); //añadimos el nombre de los archivos al array llamado "archivos"
		}
		
		Collections.sort(archivos); // para ordenar el array
		
		for (String nombre : archivos) {
			System.out.println(nombre);
			System.out.println();
		}
		
		
		
		leer.close();
	}

}
